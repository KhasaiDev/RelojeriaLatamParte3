package com.example.relojerialatamparte3.view.lobby

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.relojerialatamparte3.R
import com.example.relojerialatamparte3.databinding.FragmentLobbyBinding
import com.example.relojerialatamparte3.databinding.FragmentOtherBinding
import com.example.relojerialatamparte3.view.fragments.EighthFragment
import com.example.relojerialatamparte3.view.fragments.FifthFragment
import com.example.relojerialatamparte3.view.fragments.ForthFragment
import com.example.relojerialatamparte3.view.fragments.NinethFragment
import com.example.relojerialatamparte3.view.fragments.OtherFragment
import com.example.relojerialatamparte3.view.fragments.SecondFragment
import com.example.relojerialatamparte3.view.fragments.SeventhFragment
import com.example.relojerialatamparte3.view.fragments.SixthFragment
import com.example.relojerialatamparte3.view.fragments.TenthFragment
import com.example.relojerialatamparte3.view.fragments.ThirdFragment
import com.example.relojerialatamparte3.view.lobby.adapter.CardAdapter
import com.example.relojerialatamparte3.view.lobby.adapter.Item

class LobbyFragment : Fragment() {
    private var _binding: FragmentLobbyBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentLobbyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val itemList = listOf(
            Item(R.drawable.sucursal_1, "Cicero Store", "Lunes a Viernes desde 09:00 a 20:00\nFin de semana CERRADO", fragment = OtherFragment()),
            Item(R.drawable.sucursal_2, "Li Europan lingues Store", "Lunes a Viernes desde 09:00 a 20:00\nFin de semana CERRADO", fragment = SecondFragment()),
            Item(R.drawable.sucursal_3, "Kafka Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = ThirdFragment()),
            Item(R.drawable.sucursal_3, "Love Craft Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = ForthFragment()),
            Item(R.drawable.sucursal_3, "The Ancient Mariner Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = FifthFragment()),
            Item(R.drawable.sucursal_3, "The Leather Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = SixthFragment()),
            Item(R.drawable.sucursal_3, "A Tiempo Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = SeventhFragment()),
            Item(R.drawable.sucursal_3, "Black Klee Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = EighthFragment()),
            Item(R.drawable.sucursal_3, "Watcher Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = NinethFragment()),
            Item(R.drawable.sucursal_3, "Jauggernaut Store", "Lunes a Viernes desde 09:00 a 20:00", fragment = TenthFragment()),
        )
        //implementacion con adapter tradicional
        val adapter = CardAdapter(itemList)
        binding.cardRecyclerView.adapter = adapter
        binding.cardRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}