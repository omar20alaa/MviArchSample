package app.mvi_arch.data.repository

import app.mvi_arch.data.api.ApiService

class GetUserRepository(
    private val apiService: ApiService
) {
    suspend fun getPosts() = apiService.getPosts()
}