package app.mvi_arch.ui.main.intent

sealed class MainIntent {
     data object GetPosts : MainIntent()
}