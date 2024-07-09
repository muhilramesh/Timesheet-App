package com.app.timersheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.app.timersheet.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button = findViewById<Button>(R.id.btn_login)
        button.setOnClickListener{
            val intent = Intent(this, AddEditTimeSheetActivity::class.java)
            startActivity(intent)
        }
    }
}