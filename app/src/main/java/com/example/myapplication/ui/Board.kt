package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityBoardBinding
import com.example.myapplication.register.UserLocation


class Board: AppCompatActivity() {
    val binding = ActivityBoardBinding.inflate(layoutInflater)
    val items = ArrayList<BoardUnit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)



        initRecycler()
        lost()
        found()
        refresh()
    }
    private fun initRecycler() {

        items.apply {
            add(BoardUnit(imgProfile = "d1", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "d2", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "d3", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "d4", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "d5", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "d6", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
            add(BoardUnit(imgProfile = "", name = "mary", gender = "male", location = UserLocation("난향","관악"), 1))
        }
        val madapter = BoardAdapter(this, items){
            val intent = Intent(this, ShowBoard::class.java)
            startActivity(intent)
        }
        binding.xmlBoardDogs.adapter = madapter
    }
    fun select(){

    }
    fun lost(){
        binding.lost.setOnClickListener{
            val intent = Intent(this, LostReport::class.java)
            startActivity(intent)
        }
    }
    fun found(){
        binding.found.setOnClickListener{
            val intent = Intent(this, FoundReport::class.java)
            startActivity(intent)
        }
    }
    fun refresh(){
        // 리스트 refresh
    }

}