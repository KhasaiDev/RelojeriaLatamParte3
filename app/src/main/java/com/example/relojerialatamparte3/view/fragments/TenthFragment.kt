package com.example.relojerialatamparte3.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.relojerialatamparte3.R
import com.example.relojerialatamparte3.databinding.FragmentSixthBinding
import com.example.relojerialatamparte3.databinding.FragmentTenthBinding

class TenthFragment : Fragment() {
    private var _binding: FragmentTenthBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentTenthBinding.inflate(inflater, container, false)
        return binding.root
    }
}