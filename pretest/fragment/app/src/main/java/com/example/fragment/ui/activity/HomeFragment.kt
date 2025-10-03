package com.example.fragment.ui.activity

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.fragment.R
import com.example.fragment.data.MockBooks
import com.example.fragment.adapter.BookAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.data.AppConfig

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewBooks)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val listToShow = if (AppConfig.onlyFavorite) {
            MockBooks.items.filter { it.isFavorite }
        } else {
            MockBooks.items
        }

        recyclerView.adapter = BookAdapter(listToShow) { position ->
            val book = listToShow[position]
            val realIndex = MockBooks.items.indexOf(book)

            (requireActivity() as MainActivity).navigateTo(
                DetailFragment.newInstance(realIndex),
                addToBackStack = true
            )
        }

        view.findViewById<View>(R.id.btnOpenSettings).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(
                SettingsFragment.newInstance(),
                addToBackStack = true
            )
        }
    }
}