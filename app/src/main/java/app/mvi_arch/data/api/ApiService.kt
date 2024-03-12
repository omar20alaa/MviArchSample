package app.mvi_arch.data.api

import app.mvi_arch.data.model.ResponseDTO
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<ResponseDTO>


}