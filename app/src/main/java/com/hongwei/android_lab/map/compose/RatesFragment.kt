package com.hongwei.android_lab.map.compose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hongwei.android_lab.databinding.FragmentCompactBinding
import com.hongwei.android_lab.map.compose.theme.DemoTheme
import com.hongwei.android_lab.map.compose.view.RatesPage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class RatesFragment @Inject constructor() : Fragment() {
    private var _binding: FragmentCompactBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCompactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.composeView.setContent {
            DemoTheme {
                RatesPage()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}