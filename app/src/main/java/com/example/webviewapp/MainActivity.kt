package com.example.webviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.webviewapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    lateinit var inputVal : TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        inputVal = findViewById(R.id.inputVal);


//        val btnClick  = findViewById<ImageButton>(R.id.gotBtn);
//        btnClick.setOnClickListener{

//            val bundle = Bundle()
//            bundle.putString("url", inputVal.text.toString())
//            Toast.makeText(this,inputVal.text.toString(), Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, WebViewResult::class.java)
//            intent.putExtras("")
//            startActivity(intent)
//        }
    }
}