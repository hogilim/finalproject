package com.example.myapplication

import android.net.Uri
import android.util.Log
import com.example.myapplication.login.LoginResponse
import com.example.myapplication.login.LoginSend
import com.example.myapplication.register.RegisterResponse
import com.example.myapplication.register.UserLocation
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.Url
import java.io.File
import java.net.URI
import java.net.URLDecoder


fun main() {
    lateinit var retrofit: Retrofit
    lateinit var myAPI: RetrofitService
    retrofit = RetrofitClient.getInstnace() // 2에서 만든 Retrofit client의 instance를 불러옵니다.
    myAPI = retrofit.create(RetrofitService::class.java)

    var imageList = ArrayList<MultipartBody.Part>()
    var path = "app/src/main/res/drawable-v24/d1.jpg"
    var file = File(path)
    var rqFile = RequestBody.create(MediaType.parse("Multipart/form-data"), file)
    var upFile = MultipartBody.Part.createFormData("files[]",file.name, rqFile)
    imageList.add(upFile)
    var map = mutableMapOf<String, RequestBody>()
    var name = RequestBody.create(MediaType.parse("text/plain"),"dungdung")
    map.put("name",name)

    Runnable {
        myAPI.find(
            imageList,
            map
        ).enqueue(object : Callback<String> {

            //이때 onFaliure는 Call을 서버쪽으로 아예 보내지 못한 경우입니다.
            override fun onFailure(call: Call<String>, t: Throwable) {
                println(t.message)
            }


            //만약 보낸 것이 성공했을 경우는 resonse를 가지고 들어옵니다.
            //그리고 call을 때릴 때 RawResponseData로 갔으니까 Reponse도 그 타입을 가지고 옵니다.
            override fun onResponse(
                call: Call<String>,
                response: Response<String>
            ) {
                println("response : ${response.errorBody()}")
                println("response : ${response.message()}")
                println("response : ${response.code()}")
                println("response : ${response.raw().request().url().url()}")
                println("response : ${response.body()!!}")
            }
        })
    }.run()
    /*
    Runnable {
        val a = LoginSend("hogi","1234")
        myAPI.login(
            a
        ).enqueue(object : Callback<LoginResponse> {

            //이때 onFaliure는 Call을 서버쪽으로 아예 보내지 못한 경우입니다.
            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                println(t.message)
            }


            //만약 보낸 것이 성공했을 경우는 resonse를 가지고 들어옵니다.
            //그리고 call을 때릴 때 RawResponseData로 갔으니까 Reponse도 그 타입을 가지고 옵니다.
            override fun onResponse(
                call: Call<LoginResponse>,
                response: Response<LoginResponse>
            ) {
                println("response : ${response.errorBody()}")
                println("response : ${response.message()}")
                println("response : ${response.code()}")
                println("response : ${response.raw().request().url().url()}")
                println("response : ${response.body()!!}")
                println(response.body()!!.id)
            }
        })
    }.run()
    */

}

