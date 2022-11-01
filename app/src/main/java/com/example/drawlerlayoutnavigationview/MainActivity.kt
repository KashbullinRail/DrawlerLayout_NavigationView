package com.example.drawlerlayoutnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.example.drawlerlayoutnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnOpen.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }

}