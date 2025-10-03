package com.example.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.data.Book
import com.example.fragment.R

class BookAdapter(
    private val items: List<Book>,
    private val onItemClick: (Int) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tvItemTitle)
        val author: TextView = view.findViewById(R.id.tvItemAuthor)
        val favorite: TextView = view.findViewById(R.id.tvItemFavorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = items[position]
        holder.title.text = book.title
        holder.author.text = "by ${book.author}"
        holder.favorite.text = if (book.isFavorite) "★ Favorite" else "—"

        holder.itemView.setOnClickListener { onItemClick(position) }
    }

    override fun getItemCount(): Int = items.size
}
