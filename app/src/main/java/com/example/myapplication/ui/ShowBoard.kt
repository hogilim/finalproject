package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityShowboardBinding

class ShowBoard: AppCompatActivity() {
    val binding = ActivityShowboardBinding.inflate(layoutInflater)
    var picture = ""
    var title = ""
    var cont = ""
    var dog_name = ""
    var dog_gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showboard)

        upload()
    }
    fun set(){
        // 변수값 받아와 초기화
    }
    fun upload(){
        binding.confirm.setOnClickListener {
            // 글작성
            val intent = Intent(this, FoundReport::class.java)
            startActivity(intent)
        }
    }
}