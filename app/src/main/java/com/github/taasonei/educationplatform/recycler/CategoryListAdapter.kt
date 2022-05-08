package com.github.taasonei.educationplatform.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.github.taasonei.educationplatform.databinding.CategoryItemBinding
import com.github.taasonei.educationplatform.model.Category

class CategoryListAdapter :
    ListAdapter<Category, CategoryListAdapter.CategoryViewHolder>(CategoryListDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            CategoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class CategoryViewHolder(val binding: CategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category) {
            binding.categoryItem.apply {
                background.setTint(resources.getColor(category.color, context.theme))
                text = category.title
            }
        }
    }
}