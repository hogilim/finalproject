package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityLostBinding


class LostReport: AppCompatActivity() {
    val binding = ActivityLostBinding.inflate(layoutInflater)
    var picture = ""
    var title = ""
    var cont = ""
    var dog_name = ""
    var dog_gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost)

        upload()
    }
    fun upload(){
        binding.confirm.setOnClickListener {
            Toast.makeText(applicationContext,"글 작성 완료", Toast.LENGTH_SHORT).show()
            // 변수 설정 및 http 업로드
            val intent = Intent(this, Board::class.java)
            startActivity(intent)
        }
    }
}