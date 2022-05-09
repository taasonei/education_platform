package com.github.taasonei.educationplatform.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.github.taasonei.educationplatform.databinding.CategoryItemBinding
import com.github.taasonei.educationplatform.model.Category

class CategoryViewHolder(
    private val binding: CategoryItemBinding,
    private val onClick: (View, Int) -> Unit
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(category: Category) {
        binding.categoryItem.apply {
            background.setTint(resources.getColor(category.color, context.theme))
            text = category.title
        }
        binding.categoryItem.setOnClickListener { view -> onClick(view, category.id) }
    }

}