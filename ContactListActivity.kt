package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.Model.Contact
import com.example.android.Model.ContactAdapter

class ContactListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val contacts = listOf(
            Contact("A", "1"),
            Contact("B", "2"),
            Contact("C", "3")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactAdapter(contacts) { contact ->
            val intent = Intent(this, activity_contact_detail::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            startActivity(intent)
        }




    }
}

