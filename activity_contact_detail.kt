package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import android.widget.ImageView
import android.widget.TextView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.ui.theme.AndroidTheme

class activity_contact_detail : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")

        val tvName = findViewById<TextView>(R.id.textName)
        val tvPhone = findViewById<TextView>(R.id.textPhone)
        val imageView = findViewById<ImageView>(R.id.imageView)

        tvName.text = name
        tvPhone.text = phone


    }
}
