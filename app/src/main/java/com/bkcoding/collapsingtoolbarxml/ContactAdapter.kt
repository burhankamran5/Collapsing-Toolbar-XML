package com.bkcoding.collapsingtoolbarxml

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bkcoding.collapsingtoolbarxml.databinding.ItemDesignBinding

private const val TAG = "ContactAdapter"
class ContactAdapter(val data: List<Data>) : RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {

    class MyViewHolder(
        private val binding: ItemDesignBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Data) {
            binding.name.text = data.name
            binding.phonenumber.text = data.number
            var image = binding.image.toString()
            image = data.image.toString()
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
        Log.d(TAG, "onBindViewHolder: ${data[position].name}")
    }


}