package app.mvi_arch.ui.main.view_state

import app.mvi_arch.data.model.ResponseDTO


sealed class MainViewState {

    data object Idle : MainViewState()
    data object Loading : MainViewState()
    class Error(var message : String) : MainViewState()
    class Success(val data:List<ResponseDTO>) : MainViewState()

}