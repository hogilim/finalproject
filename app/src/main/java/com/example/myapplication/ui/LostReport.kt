package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLostBinding


class LostReport: AppCompatActivity() {
    var picture = ""
    var title = ""
    var cont = ""
    var dog_name = ""
    var dog_gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        upload(binding)
    }
    fun upload(binding: ActivityLostBinding) {
        binding.confirm.setOnClickListener {
            Toast.makeText(applicationContext,"글 작성 완료", Toast.LENGTH_SHORT).show()
            // 변수 설정 및 http 업로드
            val intent = Intent(this, Board::class.java)
            startActivity(intent)
        }
    }
}