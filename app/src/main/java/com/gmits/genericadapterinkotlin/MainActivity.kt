package com.gmits.genericadapterinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.view.*

class MainActivity : AppCompatActivity() {

    private val mData = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewAdapter = RecyclerViewGenericAdapter(R.layout.item, onBind = { view, item, position ->
            view.txtName.text = mData[position].name
        }, onViewClicked = { view, item, position ->
            toast(mData[position].name)
        })
        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerViewAdapter.addItems(getData())
    }

    /*private fun getData(): ArrayList<String> {
        mData.add("Lollipop")
        mData.add("Marshmallow")
        mData.add("Nougat")
        mData.add("Oreo")
        mData.add("Pie")
        mData.add("Queen Cake")
        return mData
    }*/

    private fun getData(): ArrayList<Model> {
        val model1 = Model()
        model1.name = "Lollipop"

        val model2 = Model()
        model2.name = "Marshmallow"

        val model3 = Model()
        model3.name = "Nougat"

        val model4 = Model()
        model4.name = "Oreo"

        val model5 = Model()
        model5.name = "Pie"

        val model6 = Model()
        model6.name = "Queen Cake"

        mData.add(model1)
        mData.add(model2)
        mData.add(model3)
        mData.add(model4)
        mData.add(model5)
        mData.add(model6)
        return mData
    }
}
