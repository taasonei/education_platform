package com.github.taasonei.educationplatform.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.github.taasonei.educationplatform.databinding.CardItemBinding
import com.github.taasonei.educationplatform.model.Curator

class CuratorListAdapter(private val onClick: (View, Int) -> Unit) :
    ListAdapter<Curator, CardViewHolder>(CuratorListDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            CardItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onClick
        )
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}
