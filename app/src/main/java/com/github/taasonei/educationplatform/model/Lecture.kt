package com.github.taasonei.educationplatform.model

import androidx.annotation.DrawableRes
import com.github.taasonei.educationplatform.R
import java.time.LocalDateTime

data class Lecture(
    val id: Int,
    val title: String,
    val subtitle: String,
    @DrawableRes val image: Int,
    val dateTime: LocalDateTime,
    val isRecorded: Boolean
) : CardData

val lectures = listOf<Lecture>(
    Lecture(
        id = 0,
        title = "Создание макетов в фигме",
        subtitle = "Пошаговая инструкция",
        image = R.drawable.ic_launcher_foreground,
        dateTime = LocalDateTime.now(),
        isRecorded = false
    ),
    Lecture(
        id = 1,
        title = "Регрессионное тестирование приложений",
        subtitle = "Полное и частичное, проблемы, выбор тестов",
        image = R.drawable.ic_launcher_foreground,
        dateTime = LocalDateTime.now(),
        isRecorded = false
    ),
    Lecture(
        id = 2,
        title = "Flutter для начинающих",
        subtitle = "Разработка мобильных приложений",
        image = R.drawable.ic_launcher_foreground,
        dateTime = LocalDateTime.now(),
        isRecorded = true
    ),
    Lecture(
        id = 3,
        title = " UX/UI-дизайн",
        subtitle = "Проектирование пользовательских интерфейсов",
        image = R.drawable.ic_launcher_foreground,
        dateTime = LocalDateTime.now(),
        isRecorded = false
    ),
)