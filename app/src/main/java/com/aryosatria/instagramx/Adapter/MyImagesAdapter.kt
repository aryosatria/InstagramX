package com.aryosatria.instagramx.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.aryosatria.instagramx.R
import com.aryosatria.instagramx.model.Post
import com.squareup.picasso.Picasso

class MyImagesAdapter(private val mContext: Context, mPost: List<Post>)
    :RecyclerView.Adapter<MyImagesAdapter.ViewHolder?> (){

    private var mPost: List<Post>? = null

    init {
        this.mPost = mPost
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.image_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mPost!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post: Post = mPost!![position]

        Picasso.get().load(post.getPostimage()).into(holder.postImage)
    }
    class ViewHolder(@NonNull itemview: View)
        : RecyclerView.ViewHolder(itemview) {

        var postImage: ImageView = itemview.findViewById(R.id.post_image_grid)
    }

}