package com.example.dogedex.doglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.dogedex.Dog
import com.example.dogedex.databinding.DogListItemBinding

class DogAdapter(private val dataSet: List<Dog>) : RecyclerView.Adapter<DogAdapter.ViewHolder>() {
    class ViewHolder(private val binding: DogListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dog: Dog) {
            binding.dogName.text = dog.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DogListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dog = dataSet[position]
        holder.bind(dog)
    }

    override fun getItemCount(): Int = dataSet.size
}