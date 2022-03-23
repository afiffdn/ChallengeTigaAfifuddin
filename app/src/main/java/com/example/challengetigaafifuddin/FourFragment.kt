package com.example.challengetigaafifuddin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challengetigaafifuddin.databinding.FragmentFourBinding
import com.example.challengetigaafifuddin.databinding.FragmentThirdBinding


class FourFragment : Fragment() {
private var _binding:FragmentFourBinding? = null
private val binding get() =_binding
private val args:FourFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourBinding.inflate(inflater,container,false)
//        val view = binding!!.root
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding!!.btn4To3.setOnClickListener { view ->
//            val moveFragmentFourToThird = FourFragmentDirections.actionFourFragmentToThirdFragment()
//            val sisiA = binding?.etUsia2!!.text.toString().toInt()
//            val sisiB = binding?.etAlamat2!!.text.toString().toInt()
//            val sisiC = binding?.etPekerjaan2!!.text.toString().toInt()
//           val nama = FourFragmentArgs.fromBundle(arguments as Bundle).nama
//
//            moveFragmentFourToThird.name = nama
//            moveFragmentFourToThird.sisiA = sisiA
//            moveFragmentFourToThird.sisiB = sisiB
//            moveFragmentFourToThird.sisiC = sisiC
//            view.findNavController().navigate(moveFragmentFourToThird)
//
//
//
//        }
        binding!!.btn4To3.setOnClickListener { view ->

            val hitungsegitiga = Parcelable(
                binding!!.etUsia2.text.toString().toInt(),
                binding!!.etAlamat2.text.toString().toInt(),
                binding!!.etPekerjaan2.text.toString().toInt()

            )

            val moveFragmentFourToThird = FourFragmentDirections.actionFourFragmentToThirdFragment(hitungsegitiga)
            moveFragmentFourToThird.name = args.name
            view.findNavController().navigate(moveFragmentFourToThird)

        }



        }



    }
