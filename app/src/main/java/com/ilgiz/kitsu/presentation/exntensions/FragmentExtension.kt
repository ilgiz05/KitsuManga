package com.ilgiz.kitsu.presentation.exntensions

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ilgiz.kitsu.R

fun Fragment.mainNavController() =
    requireActivity().findNavController(R.id.nav_host_fragment)