package com.example.challengetigaafifuddin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challengetigaafifuddin.databinding.FragmentFourBinding


class FourFragment : Fragment() {
private var binding:FragmentFourBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourBinding.inflate(inflater,container,false)
        val view = binding!!.root
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.btn4To3.setOnClickListener { view ->
            val moveFragmentFourToThird = FourFragmentDirections.actionFourFragmentToThirdFragment()
            val sisiA = binding?.etUsia2!!.text.toString().toInt()
            val sisiB = binding?.etAlamat2!!.text.toString().toInt()
            val sisiC = binding?.etPekerjaan2!!.text.toString().toInt()
           val nama = FourFragmentArgs.fromBundle(arguments as Bundle).nama

            moveFragmentFourToThird.name = nama
            moveFragmentFourToThird.sisiA = sisiA
            moveFragmentFourToThird.sisiB = sisiB
            moveFragmentFourToThird.sisiC = sisiC
            view.findNavController().navigate(moveFragmentFourToThird)



        }



    }
}