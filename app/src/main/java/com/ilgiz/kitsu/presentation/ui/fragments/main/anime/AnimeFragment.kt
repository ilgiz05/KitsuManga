package com.ilgiz.kitsu.presentation.ui.fragments.main.anime

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.ilgiz.kitsu.R
import com.ilgiz.kitsu.presentation.base.BaseFragment
import com.ilgiz.kitsu.databinding.FragmentAnimeBinding
import com.ilgiz.kitsu.presentation.exntensions.directionsSafeNavigation
import com.ilgiz.kitsu.presentation.ui.adapters.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter(this::onClick)
    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = animeAdapter
    }

    override fun setupObservers() {
        viewModel.fetchAnime().spectatePaging(
            error = {
                Log.e("tag", it)
            },
            success = {
                animeAdapter.submitData(it)
            })
    }

    private fun onClick(id: String, trailerid: String?) {
        findNavController().directionsSafeNavigation(
            AnimeFragmentDirections.actionAnimeFragmentToAnimeDetailedFragment2(
                id, trailerid
            )
        )
    }
}