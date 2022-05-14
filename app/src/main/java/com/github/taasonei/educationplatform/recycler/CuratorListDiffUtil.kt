package com.github.taasonei.educationplatform.recycler

import androidx.recyclerview.widget.DiffUtil
import com.github.taasonei.educationplatform.model.Curator

class CuratorListDiffUtil : DiffUtil.ItemCallback<Curator>() {

    override fun areItemsTheSame(oldItem: Curator, newItem: Curator): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Curator, newItem: Curator): Boolean {
        return oldItem.name == newItem.name &&
                oldItem.skills == newItem.skills &&
                oldItem.image == newItem.image
    }

}