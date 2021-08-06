package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import retrofit2.http.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register()
        logincheck()

    }
    fun register(){
        btn_register.setOnClickListener{
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
    fun logincheck() {
        var check : Boolean = false
        btn_login.setOnClickListener{
            val id = edit_id.text.toString()
            val pw = edit_pw.text.toString()
            //check
            check = true
            if(check){
                val intent = Intent(this,Board::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(applicationContext,"Error",Toast.LENGTH_SHORT).show()
        }

    }




}