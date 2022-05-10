package com.github.taasonei.educationplatform.model

import java.time.LocalDateTime

sealed class CardData

data class Lecture(
    val id: Int,
    val title: String,
    val subtitle: String,
    val image: String,
    val data: LocalDateTime,
    val isRecorded: Boolean
) : CardData()

val lectures = listOf<Lecture>(
    Lecture(
        id = 0,
        title = "Создание макетов в фигме",
        subtitle = "Пошаговая инструкция",
        image = "",
        data = LocalDateTime.now(),
        isRecorded = false
    ),
    Lecture(
        id = 1,
        title = "Регрессионное тестирование приложений",
        subtitle = "Полное и частичное, проблемы, выбор тестов",
        image = "",
        data = LocalDateTime.now(),
        isRecorded = false
    ),
    Lecture(
        id = 2,
        title = "Flutter для начинающих",
        subtitle = "Разработка мобильных приложений",
        image = "",
        data = LocalDateTime.now(),
        isRecorded = true
    ),
    Lecture(
        id = 3,
        title = " UX/UI-дизайн",
        subtitle = "Проектирование пользовательских интерфейсов",
        image = "",
        data = LocalDateTime.now(),
        isRecorded = false
    ),
)