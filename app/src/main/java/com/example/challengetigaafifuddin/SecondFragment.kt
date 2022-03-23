package com.example.challengetigaafifuddin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challengetigaafifuddin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var binding:FragmentSecondBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container, false)
        val view = binding!!.root
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnToScreen3?.setOnClickListener{view ->
        val moveFragmentThird = SecondFragmentDirections.actionSecondFragmentToThirdFragment(Parcelable(0,0,0))
        val nama= binding!!.etNama.text.toString()

        moveFragmentThird.name = nama
        view.findNavController().navigate(moveFragmentThird)

        }
    }
}