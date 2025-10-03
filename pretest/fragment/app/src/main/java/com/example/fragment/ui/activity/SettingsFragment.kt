package com.example.fragment.ui.activity

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment.R
import com.example.fragment.data.AppConfig

class SettingsFragment : Fragment() {

    companion object {
        fun newInstance() = SettingsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_settings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val switch = view.findViewById<Switch>(R.id.switchOnlyFavorite)
        switch.isChecked = AppConfig.onlyFavorite

        switch.setOnCheckedChangeListener { _, isChecked ->
            AppConfig.onlyFavorite = isChecked
            Toast.makeText(requireContext(), "Only Favorite: $isChecked", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(HomeFragment.newInstance(), addToBackStack = false)
        }
    }
}