package com.example.florianpilsl.erange

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_input.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        InputButto.setOnClickListener{
            val intent1 = Intent (this, CalculatorActivity :: class.java)

            intent1.putExtra("par2",Parameter2.text)
            intent1.putExtra("par1", Parameter1.text)
            startActivity (intent1)


        }
    }
}
