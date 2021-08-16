package com.example.myapplication

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        // spinner 설정
        var location_Si = resources.getStringArray(R.array.si)
        var location_gu = resources.getStringArray(R.array.gu)
        var location_Dong = resources.getStringArray(R.array.dong)
        var adapter_Si = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location_Si)
        var adapter_gu = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location_gu)
        var adapter_Dong =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, location_Dong)

        select_si.adapter = adapter_Si
        select_gu.adapter = adapter_gu
        select_dong.adapter = adapter_Dong
        select_si.setSelection(0)
        select_gu.setSelection(0)
        select_dong.setSelection(0)

        select_si.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        select_gu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        select_dong.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        // spinner 설정

        btn_register.setOnClickListener {

            val id = edit_id.text.toString()
            val pw = edit_pw.text.toString()
            val pw_re = edit_pw_re.text.toString()
        }
    }
}