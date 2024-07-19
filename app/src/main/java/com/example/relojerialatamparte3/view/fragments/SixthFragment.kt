package com.example.relojerialatamparte3.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.relojerialatamparte3.R
import com.example.relojerialatamparte3.databinding.FragmentSeventhBinding
import com.example.relojerialatamparte3.databinding.FragmentSixthBinding

class SixthFragment : Fragment() {
    private var _binding: FragmentSixthBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentSixthBinding.inflate(inflater, container, false)
        return binding.root
    }
}