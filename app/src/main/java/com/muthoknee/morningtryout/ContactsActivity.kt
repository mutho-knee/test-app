package com.muthoknee.morningtryout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ContactsActivity : AppCompatActivity() {
    lateinit var mContact: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        mContact = findViewById(R.id.mListContact)
        mContact.setOnItemClickListener { adapterView, view, i, l ->
            val name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,name, Toast.LENGTH_LONG).show()
        }
    }
}