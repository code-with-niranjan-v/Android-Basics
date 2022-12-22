package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var submitbtn: Button
    lateinit var nameeditxt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitbtn = findViewById(R.id.btn1)
        nameeditxt = findViewById(R.id.edittxt1)

    }


    fun displayName(view: View){

        var name = nameeditxt.text.toString()

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()

    }
fun main() {
    var name="vigneswaran"
    print(name)
    }
