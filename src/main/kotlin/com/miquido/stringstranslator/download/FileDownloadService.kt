package com.miquido.stringstranslator.download

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

interface FileDownloadService {

    @Streaming
    @GET
    fun downloadFile(@Url url: String): Call<ResponseBody>

}