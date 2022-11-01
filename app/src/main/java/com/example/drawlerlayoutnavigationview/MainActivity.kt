package com.example.drawlerlayoutnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.drawlerlayoutnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.apply {
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.item1 -> Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT).show()
                    R.id.item21 -> {
                        Toast.makeText(this@MainActivity, "Item 21", Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity, "Item 2121", Toast.LENGTH_SHORT).show()
                    }
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }
            btnOpen.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }

}