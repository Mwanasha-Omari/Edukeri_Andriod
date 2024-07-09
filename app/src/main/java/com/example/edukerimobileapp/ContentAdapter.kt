package com.example.edukerimobileapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContentAdapter (private val contentList: List<Content>):
RecyclerView.Adapter<ContentViewHolder>() {
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
val itemView=LayoutInflater.from(parent.context)
   .inflate(R.layout.content_list,parent,false)
      return ContentViewHolder(itemView)
   }

   override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
val content=contentList[position]
      holder.tvContent.text=content.image
      holder.tvLevel.text=content.text
   }

   override fun getItemCount(): Int {
return contentList.size
   }
}


class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
   val tvLevel=itemView.findViewById<TextView>(R.id.tvLevel)
   val tvContent=itemView.findViewById<TextView>(R.id.tvContent)
}
