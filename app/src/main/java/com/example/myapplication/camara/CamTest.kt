// https://makasti.tistory.com/73

package com.example.myapplication.camara
/*
import android.Manifest
import android.app.Activity
import com.example.myapplication.ui.Board
import com.example.myapplication.ui.Register

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.myapplication.R
import java.io.File


class CamTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // 카메라 실행 부분
            if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED && checkSelfPermission(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(cameraIntent, 1)
            } else {
                Log.d("test", "권한 설정 요청")
                ActivityCompat.requestPermissions(
                    this@CamTest,
                    arrayOf<String?>(
                        Manifest.permission.CAMERA,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                    ),
                    1
                )
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //findViewById(R.id.result_image).setImageURI(photoUri);
        try {
            when (requestCode) {
                else -> {
                    print(requestCode)
                }

                /*
                REQUEST_TAKE_PHOTO -> {
                    if (resultCode === Activity.RESULT_OK) {
                        val file = File(mCurrentPhotoPath)
                        myBitmap = MediaStore.Images.Media
                            .getBitmap(contentResolver, Uri.fromFile(file))
                    }
                }
                */
            }
        } catch (error: Exception) {
            error.printStackTrace()
        }

    }
}*/