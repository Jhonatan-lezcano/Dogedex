package com.example.dogedex.doglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dogedex.Dog
import com.example.dogedex.databinding.ActivityDogListBinding

class DogListActivity : AppCompatActivity() {
    private val dogListViewModel: DogListViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDogListBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        binding.dogRecycler.layoutManager = LinearLayoutManager(this)

        dogListViewModel.dogList.observe(this) {
            binding.dogRecycler.adapter = DogAdapter(it)
        }

    }


}