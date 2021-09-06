package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityBoardBinding
import com.example.myapplication.register.UserLocation


class Board: AppCompatActivity() {

    val items = ArrayList<BoardUnit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)



        initRecycler(binding)
        lost(binding)
        found(binding)
        refresh(binding)
    }
    private fun initRecycler(binding: ActivityBoardBinding) {

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
    fun lost(binding: ActivityBoardBinding) {
        binding.lost.setOnClickListener{
            val intent = Intent(this, LostReport::class.java)
            startActivity(intent)
        }
    }
    fun found(binding: ActivityBoardBinding) {
        binding.found.setOnClickListener{
            val intent = Intent(this, FoundReport::class.java)
            startActivity(intent)
        }
    }
    fun refresh(binding: ActivityBoardBinding) {
        // 리스트 refresh
    }

}