package com.example.challengetigaafifuddin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challengetigaafifuddin.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private var binding: FragmentThirdBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        val view = binding?.root
        // Inflate the layout for this fragment
        return view
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val umur = ThirdFragmentArgs.fromBundle(arguments as Bundle).usia
        var biodata = ThirdFragmentArgs.fromBundle(arguments as Bundle).name
        if (umur > 0){
            val nilai = if (umur % 2 == 0) "\nUsia Anda Genap" else "\nUsia anda Ganjil"
            val alamat = "\n${ThirdFragmentArgs.fromBundle(arguments as Bundle).alamat}"
            val pekerjaan = "\n${ThirdFragmentArgs.fromBundle(arguments as Bundle).pekerjaan}"
            biodata += nilai + alamat + pekerjaan


        }
            binding?.tvNama!!.text = biodata
//            val nama=ThirdFragmentArgs.fromBundle(arguments as Bundle).name
//            //nampilin data dari fragment 2
           // binding?.tvNama!!.text = biodata

            //button ke fragment 4
            binding!!.btnToScreen4.setOnClickListener { view ->
                val moveFragmentFour = ThirdFragmentDirections.actionThirdFragmentToFourFragment()
                val nama= binding!!.tvNama.text.toString()

                moveFragmentFour.nama = nama
                view.findNavController().navigate(moveFragmentFour)

            }




//        //ngambil data dari fragment 2
//        var nama=ThirdFragmentArgs.fromBundle(arguments as Bundle).name
//        //nampilin data dari fragment 2
//        binding?.tvNama!!.text = nama
//        //button ke fragment 4
//        binding!!.btnToScreen4.setOnClickListener {
//            view.findNavController().navigate(R.id.action_thirdFragment_to_fourFragment)
//        }
        //dari fragment 4

//        val umur = 5
//        val ganjil = umur % 2


//        if (ThirdFragmentArgs.fromBundle(arguments as Bundle).usia % 2 == 0 ){
////            val usia = ThirdFragmentArgs.fromBundle(arguments as Bundle).usia
//            val alamat = ThirdFragmentArgs.fromBundle(arguments as Bundle).alamat
//            val pekerjaan = ThirdFragmentArgs.fromBundle(arguments as Bundle).pekerjaan
//
//            binding!!.tvUsia.text = "Usia anda bernilai Genap"
//            binding!!.tvAlamat.text = alamat
//            binding!!.tvPekerjaan.text = pekerjaan
//        }else{
//            val alamat = ThirdFragmentArgs.fromBundle(arguments as Bundle).alamat
//            val pekerjaan = ThirdFragmentArgs.fromBundle(arguments as Bundle).pekerjaan
//            binding!!.tvUsia.text = "Usia anda bernilai Ganjil"
//            binding!!.tvAlamat.text = alamat
//            binding!!.tvPekerjaan.text = pekerjaan
//        }
 }

}