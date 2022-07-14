package com.example.blackmoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.blackmoon.databinding.FragmentTermBinding

class TermFragment : Fragment() {


    lateinit var binding: FragmentTermBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTermBinding.inflate(inflater)

        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        val term = arguments?.getSerializable("term") as com.example.blackmoon.database.Term
        binding.nameTv.setText("# ${term.name}")
        binding.contentTv.setText(term.description)
        binding.back.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

}