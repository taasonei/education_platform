package com.github.taasonei.educationplatform.model

import androidx.annotation.ColorRes
import com.github.taasonei.educationplatform.R

data class Category(
    val id: Int,
    val title: String,
    @ColorRes val color: Int
)

val categoryList = listOf<Category>(
    Category(0, "Рукоделие", R.color.handcraft),
    Category(1, "Спорт", R.color.sport),
    Category(2, "Маркетинг", R.color.marketing),
    Category(3, "Иностранные языки", R.color.languages),
    Category(4, "Эмиграция", R.color.emigration),
    Category(5, "Дизайн", R.color.design),
    Category(6, "Программирование", R.color.programming)
)