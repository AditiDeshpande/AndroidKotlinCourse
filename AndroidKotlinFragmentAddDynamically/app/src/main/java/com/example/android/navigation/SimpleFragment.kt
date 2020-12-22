package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Use the [SimpleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SimpleFragment : Fragment() {

    var mParam: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    if(arguments != null){
            mParam = arguments?.getString(ARG_PARAM)
    }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple, container, false)
    }

    /*
    Companion objects provide mechanism for defining variables or functions
    that are linked conceptually to a type but r not tied to a particular
    object. Companion objects are similar to using Java's static keyword
    for variables and methods.
     */
    companion object{
        val ARG_PARAM: String = "param"
        fun newInstance(param: String) : SimpleFragment{
            val fragment = SimpleFragment()
            val args = Bundle()
            args.putString(ARG_PARAM , param)
            fragment.arguments = args

        return fragment;

        }
    }
}