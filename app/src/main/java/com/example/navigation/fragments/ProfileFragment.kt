package com.example.navigation.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigation.R

class ProfileFragment: Fragment(R.layout.fragment_profile) {
    private lateinit var textField1: TextView
    private lateinit var textField2: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textField1 = view.findViewById(R.id.profile1)
        textField2 = view.findViewById(R.id.profile2)

        val fullName = ProfileFragmentArgs.fromBundle(requireArguments()).fullName
        val dateOfBirth = ProfileFragmentArgs.fromBundle(requireArguments()).dateofbirth

        textField1.text = "FullName: $fullName"
        textField2.text = "Date of birth: $dateOfBirth"
    }
}