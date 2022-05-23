package com.example.retorecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retorecycleview.databinding.ItemAmigosconozcasBinding

import org.json.JSONObject

class MainAdapter(private val videos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemAmigosconozcasBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int {

        return videos.size
    }

    class MainHolder(val binding:ItemAmigosconozcasBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(video: JSONObject) {
//TODDO assign text and image values in render function
            binding.txtnombre.setText(video.getString("nombre"))
            binding.txtamigos.setText(video.getString("amigos"))
            binding.ivImagen.setImageResource(R.drawable.personn)

        }
    }


}