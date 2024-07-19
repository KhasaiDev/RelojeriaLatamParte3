package com.example.relojerialatamparte3.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.relojerialatamparte3.R
import com.example.relojerialatamparte3.databinding.FragmentForthBinding
import com.example.relojerialatamparte3.databinding.FragmentNinethBinding

class NinethFragment : Fragment() {
    private var _binding: FragmentNinethBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentNinethBinding.inflate(inflater, container, false)
        return binding.root
    }
}