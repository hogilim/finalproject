package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    var loginCheck : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // 회원가입 버튼
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        // 로그인 버튼
        binding.btnLogin.setOnClickListener{
            val id = binding.editId.text.toString()
            val pw = binding.editPw.text.toString()

            // 입력 확인
            if(id.isEmpty()||pw.isEmpty()){
                Toast.makeText(this,"ID와 PW를 모두 입력하세요", Toast.LENGTH_SHORT).show()
            }
            else{
                // 서버 통신 로그인 체크
                loginCheck = true
            }

            if(loginCheck){
                val intent = Intent(this, Board::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(applicationContext,"Error",Toast.LENGTH_SHORT).show()
        }
    }


}