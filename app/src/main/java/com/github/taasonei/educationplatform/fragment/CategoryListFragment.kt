package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.github.taasonei.educationplatform.databinding.FragmentCategoryListBinding
import com.github.taasonei.educationplatform.model.categoryList
import com.github.taasonei.educationplatform.recycler.CategoryListAdapter

class CategoryListFragment : Fragment() {

    private var _binding: FragmentCategoryListBinding? = null
    private val binding get() = _binding!!

    private val onClick: (View, Int) -> Unit = { view: View, id: Int ->
        val action =
            CategoryListFragmentDirections.actionCategoryListFragmentToSubcategoryListFragment(id)
        view.findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listAdapter = CategoryListAdapter(onClick)
        binding.categoryRecycler.adapter = listAdapter
        listAdapter.submitList(categoryList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    companion object {
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            CategoryListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}