package com.example.myapplication

import android.provider.ContactsContract
import com.example.myapplication.board.BoardResponse
import com.example.myapplication.board.BoardSend
import com.example.myapplication.find.FindSend
import com.example.myapplication.login.LoginResponse
import com.example.myapplication.login.LoginSend
import com.example.myapplication.lost.LostSend
import com.example.myapplication.register.RegisterResponse
import com.example.myapplication.register.RegisterSend
import com.example.myapplication.register.UserLocation
import com.example.myapplication.unit.UnitResponse
import com.example.myapplication.unit.UnitSend
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.Body
import retrofit2.http.Header
import java.net.URI
import java.net.URL
import java.net.URLDecoder

interface RetrofitService {
    @Headers("content-type: application/json")
    @POST("register")
    fun register(
        @Body register : RegisterSend
    ):Call<RegisterResponse>

    @Headers("content-type: application/json")
    @POST("login")
    fun login(
        @Body login : LoginSend
    ):Call<LoginResponse>

    @Headers("content-type: application/json")
    @POST("Board")
    fun board(
        @Body board : BoardSend
    ):Call<BoardResponse>

    @Headers("content-type: application/json")
    @POST("Unit")
    fun unit(
        @Body unit : UnitSend
    ):Call<UnitResponse>

    @Multipart
    @POST("find")
    fun find(
        @Part imageList : ArrayList<MultipartBody.Part>,
        @PartMap map : MutableMap<String, RequestBody>
    ):Call<String>

    @Headers("content-type: application/json")
    @POST("lost")
    fun lost(
        @Body lost : LostSend
    ):Call<String>
}