package com.example.edukerimobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.edukerimobileapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvLevel.layoutManager=LinearLayoutManager(this)
        displayLevel()
    }
    private fun displayLevel(){
        val level1=Content("","Loren Ipsum Loren Ipsum")
        val level2=Content("","Loren Ipsum Loren Ipsum")
        val level3=Content("","Loren Ipsum Loren Ipsum")
        val level4=Content("","Loren Ipsum Loren Ipsum")
        val level5=Content("","Loren Ipsum Loren Ipsum")

val contentList= listOf(level1,level2,level3,level4,level5)
        val contentAdapter=ContentAdapter(contentList)
        binding.rvLevel.adapter=contentAdapter

    }
}