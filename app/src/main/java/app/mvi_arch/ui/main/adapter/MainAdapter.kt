package app.mvi_arch.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.mvi_arch.data.model.ResponseDTO
import app.mvi_arch.databinding.ViewHolderMainBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    private val list = mutableListOf<ResponseDTO>()

    fun addItems(list: List<ResponseDTO>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    inner class MyViewHolder(val viewDataBinding: ViewHolderMainBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MyViewHolder {
        val binding =
            ViewHolderMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MyViewHolder, position: Int) {
        val binding = holder.viewDataBinding
        val item = this.list[position]
        binding.tvTitle.text = item.title
        binding.tvDescreption.text = item.body
    }

    override fun getItemCount(): Int {
        return this.list.size
    }
}