package com.github.taasonei.educationplatform.model

import androidx.annotation.DrawableRes
import com.github.taasonei.educationplatform.R
import java.time.LocalTime

data class Curator(
    val id: Int,
    val name: String,
    val skills: List<String>,
    val description: String,
    @DrawableRes val image: Int,
    val freeTime: List<LocalTime>
) : CardData

private val timeList =
    listOf(
        LocalTime.of(10, 0),
        LocalTime.of(11, 0),
        LocalTime.of(12, 0),
        LocalTime.of(13, 0),
        LocalTime.of(14, 0),
        LocalTime.of(15, 0),
    )

val curators = listOf<Curator>(
    Curator(
        0,
        "Инна Мориц",
        listOf("C#", "Xamarin", "C++", "Android NDK"),
        "Описание куратора",
        R.drawable.curator_0,
        timeList
    ),
    Curator(
        1,
        "Татьяна Белова",
        listOf("Flutter", "Dart", "Kotlin", "KMM"),
        "Описание куратора 222222222222222222222222222222222",
        R.drawable.curator_1,
        timeList
    ),
    Curator(
        2,
        "Ольга Доржиева",
        listOf("Android", "Java", "ОПП", "SOLID"),
        "Описание куратора Описание куратора Описание куратора Описание куратора",
        R.drawable.curator_2,
        timeList
    ),
    Curator(
        3,
        "Елена Иванова",
        listOf("Алгоритмы и структуры данных"),
        "кандидат технических наук, доцент кафедры интеллектуальных систем и защиты информации СПБГУПТД, доцент кафедры информатики СПБГЭУ",
        R.drawable.curator_3,
        timeList
    ),
)


