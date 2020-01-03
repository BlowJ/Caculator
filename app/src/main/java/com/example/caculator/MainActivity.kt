package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_caculator.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragment = Caculator()
        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_caculator, fragment)
        transaction.commit()

    }



}


