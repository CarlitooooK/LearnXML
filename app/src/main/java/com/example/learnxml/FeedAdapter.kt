package com.example.learnxml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FeedAdapter(
    private val posts:List<Post>
) : RecyclerView.Adapter<FeedAdapter.PostViewHolder>() {

    class PostViewHolder(view:View): RecyclerView.ViewHolder(view){
        private val postTextView = view.findViewById<TextView>(R.id.post)
        private val creatorTextView = view.findViewById<TextView>(R.id.creator)
        fun bind(post:Post){
            postTextView.text = post.text
            creatorTextView.text = post.creator.user.fullName

        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PostViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_post,p0,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(p0: PostViewHolder, p1: Int) {
        val post = posts[p1]
        p0.bind(post)
    }
}
