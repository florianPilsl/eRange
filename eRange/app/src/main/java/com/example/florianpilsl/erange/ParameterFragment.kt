package com.example.florianpilsl.erange

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A placeholder fragment containing a simple view.
 */
class ParameterFragment : Fragment() {


    companion object {
        fun newInstance(): ParameterFragment {

            return ParameterFragment()

        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_parameter, container, false)

    }


}