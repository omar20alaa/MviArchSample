package app.mvi_arch.data.model

data class ResponseDTO(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int,
)