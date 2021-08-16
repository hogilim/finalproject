package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import retrofit2.http.*


class MainActivity : AppCompatActivity() {
    var loginCheck : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 회원가입 버튼
        btn_register.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        // 로그인 버튼
        btn_login.setOnClickListener{
            val id = edit_id.text.toString()
            val pw = edit_pw.text.toString()

            // 입력 확인
            if(id.isEmpty()||pw.isEmpty()){
                Toast.makeText(this,"ID와 PW를 모두 입력하세요", Toast.LENGTH_SHORT).show()
            }
            else{
                // 서버 통신 로그인 체크
                loginCheck = true
            }

            if(loginCheck){
                val intent = Intent(this,Board::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(applicationContext,"Error",Toast.LENGTH_SHORT).show()
        }
    }


}