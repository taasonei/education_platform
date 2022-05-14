package com.github.taasonei.educationplatform.recycler

import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.github.taasonei.educationplatform.databinding.CardItemBinding
import com.github.taasonei.educationplatform.model.CardData
import com.github.taasonei.educationplatform.model.Curator
import com.github.taasonei.educationplatform.model.Lecture

class CardViewHolder(
    private val binding: CardItemBinding,
    private val onClick: (View, Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(cardData: CardData) {
        when (cardData) {
            is Lecture -> bindLectureItem(cardData)
            is Curator -> bindCuratorItem(cardData)
        }
    }

    private fun bindCuratorItem(curator: Curator) {
        binding.cardTitle.text = curator.name
        binding.cardSubtitle.text = curator.skills.joinToString()
        binding.cardImage.setImageDrawable(
            AppCompatResources.getDrawable(
                binding.root.context,
                curator.image
            )
        )
        binding.cardId.setOnClickListener { view -> onClick(view, curator.id) }
    }

    private fun bindLectureItem(lecture: Lecture) {
        binding.cardTitle.text = lecture.title
        binding.cardSubtitle.text = lecture.subtitle
        binding.cardId.setOnClickListener { view -> onClick(view, lecture.id) }
    }

}
