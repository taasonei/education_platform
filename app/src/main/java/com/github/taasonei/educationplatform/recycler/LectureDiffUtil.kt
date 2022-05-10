package com.github.taasonei.educationplatform.recycler

import androidx.recyclerview.widget.DiffUtil
import com.github.taasonei.educationplatform.model.Lecture

class LectureDiffUtil : DiffUtil.ItemCallback<Lecture>() {

    override fun areItemsTheSame(oldItem: Lecture, newItem: Lecture): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Lecture, newItem: Lecture): Boolean {
        return oldItem.title == newItem.title
                && oldItem.subtitle == newItem.subtitle
                && oldItem.image == newItem.image
    }

}
