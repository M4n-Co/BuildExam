package com.example.buildexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(BuildConfig.BUILD_TYPE == "release"){
            //Inicializar Admob
        }

        if (BuildConfig.FLAVOR == "premium"){
            //Start Activity
        }else{
            //Mostrar dialogo
        }

        if(BuildConfig.VERSION_P){
            //Estas en premium
        }else{
            //No ha pagado premium
        }

        val myUrl = BuildConfig.URL

    }
}