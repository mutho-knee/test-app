package com.muthoknee.morningtryout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mCalc: Button
    lateinit var mWebsite: Button
    lateinit var mContacts: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalc = findViewById(R.id.mBtnCalc)
        mWebsite = findViewById(R.id.mBtnWeb)
        mContacts = findViewById(R.id.mBtnContacts)
        // set on click
        mCalc.setOnClickListener{
            val calc = Intent(this, CalculatorActivity::class.java)
            startActivity(calc)
        }
        mWebsite.setOnClickListener{
            val tovuti = Intent(this, WebsiteActivity::class.java)
            startActivity(tovuti)
        }
        mContacts.setOnClickListener{
            val nambari = Intent(this, ContactsActivity::class.java)
            startActivity(nambari)
        }

    }
}