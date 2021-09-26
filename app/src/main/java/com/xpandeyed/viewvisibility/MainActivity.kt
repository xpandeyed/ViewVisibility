package com.xpandeyed.viewvisibility

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bShowButton).setOnClickListener {
            val intent = Intent(this, MultiviewActivity::class.java)
            intent.putExtra("INVOKER", false)
            startActivity(intent)
        }
        findViewById<Button>(R.id.bShowImage).setOnClickListener {
            val intent = Intent(this, MultiviewActivity::class.java)
            intent.putExtra("INVOKER", true)
            startActivity(intent)
        }

    }
}