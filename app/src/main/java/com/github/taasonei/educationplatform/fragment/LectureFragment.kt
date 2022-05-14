package com.github.taasonei.educationplatform.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.github.taasonei.educationplatform.R
import com.github.taasonei.educationplatform.databinding.FragmentLectureBinding
import com.github.taasonei.educationplatform.model.lectures
import java.time.format.DateTimeFormatter


class LectureFragment : Fragment() {

    private var _binding: FragmentLectureBinding? = null
    private val binding get() = _binding!!

    private val args: LectureFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLectureBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (args.lectureId != -1) {
            val currentLecture = lectures[args.lectureId]
            binding.apply {
                lectureTitle.text = currentLecture.title
                lectureDescription.text = currentLecture.subtitle
                lectureDate.text =
                    currentLecture.dateTime.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"))
                lectureTime.text =
                    currentLecture.dateTime.format(DateTimeFormatter.ofPattern("HH:mm"))
                lectureImage.setImageDrawable(
                    AppCompatResources.getDrawable(
                        requireContext(),
                        currentLecture.image
                    )
                )
            }
        } else {
            binding.apply {
                lectureTitle.text = ""
                lectureDescription.text = ""
                lectureDate.text = ""
                lectureTime.text = ""
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}