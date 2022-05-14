package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.github.taasonei.educationplatform.R
import com.github.taasonei.educationplatform.databinding.FragmentCuratorListBinding
import com.github.taasonei.educationplatform.model.curators
import com.github.taasonei.educationplatform.recycler.CuratorListAdapter

class CuratorListFragment : Fragment() {

    private var _binding: FragmentCuratorListBinding? = null
    private val binding get() = _binding!!

    private val onClick: (View, Int) -> Unit = {view, id ->
        val action = CuratorListFragmentDirections.actionCuratorListFragmentToCuratorProfileFragment(id)
        view.findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCuratorListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = CuratorListAdapter(onClick)
        binding.curatorRecycler.adapter = adapter
        adapter.submitList(curators)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}