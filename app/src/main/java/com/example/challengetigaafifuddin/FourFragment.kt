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
            val usia = binding?.etUsia2!!.text.toString().toInt()
            val alamat = binding?.etAlamat2!!.text.toString()
            val pekerjaan = binding?.etPekerjaan2!!.text.toString()

            moveFragmentFourToThird.usia = usia
            moveFragmentFourToThird.alamat = alamat
            moveFragmentFourToThird.pekerjaan = pekerjaan
            view.findNavController().navigate(moveFragmentFourToThird)



        }



    }
}