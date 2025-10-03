package com.example.fragment.data

data class Book(
    val title: String,
    val author: String,
    val isFavorite: Boolean
)

object MockBooks {
    val items: List<Book> = listOf(
        Book("Effective Java", "Joshua Bloch", true),
        Book("Kotlin Programming", "Venkat Subramaniam", false),
        Book("Android Development", "Ray Wenderlich Team", true)
    )
}