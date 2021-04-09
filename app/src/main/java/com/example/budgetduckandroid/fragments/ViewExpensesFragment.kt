package com.example.budgetduckandroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.budgetduckandroid.R
import com.example.budgetduckandroid.databinding.FragmentViewExpensesBinding

class ViewExpensesFragment : Fragment() {

    private lateinit var binding: FragmentViewExpensesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_view_expenses,
            container,
            false
        )

        binding.lifecycleOwner = this

        return binding.root
    }
}