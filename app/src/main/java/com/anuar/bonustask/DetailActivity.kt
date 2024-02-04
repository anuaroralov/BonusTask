package com.anuar.bonustask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anuar.bonustask.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val viewBinding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.textView.text= String.format("Name: %s", intent.getStringExtra("name"))
        viewBinding.textView2.text= String.format("Last name: %s", intent.getStringExtra("lastName"))
        viewBinding.textView3.text= String.format("Age: %s", intent.getStringExtra("age"))
        viewBinding.textView4.text= String.format("Login: %s", intent.getStringExtra("login"))
    }
}