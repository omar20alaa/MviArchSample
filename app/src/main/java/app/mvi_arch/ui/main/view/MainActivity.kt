package app.mvi_arch.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import app.mvi_arch.databinding.ActivityMainBinding
import app.mvi_arch.ui.main.adapter.MainAdapter
import app.mvi_arch.ui.main.intent.MainIntent
import app.mvi_arch.ui.main.view_state.MainViewState
import app.mvi_arch.ui.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!

    private val viewModel: MainViewModel by viewModels()
    private val mainAdapter = MainAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        observeViewModels()
        initIntent()
    }

    private fun initView() {
        binding.rvPosts.adapter = mainAdapter
    }

    private fun initIntent() {
        lifecycleScope.launch {
            viewModel.mainIntent.send(MainIntent.GetPosts)
        }
    }

    private fun observeViewModels() {
        lifecycleScope.launch {
            viewModel.state.collect {
                when (it) {

                    is MainViewState.Idle -> {
                        binding.progress.visibility = View.GONE
                    }

                    is MainViewState.Loading -> {
                        binding.progress.visibility = View.VISIBLE
                    }

                    is MainViewState.Success -> {
                        binding.progress.visibility = View.GONE
                        mainAdapter.addItems(it.data)
                    }

                    is MainViewState.Error -> {
                        binding.progress.visibility = View.GONE
                    }
                }
            }
        }

    }


}