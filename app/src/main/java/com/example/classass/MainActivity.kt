package com.example.classass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images = listOf<Image>(
            Image("Image1",R.drawable.scul1),
            Image("Image2",R.drawable.scul2),
            Image("Image3",R.drawable.three)

        )
        val recyclerView= findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= ImageAdapter(this,images)

    }
}