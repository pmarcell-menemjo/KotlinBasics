package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.RUser
import com.example.myapplication.model.User

class RandomUserAdapter(private val userList: List<RUser>) :
    RecyclerView.Adapter<RandomUserAdapter.RandomUserViewHolder>() {

    class RandomUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.imageview_profile)
        val nameText: TextView = itemView.findViewById(R.id.textview_name)
        val emailText: TextView = itemView.findViewById(R.id.textview_email)
        val countryText: TextView = itemView.findViewById(R.id.textview_country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_randomuser, parent, false)
        return RandomUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: RandomUserViewHolder, position: Int) {
        val user = userList[position]
        holder.nameText.text = user.name.first + " " + user.name.last
        holder.emailText.text = user.email
        holder.countryText.text = user.location.country

        Glide.with(holder.itemView.context)
            .load(user.picture.medium)
            .placeholder(R.drawable.user)
            .error(R.drawable.ic_launcher_background)
            .into(holder.profileImage)
    }

    override fun getItemCount() = userList.size
}