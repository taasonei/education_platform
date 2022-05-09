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

private val handcraft = listOf<Category>(
    Category(0, "Шитье", R.color.sewing),
    Category(1, "Вышивка", R.color.embroidery),
    Category(2, "Украшения", R.color.decorations),
    Category(3, "Керамика", R.color.ceramics)
)
private val sport = listOf<Category>(
    Category(0, "Фитнес", R.color.fitness),
    Category(1, "Йога", R.color.yoga),
    Category(2, "ЛФК", R.color.physiotherapy),
    Category(3, "Пилатес", R.color.pilates),
    Category(4, "Стретчинг", R.color.stretching)
)
private val marketing = listOf<Category>(
    Category(0, "SMM", R.color.smm),
    Category(1, "Копирайтинг", R.color.copywriting),
    Category(2, "PR-менеджер", R.color.pr_management),
    Category(3, "Бренд-менежер", R.color.brand_management),
    Category(4, "SEO-оптимизатор", R.color.seo_optimization),
    Category(5, "PPC-специалист", R.color.ppc)
)
private val languages = listOf<Category>(
    Category(0, "Английский", R.color.english),
    Category(1, "Испанский", R.color.spanish),
    Category(2, "Китайский", R.color.chinese),
    Category(3, "Японский", R.color.japanese),
    Category(4, "Португальский", R.color.portugese),
    Category(5, "Норвежский", R.color.norvegian)
)
private val emigration = listOf<Category>(
    Category(0, "Европа", R.color.europe),
    Category(1, "США", R.color.usa),
    Category(2, "Латинская Америка", R.color.latin_america),
    Category(3, "Австралия", R.color.australia),
    Category(4, "Африка", R.color.africa),
    Category(5, "Азия", R.color.asia)
)
private val design = listOf<Category>(
    Category(0, "Графический дизайн", R.color.graphic_design),
    Category(1, "Веб-дизайн", R.color.web_design),
    Category(2, "Моушн-дизайн", R.color.motion_design),
    Category(3, "Дизайн интерьеров", R.color.interior_design),
    Category(4, "Гейм-дизайн", R.color.game_design),
    Category(5, "Продуктовый дизайн", R.color.product_design)
)
private val programming = listOf<Category>(
    Category(0, "Веб-разработка", R.color.web_development),
    Category(1, "Мобильная разработка", R.color.mobile_development),
    Category(2, "Аналитика", R.color.analytics)
)

val subcategoryList: List<List<Category>> = listOf(
    handcraft,
    sport,
    marketing,
    languages,
    emigration,
    design,
    programming
)