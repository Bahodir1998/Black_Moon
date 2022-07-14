package com.example.blackmoon.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.blackmoon.App
import com.example.blackmoon.R
import com.example.blackmoon.adapters.HorizontalAdapter
import com.example.blackmoon.adapters.VerticalAdapter
import com.example.blackmoon.database.AppDatabase
import com.example.blackmoon.databinding.FragmentHomeBinding
import com.example.blackmoon.models.Symbol
import com.example.blackmoon.utils.SharedPref
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var horizontalAdapter: HorizontalAdapter
    lateinit var verticalAdapter: VerticalAdapter
    lateinit var homeWiewModel: HomeWiewModel
    var category = 9

    val jsonSymbols = "[{\"id\":9,\"name\":\"А\"},{\"id\":10,\"name\":\"Б\"},{\"id\":11,\"name\":\"В\"},{\"id\":12,\"name\":\"Г\"},{\"id\":13,\"name\":\"Д\"},{\"id\":14,\"name\":\"Е\"},{\"id\":15,\"name\":\"Ё\"},{\"id\":16,\"name\":\"Ж\"},{\"id\":17,\"name\":\"З\"},{\"id\":18,\"name\":\"И\"},{\"id\":19,\"name\":\"Й\"},{\"id\":20,\"name\":\"К\"},{\"id\":21,\"name\":\"Л\"},{\"id\":22,\"name\":\"М\"},{\"id\":23,\"name\":\"Н\"},{\"id\":24,\"name\":\"О\"},{\"id\":25,\"name\":\"П\"},{\"id\":26,\"name\":\"Р\"},{\"id\":27,\"name\":\"С\"},{\"id\":28,\"name\":\"Т\"},{\"id\":29,\"name\":\"У\"},{\"id\":30,\"name\":\"Ф\"},{\"id\":31,\"name\":\"Х\"},{\"id\":32,\"name\":\"Ц\"},{\"id\":33,\"name\":\"Ч\"},{\"id\":34,\"name\":\"Ш\"},{\"id\":35,\"name\":\"Э\"},{\"id\":36,\"name\":\"Ю\"},{\"id\":37,\"name\":\"Я\"},{\"id\":38,\"name\":\"Ў\"},{\"id\":39,\"name\":\"Қ\"},{\"id\":40,\"name\":\"Ғ\"},{\"id\":41,\"name\":\"Ҳ\"}]"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeWiewModel = ViewModelProvider(this).get(HomeWiewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val appDatabase = AppDatabase.getInstance(App.applicationContext())
        if (appDatabase.termDao().getTermsBySymbol("А").isEmpty()){
            Toast.makeText(requireContext(), "Internet bor yo'qligini tekshiring!", Toast.LENGTH_SHORT).show()
        }
        SharedPref.getInstanceDis(requireContext())
        category = SharedPref.url!!
        (requireActivity() as AppCompatActivity).supportActionBar?.show()
        val fromJson =
            Gson().fromJson<List<Symbol>>(jsonSymbols, object : TypeToken<List<Symbol>>() {}.type)
        binding.harf.setText(fromJson[category-9].name)
        horizontalAdapter = HorizontalAdapter(fromJson,object :HorizontalAdapter.OnItemClickListener{
            override fun onItemClick(symbol: Symbol) {
                binding.harf.setText(symbol.name)
                homeWiewModel.getTermsByCategory(symbol.name).observe(viewLifecycleOwner,Observer{
                    verticalAdapter.list = it
                    binding.vRv.adapter = verticalAdapter
                    SharedPref.url = symbol.id
                })
            }
        })
        binding.hrRv.adapter = horizontalAdapter

        homeWiewModel.getTermsByCategory(fromJson[category-9].name).observe(viewLifecycleOwner,Observer{
            verticalAdapter = VerticalAdapter(it,object : VerticalAdapter.OnMyItemClickListener{
                override fun onMyItemClick(term: com.example.blackmoon.database.Term) {
                    val bundle = Bundle()
                    bundle.putSerializable("term",term)
                    findNavController().navigate(R.id.termFragment,bundle)
                }
            })
            binding.vRv.adapter = verticalAdapter
        })

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}