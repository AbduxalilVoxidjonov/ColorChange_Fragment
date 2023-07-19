package com.example.fragment_homework1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragment_homework1.databinding.FragmentColorItemBinding

class Fragment_item_color : Fragment() {
    private lateinit var binding: FragmentColorItemBinding

    // TODO: Rename and change types of parameters
    private var param1: String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentColorItemBinding.inflate(layoutInflater, container, false)

        binding.apply {
            color1.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("1")).commit()
            }
            color2.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("2")).commit()
            }
            color3.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("3")).commit()
            }
            color4.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("4")).commit()
            }
            color5.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("5")).commit()
            }
            color6.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("6")).commit()
            }
            color7.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("7")).commit()
            }
            color8.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("8")).commit()
            }
            color9.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("9")).commit()
            }
            color10.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("10")).commit()
            }
            color11.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance("11")).commit()
            }
            color12.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.container,Fragment_Color.newInstance(param1)).commit()
            }
        }

        return binding.root

    }

}