package com.example.florianpilsl.erange

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_erange.*
import java.lang.reflect.Parameter

class Erange : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_erange)
        supportFragmentManager.beginTransaction().replace(R.id.eRange, MapFragment.newInstance(), "MapFragment").commit()



        goToMapAct.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.eRange, ParameterFragment.newInstance(), "ParameterFragment").commit()



            //supportFragmentManager
              //      .beginTransaction()
                //    .add(R.id.eRange, MapFragment.newInstance(), "MapFragment")
                  //  .commit()


            Log.d("fragments" , "" +  supportFragmentManager.fragments[0].tag)


        }



    }


}
