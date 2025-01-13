package com.example.learnxml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val postsList = arrayListOf<Post>()
        (1..500).forEach {
            postsList.add(Post(
                id = it.toString(),
                text = "Soy el post $it",
                creator = Creator(
                    user = User(
                        fullName = "Carlangas Nalgas",

                    )

                )
                )
            )
        }
        recyclerView.adapter = FeedAdapter(
            posts = postsList
        )





    }
}