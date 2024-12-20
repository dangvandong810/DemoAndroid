package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent

class MainActivity : ComponentActivity() {
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var btnDisplay: Button
    private lateinit var btnMoveToList: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.giaodien_main)

        val edText = findViewById<EditText>(R.id.et_input)
        val btnShowText = findViewById<Button>(R.id.btn_show_text)
        val btnGoToList = findViewById<Button>(R.id.btn_to_list)
        val tvDisplayText = findViewById<TextView>(R.id.tv_display)

        btnShowText.setOnClickListener {
            val text = edText.text.toString()
            tvDisplayText.text = text
        }

        btnGoToList.setOnClickListener {
            val intent = Intent(this, ContactListActivity::class.java)
            startActivity(intent)
        }




    }
}

