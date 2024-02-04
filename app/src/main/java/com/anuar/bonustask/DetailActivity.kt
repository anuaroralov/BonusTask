package com.anuar.bonustask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anuar.bonustask.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private val viewBinding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        val person = intent.getSerializableExtra("person") as Person?
        viewBinding.textView.text= String.format("Name: %s", person?.name)
        viewBinding.textView2.text= String.format("Last name: %s", person?.lastName)
        viewBinding.textView3.text= String.format("Age: %s", person?.age)
        viewBinding.textView4.text= String.format("Login: %s", person?.login)
    }
}