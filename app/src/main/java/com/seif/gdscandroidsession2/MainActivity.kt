package com.seif.gdscandroidsession2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var editPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("main","onCreate called")

      editText = findViewById<EditText>(R.id.edit_name)
        button = findViewById(R.id.btn_signUp)
        editPassword = findViewById(R.id.edit_password)

       val password = editPassword.text.toString()
        val userName  = editText.text.toString()

        button.setOnClickListener {
            if(userName.isNotEmpty() && password.isNotEmpty()){
                val intent = Intent(this, SecodnActivity::class.java)
                startActivity(intent)
            }
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d("main", "onStart called")


    }

    override fun onResume() {
        super.onResume()
        Log.d("main", "onResume called")

    }

    override fun onPause() {
        super.onPause()
        Log.d("main", "onPause called")

    }

    override fun onStop() {
        super.onStop()
        Log.d("main", "onStop called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("main", "onDestroy called")

    }
}