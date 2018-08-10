package com.example.florianpilsl.erange

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.calculator_activity.*
import java.math.BigDecimal

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("hehe" , ""+intent.extras["par1"])
        val par1 = intent.extras["par1"]
        val par2 = intent.extras["par2"]
        //Hier könntest du versuchen  par 1 durch par 2 teilen oder sowas und des dann im TExtview anzeigen.
        textView.setText("hier das ergebnis")





    }
}
