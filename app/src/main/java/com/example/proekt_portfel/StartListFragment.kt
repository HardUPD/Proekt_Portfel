package com.example.proekt_portfel

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.example.proekt_portfel.databinding.ActivityMainBinding
import com.example.proekt_portfel.databinding.FragmentStartListBinding


class StartListFragment : Fragment() {

    lateinit var binding: FragmentStartListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvText.setOnClickListener{
            MAIN.navController.navigate(R.id.action_startListFragment2_to_fragment_Setting)
        }
    }
}



