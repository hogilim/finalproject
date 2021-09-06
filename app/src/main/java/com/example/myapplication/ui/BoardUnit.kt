package com.example.myapplication.ui

import com.example.myapplication.register.UserLocation

data class BoardUnit(
    val imgProfile: String,
    val name: String,
    val gender:String,
    val location: UserLocation,
    val date: Int
)
