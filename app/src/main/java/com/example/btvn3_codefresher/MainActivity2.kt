package com.example.btvn3_codefresher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(), Recycler_adapter.ItemOnclicklistener {
    var list_aa = ArrayList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // khởi tạo list
        list_aa.add(Data(R.drawable.baby,"Hôm nay ăn gì???","Món ăn của bạn"))
        list_aa.add(Data(R.drawable.img,"Cửa hàng điện thoại","Bạn dùng dế yêu nào??"))
        // khởi tạo adapter
        var adaptere = Recycler_adapter(list_aa,this)
        rcv.adapter= adaptere
        rcv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

    }

    override fun Onitemclick(position: Int) {
        Toast.makeText(this ,"Item $position click",Toast.LENGTH_LONG).show()
        var clickedItem : Data = list_aa[position]
    }
}