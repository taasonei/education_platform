package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.github.taasonei.educationplatform.databinding.FragmentCuratorProfileBinding
import com.github.taasonei.educationplatform.model.curators
import com.github.taasonei.educationplatform.recycler.TimeListAdapter

class CuratorProfileFragment : Fragment() {

    private var _binding: FragmentCuratorProfileBinding? = null
    private val binding get() = _binding!!

    private val args: CuratorProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCuratorProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = TimeListAdapter()
        binding.timeRecycler.adapter = adapter

        val curatorId = args.curatorId
        if (curatorId != -1) {
            binding.curatorName.text = curators[curatorId].name
            binding.curatorInfo.text = curators[curatorId].description
            binding.curatorPhoto.setImageDrawable(
                AppCompatResources.getDrawable(
                    requireContext(),
                    curators[curatorId].image
                )
            )
            adapter.submitList(curators[curatorId].freeTime)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
