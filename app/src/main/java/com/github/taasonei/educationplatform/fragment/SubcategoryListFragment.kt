package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.github.taasonei.educationplatform.databinding.FragmentSubcategoryListBinding
import com.github.taasonei.educationplatform.model.subcategoryList
import com.github.taasonei.educationplatform.recycler.CategoryListAdapter


class SubcategoryListFragment : Fragment() {

    private var _binding: FragmentSubcategoryListBinding? = null
    private val binding get() = _binding!!

    private val args: SubcategoryListFragmentArgs by navArgs()

    private val onClick: (View, Int) -> Unit = { view: View, id: Int -> }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSubcategoryListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listAdapter = CategoryListAdapter(onClick)
        binding.subcategoryRecycler.adapter = listAdapter
        listAdapter.submitList(subcategoryList[args.id])
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}