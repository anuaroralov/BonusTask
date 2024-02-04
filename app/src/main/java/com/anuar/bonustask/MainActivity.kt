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
            intent.putExtra("person",Person( viewBinding.editTextText.text.toString(),
                    viewBinding.editTextText2.text.toString(),
                    viewBinding.editTextNumber.text.toString().toInt(),
                    viewBinding.editTextText3.text.toString()))
            startActivity(intent)
        }
    }
}