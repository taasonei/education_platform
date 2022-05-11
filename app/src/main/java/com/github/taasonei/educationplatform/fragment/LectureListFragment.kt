package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.github.taasonei.educationplatform.databinding.FragmentLectureListBinding
import com.github.taasonei.educationplatform.model.lectures
import com.github.taasonei.educationplatform.recycler.LectureListAdapter

class LectureListFragment : Fragment() {

    private var _binding: FragmentLectureListBinding? = null
    private val binding get() = _binding!!

    private val onClick: (View, Int) -> Unit = { view: View, id: Int ->
        val action = LectureListFragmentDirections.actionLectureListFragmentToLectureFragment(id)
        view.findNavController().navigate(action)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLectureListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lectureAdapter = LectureListAdapter(onClick)
        binding.lectureRecycler.adapter = lectureAdapter
        lectureAdapter.submitList(lectures)

        binding.lectureListChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            if (checkedIds.isNotEmpty()) {
                when (checkedIds.first()) {
                    binding.chipRecorded.id -> lectureAdapter.submitList(lectures.filter { it.isRecorded })
                    binding.chipAll.id -> lectureAdapter.submitList(lectures)
                    binding.chipPlanned.id -> lectureAdapter.submitList(lectures.filter { !it.isRecorded })
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}