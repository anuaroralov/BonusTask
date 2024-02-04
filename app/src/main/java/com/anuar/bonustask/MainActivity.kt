package com.anuar.bonustask

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anuar.bonustask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewBinding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.button.setOnClickListener{

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", viewBinding.editTextText.text.toString())
            intent.putExtra("lastName", viewBinding.editTextText2.text.toString())
            intent.putExtra("age", viewBinding.editTextNumber.text.toString())
            intent.putExtra("login", viewBinding.editTextText3.text.toString())
            startActivity(intent)
        }
    }
}