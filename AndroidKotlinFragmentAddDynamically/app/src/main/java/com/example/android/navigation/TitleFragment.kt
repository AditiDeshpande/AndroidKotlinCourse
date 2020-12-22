package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentTitleBinding

/*
SO code to add Fragment Dynamically in Kotlin
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
    /*
    To make a Frag compile , u need to create a binding object and
    inflate the Fragment's view (Which is equivalent to using setContentView()
    for an Activity)
    */

        /*
        A binding class is generated for each layout file. By default
        , the name of the class is based on the name layout file
        converting it to Pascal case and adding Binding suffix to it.
        Our layout filename is fragment_title so the corresponding
        generated class is FragmentTitleBinding. This class holds all
        the bindings from the layout properties to the layout Views
        and knows how to assign values for the binding expressions.
         */

        val binding =  DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
        R.layout.fragment_title , container , false)
        return binding.root
    }


}