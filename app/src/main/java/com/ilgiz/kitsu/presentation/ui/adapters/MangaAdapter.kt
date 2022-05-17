package com.ilgiz.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ilgiz.kitsu.presentation.base.BaseDiffUtil
import com.ilgiz.kitsu.databinding.ItemMangaBinding
import com.ilgiz.kitsu.presentation.models.manga.MangaDataUI

class MangaAdapter(
    private val onClick: (id: String) -> Unit,
) :
    PagingDataAdapter<MangaDataUI, MangaAdapter.MangaViewHolder>(BaseDiffUtil()) {

    inner class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(mangaData: MangaDataUI) {
            binding.imManga.setImage(mangaData.mangaDto.posterImage.original)
            binding.root.setOnClickListener {
                onClick(mangaData.id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            (ItemMangaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ))
        )
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }
}