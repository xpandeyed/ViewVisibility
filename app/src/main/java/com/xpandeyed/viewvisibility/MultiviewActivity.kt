package com.xpandeyed.viewvisibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MultiviewActivity : AppCompatActivity() {
    private var showImage : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiview)
        showImage = intent.getBooleanExtra("INVOKER", false)
    }

    override fun onResume() {
        super.onResume()
        if(showImage){
            findViewById<Button>(R.id.button).visibility = View.GONE
            findViewById<ImageView>(R.id.imageView).visibility = View.VISIBLE
        }else{
            findViewById<Button>(R.id.button).visibility = View.VISIBLE
            findViewById<ImageView>(R.id.imageView).visibility = View.GONE
        }
    }
}