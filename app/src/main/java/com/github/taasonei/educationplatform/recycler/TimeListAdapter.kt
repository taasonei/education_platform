package com.github.taasonei.educationplatform.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.github.taasonei.educationplatform.R
import com.github.taasonei.educationplatform.databinding.TimeItemBinding
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.time.Duration.Companion.minutes

class TimeListAdapter : ListAdapter<LocalTime, TimeViewHolder>(TimeDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeViewHolder {
        return TimeViewHolder(
            TimeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: TimeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class TimeViewHolder(private val binding: TimeItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(time: LocalTime) {
        binding.freeTime.text = time.format(DateTimeFormatter.ofPattern("HH:mm"))
    }

}

class TimeDiffUtil : DiffUtil.ItemCallback<LocalTime>() {

    override fun areItemsTheSame(oldItem: LocalTime, newItem: LocalTime): Boolean {
        return oldItem.hour == newItem.hour && oldItem.minute == newItem.minute
    }

    override fun areContentsTheSame(oldItem: LocalTime, newItem: LocalTime): Boolean {
        return oldItem.hour == newItem.hour && oldItem.minute == newItem.minute
    }
}