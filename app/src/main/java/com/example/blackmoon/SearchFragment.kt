package com.example.blackmoon

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.blackmoon.adapters.VerticalAdapter
import com.example.blackmoon.databinding.FragmentSearchBinding
import com.example.blackmoon.ui.home.HomeWiewModel
import com.example.blackmoon.utils.SharedPref

class SearchFragment : Fragment() {

    lateinit var binding: FragmentSearchBinding
    lateinit var verticalAdapter: VerticalAdapter
    lateinit var homeWiewModel: HomeWiewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater)
        homeWiewModel = ViewModelProvider(this).get(HomeWiewModel::class.java)
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()

        binding.editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.editText.text.length>0){
                    binding.clear.visibility = View.VISIBLE
                    binding.search.visibility = View.INVISIBLE
                }else{
                    binding.clear.visibility = View.INVISIBLE
                    binding.search.visibility = View.VISIBLE
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                if (binding.editText.text.length>2){
                    binding.rv.visibility = View.VISIBLE
                    homeWiewModel.getTermsBySearch(binding.editText.text.toString()).observe(viewLifecycleOwner,Observer{
                        verticalAdapter = VerticalAdapter(it,object : VerticalAdapter.OnMyItemClickListener{
                            override fun onMyItemClick(term: com.example.blackmoon.database.Term) {
                                val bundle = Bundle()
                                bundle.putSerializable("term",term)
                                findNavController().navigate(R.id.termFragment,bundle)
                            }
                        })
                        binding.rv.adapter = verticalAdapter
                    })
                }else{
                    binding.rv.visibility = View.INVISIBLE
                }
            }
        })

        binding.image.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.clear.setOnClickListener {
            binding.editText.setText("")
        }

        return binding.root
    }

}