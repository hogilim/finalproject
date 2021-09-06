package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityShowboardBinding

class ShowBoard: AppCompatActivity() {
    var picture = ""
    var title = ""
    var cont = ""
    var dog_name = ""
    var dog_gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityShowboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        upload(binding)
    }
    fun set(){
        // 변수값 받아와 초기화
    }
    fun upload(binding: ActivityShowboardBinding){
        binding.confirm.setOnClickListener {
            // 글작성
            val intent = Intent(this, FoundReport::class.java)
            startActivity(intent)
        }
    }
}