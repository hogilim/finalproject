package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // spinner 설정
        var location_Si = resources.getStringArray(R.array.si)
        var location_gu = resources.getStringArray(R.array.gu)
        var location_Dong = resources.getStringArray(R.array.dong)
        var adapter_Si = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location_Si)
        var adapter_gu = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location_gu)
        var adapter_Dong =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location_Dong)

        var selected_si = ""
        var selected_gu = ""
        var selected_dong = ""

        binding.selectSi.adapter = adapter_Si
        binding.selectGu.adapter = adapter_gu
        binding.selectDong.adapter = adapter_Dong

        binding.selectSi.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected_si = location_Si[position]
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                selected_si = "no"
            }
        }
        binding.selectGu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected_gu = location_gu[position]
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        binding.selectDong.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected_dong = location_Dong[position]
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        // 가입 버튼 누를 때
        binding.btnRegister.setOnClickListener {

            var isExistBlank = false
            var isPWSame = false

            val id = binding.editId.text.toString()
            val nickname = binding.editNickname.text.toString()
            val pw = binding.editPw.text.toString()
            val pw_re = binding.editPwRe.text.toString()
            val si = selected_si
            val gu = selected_gu
            val dong = selected_dong

            // 안채운 양식 확인
            if(id.isEmpty()||nickname.isEmpty()||pw.isEmpty()||pw_re.isEmpty()||si=="시"||gu=="구"){
                Toast.makeText(this, "모든 정보를 작성해주세요.", Toast.LENGTH_SHORT).show()
                isExistBlank = true
            }
            // 패스워드 확인
            if(pw == pw_re){
                isPWSame = true
            }
            else{
                Toast.makeText(this, "비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show()
                isPWSame = false
            }

            // 양식 다 채우고 패스워드 잘 입력 시 서버 통신
            if(!isExistBlank && isPWSame){
                // 서버 데이터 전송 후 유효하면 가입 성공 유효하지 않으면 실패 메시지
                var registerCheck = true
                if(registerCheck) {
                    Toast.makeText(this, "회원가입 성공! 로그인하세요.",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "회원가입 실패.",Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}