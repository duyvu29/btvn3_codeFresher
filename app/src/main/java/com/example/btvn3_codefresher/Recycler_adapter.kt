package com.example.btvn3_codefresher

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.NO_POSITION
import androidx.recyclerview.widget.RecyclerView.Recycler
import kotlinx.android.synthetic.main.item_view.view.*

class Recycler_adapter (var list_itemt:List<Data>, var listener: ItemOnclicklistener): RecyclerView.Adapter<Recycler_adapter.Viewholder>() {



    inner class Viewholder(itemView: View ):RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)

        }

        override fun onClick(v: View?) {
            var position : Int= adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.Onitemclick(position)
            }

        }


    }
    interface ItemOnclicklistener{
        fun Onitemclick(position: Int)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
       // hàm này : chức năng này đặt chết độ xem để hiện thị các mục
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)


        return Viewholder(view)

    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        // hàm này được sử dụng để liện kết các mục trong danh sách với các tiện ích của chúng toi như Textview, IMgview
        holder.itemView.apply {
            img_item.setImageResource(list_itemt[position].img)
            txt_content.text = list_itemt[position].content
            txt_title.text= list_itemt[position].title
        }



    }

    override fun getItemCount(): Int {
        // trả về phần tử có trong danh sách
        return list_itemt.size
    }




}




