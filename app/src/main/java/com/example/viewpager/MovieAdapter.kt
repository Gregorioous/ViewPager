package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MoviesAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                Shreck1Fragment()
            }
            1 -> {
                DumbFragment()
            }
            2 -> {
                BoratFragment()
            }
            3 -> {
                TranscendanceFragment()
            }
            else -> {
                Shreck1Fragment()
            }
        }
    }
}
