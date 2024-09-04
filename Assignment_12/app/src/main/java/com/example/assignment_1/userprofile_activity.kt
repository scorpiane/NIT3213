package com.example.assignment_1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView



class userprofile_activity : Activity() {
    private var _bg__userprofile_ek2: View? = null
    private var image: ImageView? = null
    private var vova_parkhomchuk: TextView? = null
    private var world_renowned_startup_founder: TextView? = null
    private var image_ek1: ImageView? = null
    private var vova_parkhomchuk_ek1: TextView? = null
    private var world_renowned_startup_founder_ek1: TextView? = null
    private var image_ek2: ImageView? = null
    private var vova_parkhomchuk_ek2: TextView? = null
    private var world_renowned_startup_founder_ek2: TextView? = null
    private var image_ek3: ImageView? = null
    private var vova_parkhomchuk_ek3: TextView? = null
    private var world_renowned_startup_founder_ek3: TextView? = null
    private var title: TextView? = null
    private var label: TextView? = null
    private var label_ek1: TextView? = null
    private var label_ek2: TextView? = null
    private var label_ek3: TextView? = null
    private var label_ek4: TextView? = null
    private var title_ek1: TextView? = null
    private var zero_profile: ImageView? = null
    private var name: TextView? = null
    private var name_ek1: TextView? = null
    private var vector: ImageView? = null
    private var vector_ek1: ImageView? = null
    private var vector_ek2: ImageView? = null

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userprofile)


        _bg__userprofile_ek2 = findViewById(R.id._bg__userprofile_ek2) as View
        image = findViewById<View>(R.id.image) as ImageView
        vova_parkhomchuk = findViewById<View>(R.id.vova_parkhomchuk) as TextView
        world_renowned_startup_founder = findViewById<View>(R.id.world_renowned_startup_founder) as TextView
        image_ek1 = findViewById<View>(R.id.image_ek1) as ImageView
        vova_parkhomchuk_ek1 = findViewById<View>(R.id.vova_parkhomchuk_ek1) as TextView
        world_renowned_startup_founder_ek1 = findViewById<View>(R.id.world_renowned_startup_founder_ek1) as TextView
        image_ek2 = findViewById<View>(R.id.image_ek2) as ImageView
        vova_parkhomchuk_ek2 = findViewById<View>(R.id.vova_parkhomchuk_ek2) as TextView
        world_renowned_startup_founder_ek2 = findViewById<View>(R.id.world_renowned_startup_founder_ek2) as TextView
        image_ek3 = findViewById<View>(R.id.image_ek3) as ImageView
        vova_parkhomchuk_ek3 = findViewById<View>(R.id.vova_parkhomchuk_ek3) as TextView
        world_renowned_startup_founder_ek3 = findViewById<View>(R.id.world_renowned_startup_founder_ek3) as TextView
        title = findViewById<View>(R.id.title) as TextView
        label = findViewById<View>(R.id.label) as TextView
        label_ek1 = findViewById<View>(R.id.label_ek1) as TextView
        label_ek2 = findViewById<View>(R.id.label_ek2) as TextView
        label_ek3 = findViewById<View>(R.id.label_ek3) as TextView
        label_ek4 = findViewById<View>(R.id.label_ek4) as TextView
        title_ek1 = findViewById<View>(R.id.title_ek1) as TextView
        zero_profile = findViewById<View>(R.id.zero_profile) as ImageView
        name = findViewById<View>(R.id.name) as TextView
        name_ek1 = findViewById<View>(R.id.name_ek1) as TextView
        vector = findViewById<View>(R.id.vector) as ImageView
        vector_ek1 = findViewById<View>(R.id.vector_ek1) as ImageView
        vector_ek2 = findViewById<View>(R.id.vector_ek2) as ImageView


        //custom code goes here
        vector!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(
                this@userprofile_activity,
                homescreen_activity::class.java
            ) // Use the outer activity's context
            startActivity(intent)
        })
    }
}