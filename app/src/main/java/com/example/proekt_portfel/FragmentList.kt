package com.example.proekt_portfel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.proekt_portfel.databinding.ActivityMainBinding
import com.example.proekt_portfel.databinding.FragmentListBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentList : BottomSheetDialogFragment() {


    private var _binding: FragmentListBinding? = null
    private val binding: FragmentListBinding
        get() = _binding ?: throw RuntimeException("FragmentListBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
}