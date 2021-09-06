package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityFoundBinding


class FoundReport: AppCompatActivity() {
    var picture = ""
    var title = ""
    var cont = ""
    var dog_name = ""
    var dog_gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFoundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        upload(binding)
    }
    fun select_picture(binding: ActivityFoundBinding){
        binding.selectPicture.setOnClickListener {
            // 사진 선택 후 imageview에 띄움
        }
    }
    fun upload(binding:  ActivityFoundBinding) {
        binding.confirm.setOnClickListener {
            Toast.makeText(applicationContext,"신고완료", Toast.LENGTH_SHORT).show()
            // 변수 설정 및 http 업로드
            val intent = Intent(this, Board::class.java)
            startActivity(intent)
        }
    }
}