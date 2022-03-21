package com.example.challengetigaafifuddin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challengetigaafifuddin.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
//    lateinit var binding: FragmentFirstBinding
    private var binding:FragmentFirstBinding? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = FragmentFirstBinding.inflate(layoutInflater)
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = FragmentFirstBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
//        binding.btnToScreen2.setOnClickListener {
//        val intentToSecondFragment = Intent(this,SecondFragment::class.java)
//        startActivity(intentToSecondFragment)
//        }
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnToScreen2?.setOnClickListener{
        view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}