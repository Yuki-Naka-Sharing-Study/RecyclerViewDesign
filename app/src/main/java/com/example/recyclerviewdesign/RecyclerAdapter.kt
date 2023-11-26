package com.example.recyclerviewdesign

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<ViewHolderItem>() {

    // 表示するデータを用意
    val nameList = listOf("My name0", "My name1", "My name2", "My name3", "My name4", "My name5")
    private val messageList = listOf("メッセージ０", "メッセージ１", "メッセージ２", "メッセージ３", "メッセージ４", "メッセージ５")
    private val imgList = listOf(
        R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5)

    // ここで１行分のレイアウト(View)を生成
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout, parent, false)
        return ViewHolderItem(itemXml)
    }

    // position番目のデータをレイアウト(xml)に表示するようセット
    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.tvNameHolder.text = nameList[position]
        holder.tvMessageHolder.text = messageList[position]
        holder.ivHolder.setImageResource(imgList[position])
    }

    // データが何件あるかをカウントする
    override fun getItemCount(): Int {
        return nameList.size
    }


}