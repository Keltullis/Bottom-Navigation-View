package com.bignerdranch.android.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Здесь назначаются действия для меню
        binding.bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.menu_back ->{}
                R.id.menu_delete ->{}
                R.id.menu_save ->{}
                R.id.menu_forward -> {}
            }
            true
        }
    }
}