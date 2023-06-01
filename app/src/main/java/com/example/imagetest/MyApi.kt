package com.example.imagetest

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface MyApi {
    @Multipart
    @POST("/boards")
    fun sendImage(
        @Part("board") board : Board,
        @Part files: MultipartBody.Part
    ): Call<BasicResponse>
}