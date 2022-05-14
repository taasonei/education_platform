package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.github.taasonei.educationplatform.databinding.FragmentCategoryListBinding
import com.github.taasonei.educationplatform.model.categoryList
import com.github.taasonei.educationplatform.model.lectures
import com.github.taasonei.educationplatform.recycler.CategoryListAdapter

class CategoryListFragment : Fragment() {

    private var _binding: FragmentCategoryListBinding? = null
    private val binding get() = _binding!!

    private val onClick: (View, Int) -> Unit = { view: View, id: Int ->
        val action =
            CategoryListFragmentDirections.actionCategoryListFragmentToSubcategoryListFragment(id, categoryList[id].title)
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

}