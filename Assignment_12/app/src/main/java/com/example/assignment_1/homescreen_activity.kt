package com.example.assignment_1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class homescreen_activity : Activity() {
    private var _bg__homescreen_ek2: View? = null
    private var vector: ImageView? = null
    private var label: TextView? = null
    private var vector_ek1: ImageView? = null
    private var label_ek1: TextView? = null
    private var title: TextView? = null
    private var title_ek1: TextView? = null
    private var title_ek2: TextView? = null
    private var label_text: TextView? = null
    private var subtitle: TextView? = null
    private var title_ek3: TextView? = null
    private var vector_200: ImageView? = null
    private var title_ek4: TextView? = null
    private var label_text_ek1: TextView? = null
    private var subtitle_ek1: TextView? = null
    private var title_ek5: TextView? = null
    private var title_ek6: TextView? = null
    private var title_ek7: TextView? = null
    private var title_ek8: TextView? = null
    private var vector_ek2: ImageView? = null
    private var label_ek2: TextView? = null
    private var vector_ek3: ImageView? = null
    private var label_ek3: TextView? = null
    private var vector_ek4: ImageView? = null
    private var label_ek4: TextView? = null
    private var vector_ek5: ImageView? = null
    private var label_ek5: TextView? = null
    private var vector_ek6: ImageView? = null
    private var label_ek6: TextView? = null
    private var rectangle_2698: View? = null
    private var vector_680: ImageView? = null
    private var search: TextView? = null
    private var music_py: TextView? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)


        _bg__homescreen_ek2 = findViewById(R.id._bg__homescreen_ek2) as View
        vector = findViewById<View>(R.id.vector) as ImageView
        label = findViewById<View>(R.id.label) as TextView
        vector_ek1 = findViewById<View>(R.id.vector_ek1) as ImageView
        label_ek1 = findViewById<View>(R.id.label_ek1) as TextView
        title = findViewById<View>(R.id.title) as TextView
        title_ek1 = findViewById<View>(R.id.title_ek1) as TextView
        title_ek2 = findViewById<View>(R.id.title_ek2) as TextView
        label_text = findViewById<View>(R.id.label_text) as TextView
        subtitle = findViewById<View>(R.id.subtitle) as TextView
        title_ek3 = findViewById<View>(R.id.title_ek3) as TextView
        vector_200 = findViewById<View>(R.id.vector_200) as ImageView
        title_ek4 = findViewById<View>(R.id.title_ek4) as TextView
        label_text_ek1 = findViewById<View>(R.id.label_text_ek1) as TextView
        subtitle_ek1 = findViewById<View>(R.id.subtitle_ek1) as TextView
        title_ek5 = findViewById<View>(R.id.title_ek5) as TextView
        title_ek6 = findViewById<View>(R.id.title_ek6) as TextView
        title_ek7 = findViewById<View>(R.id.title_ek7) as TextView
        title_ek8 = findViewById<View>(R.id.title_ek8) as TextView
        vector_ek2 = findViewById<View>(R.id.vector_ek2) as ImageView
        label_ek2 = findViewById<View>(R.id.label_ek2) as TextView
        vector_ek3 = findViewById<View>(R.id.vector_ek3) as ImageView
        label_ek3 = findViewById<View>(R.id.label_ek3) as TextView
        vector_ek4 = findViewById<View>(R.id.vector_ek4) as ImageView
        label_ek4 = findViewById<View>(R.id.label_ek4) as TextView
        vector_ek5 = findViewById<View>(R.id.vector_ek5) as ImageView
        label_ek5 = findViewById<View>(R.id.label_ek5) as TextView
        vector_ek6 = findViewById<View>(R.id.vector_ek6) as ImageView
        label_ek6 = findViewById<View>(R.id.label_ek6) as TextView
        rectangle_2698 = findViewById(R.id.rectangle_2698) as View
        vector_680 = findViewById<View>(R.id.vector_680) as ImageView
        search = findViewById<View>(R.id.search) as TextView
        music_py = findViewById<View>(R.id.music_py) as TextView


        //custom code goes here
        vector_ek6!!.setOnClickListener { v -> // Use the correct context (v.getContext() or YourActivityName.this)
            val intent = Intent(
                this@homescreen_activity, userprofile_activity::class.java
            )
            startActivity(intent)
        }
    }
}