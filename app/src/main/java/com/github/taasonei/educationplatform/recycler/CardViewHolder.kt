package com.github.taasonei.educationplatform.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.github.taasonei.educationplatform.databinding.CardItemBinding
import com.github.taasonei.educationplatform.model.CardData
import com.github.taasonei.educationplatform.model.Lecture

class CardViewHolder(
    private val binding: CardItemBinding,
    private val onClick: (View, Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(cardData: CardData) {
        when (cardData) {
            is Lecture -> bindLectureItem(cardData)
        }
    }

    private fun bindLectureItem(lecture: Lecture) {
        binding.cardTitle.text = lecture.title
        binding.cardSubtitle.text = lecture.subtitle
        binding.cardId.setOnClickListener { onClick }
    }

}
