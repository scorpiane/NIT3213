package com.example.assignment_1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.assignment_1.R.*


class loginscreen_activity : Activity() {
    private var label: TextView? = null
    private var password: TextView? = null
    private var vector_68: ImageView? = null
    private var rectangle_250: View? = null
    private var label_ek2: TextView? = null
    private var placeholder: TextView? = null
    private var label_ek3: TextView? = null
    private var title: TextView? = null
    private var icons8_podcasts_100_1: ImageView? = null
    private var icons8_music_100_1: ImageView? = null
    private lateinit var loginbutton: Button

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.loginscreen)


        label = findViewById<View>(id.label) as TextView
        password = findViewById<View>(id.password) as TextView
        vector_68 = findViewById<View>(id.vector_68) as ImageView
        rectangle_250 = findViewById(id.rectangle_250) as View
        label_ek2 = findViewById<View>(id.label_ek2) as TextView
        placeholder = findViewById<View>(id.placeholder) as TextView
        label_ek3 = findViewById<View>(id.label_ek3) as TextView
        title = findViewById<View>(id.title) as TextView
        icons8_podcasts_100_1 = findViewById<View>(id.icons8_podcasts_100_1) as ImageView
        icons8_music_100_1 = findViewById<View>(id.icons8_music_100_1) as ImageView
        loginbutton = findViewById<View>(id.loginbutton) as Button


        loginbutton.setOnClickListener(View.OnClickListener {
            val intent = Intent(
                this@loginscreen_activity,
                homescreen_activity::class.java
            ) // Use the outer activity's context
            startActivity(intent)
        })


        //custom code goes here
    }
}