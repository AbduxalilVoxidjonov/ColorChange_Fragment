package com.example.fragment_homework1

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragment_homework1.databinding.FragmentColorBinding

private const val ARG_PARAM1 = "param1"

class Fragment_Color : Fragment() {

    private var param1: String?=""

private  lateinit var binding :FragmentColorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments.let {
            param1 = it?.getString(ARG_PARAM1)
        }
    }

@SuppressLint("ResourceAsColor")
override fun onResume() {
    super.onResume()

    if (param1 != null) {
        when(param1){
            "1"->{binding.fragmentcolors.setBackgroundResource(R.color.color1)}
            "2"->{binding.fragmentcolors.setBackgroundResource(R.color.color2)}
            "3"->{binding.fragmentcolors.setBackgroundResource(R.color.color3)}
            "4"->{binding.fragmentcolors.setBackgroundResource(R.color.color4)}
            "5"->{binding.fragmentcolors.setBackgroundResource(R.color.color5)}
            "6"->{binding.fragmentcolors.setBackgroundResource(R.color.color6)}
            "7"->{binding.fragmentcolors.setBackgroundResource(R.color.color7)}
            "8"->{binding.fragmentcolors.setBackgroundResource(R.color.color8)}
            "9"->{binding.fragmentcolors.setBackgroundResource(R.color.color9)}
            "10"->{binding.fragmentcolors.setBackgroundResource(R.color.color10)}
            "11"->{binding.fragmentcolors.setBackgroundResource(R.color.color11)}
            "12"->{binding.fragmentcolors.setBackgroundResource(R.color.color12)}
        }
    }
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentColorBinding.inflate(layoutInflater)

        binding.editColor.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.container, Fragment_item_color())
                .commit()
        }

        return binding.root
    }
    companion object {
        fun newInstance(param1: String) =
            Fragment_Color().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }

    }
}