package com.example.trialrun

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trialrun.R.id

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(id.recyclerView)

        val items = listOf(
            CardItem(R.drawable.sample_image, "Zenith Striders"),
            CardItem(R.drawable.sample_image2, "Astra Comfort"),
            CardItem(R.drawable.sample_image3, "NexStep Elite"),
            CardItem(R.drawable.sample_image4, "LunaFlex Pro"),
            CardItem(R.drawable.sample_image5, "TerraWalkers"),
            CardItem(R.drawable.sample_image6, "VelociSneak"),

        )

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = CardAdapter(items)

       

        }
    }