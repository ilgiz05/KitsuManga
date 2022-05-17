package com.ilgiz.kitsu.presentation.ui.fragments.main.anime.detailed

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.ilgiz.kitsu.R
import com.ilgiz.kitsu.presentation.base.BaseFragment
import com.ilgiz.kitsu.databinding.FragmentAnimeDetailedBinding
import com.ilgiz.kitsu.presentation.ui.adapters.GenresAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeDetailedFragment :
    BaseFragment<FragmentAnimeDetailedBinding, AnimeDetailedViewModel>(R.layout.fragment_anime_detailed) {
    override val binding by viewBinding(FragmentAnimeDetailedBinding::bind)
    private val genresAdapter = GenresAdapter()
    override val viewModel: AnimeDetailedViewModel by viewModels()
    private val args: AnimeDetailedFragmentArgs by navArgs()

    override fun setupRequest() {
        viewModel.fetchADetailedAnime(args.id)
        viewModel.fetchGenres(args.id)
    }

    override fun setupObservers() {
        subscribeToAnimeDetailed()
        subscribeToGenres()
        showCategoryChips()

    }

    private fun subscribeToGenres() {
        viewModel.animeGenresState.collectUiState(success = {
            binding.recyclerview.adapter = genresAdapter
            genresAdapter.submitList(it.data)

        })
    }

    private fun showCategoryChips() {

    }

    private fun subscribeToAnimeDetailed() {
        viewModel.animeDetailedState.collectUiState(success = {
            binding.apply {
                it.apply {
                    ivCover.setImage(data.animeDto.coverImage?.original)
                    imPoster.setImage(data.animeDto.posterImage?.medium)
                    tvSubtype.text = data.animeDto.subtype?.uppercase()
                    tvYear.text = data.animeDto.createdAt
                    tvTitle.text = data.animeDto.titles?.en
                    tvSynopsis.text = data.animeDto.synopsis
                    tvAverageRating.text = "${data.animeDto.averageRating}%"
                    tvRating.text = "Rank #${data.animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${data.animeDto.popularityRank}"
                    data.animeDto.youtubeVideoId?.let {
                        binding.btnYoutubeVideo.isVisible = true
                    }
                }
            }
        }, error = { Log.e("tag", it) }
        )
    }

    override fun setupListeners() {
        openVideo()
    }

    private fun openVideo() {
        binding.btnYoutubeVideo.setOnClickListener {
            this.startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse("vnd.youtube:${args.trailerId}")))
        }

    }
}