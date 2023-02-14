package com.hfad.gtrain.fragments.exerciseDetail.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.gtrain.fragments.exerciseDetail.itemLayouts.VpImagesLayout

class VpImagesAdapter(val context: Context) :
    RecyclerView.Adapter<VpImagesAdapter.VpImagesViewHolder>() {
    private var imageList = emptyList<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VpImagesViewHolder {
        return VpImagesViewHolder(VpImagesLayout(context))
    }

    override fun onBindViewHolder(holder: VpImagesViewHolder, position: Int) {
        val imageUrl = imageList[position]
        println("on bind works")
        holder.layout.fillContent(imageUrl)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    fun setData(imageUrlList: List<String>){
        imageList = imageUrlList
    }

    inner class VpImagesViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val layout = itemView as VpImagesLayout
    }
}