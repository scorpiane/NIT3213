package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        val newsImageArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
        )

        val newsHeadingArray = arrayOf(
            "News 1",
            "News 2",
            "News 3",
            "News 4",
            "News 5",
            "News 6"
        )


        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for(index in newsImageArray.indices){
            val news = News(newsHeadingArray[index], newsImageArray[index])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter = MyAdapter(newsArrayList, this)
    }
}