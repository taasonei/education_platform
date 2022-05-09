package com.github.taasonei.educationplatform.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.github.taasonei.educationplatform.databinding.CategoryItemBinding
import com.github.taasonei.educationplatform.model.Category

class CategoryListAdapter(private val onClick: (View, Int) -> Unit) :
    ListAdapter<Category, CategoryViewHolder>(CategoryListDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            CategoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onClick
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}