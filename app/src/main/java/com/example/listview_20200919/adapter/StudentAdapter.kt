package com.example.listview_20200919.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listview_20200919.R
import com.example.listview_20200919.data.Student
import java.util.*
import kotlin.collections.ArrayList

class StudentAdapter(
    mContext: Context, // 어디서 사용되는지?
    resId: Int,
    mList: ArrayList<Student>
) : ArrayAdapter<Student>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (convertView == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val student = this.getItem(position)!!

        val calendar = Calendar.getInstance()
        val koreanAge = calendar.get(Calendar.YEAR) - student.birthYear + 1

        row.findViewById<TextView>(R.id.name).text = student.name
        row.findViewById<TextView>(R.id.age).text = "(${koreanAge}세)"
        row.findViewById<TextView>(R.id.address).text = student.address

        return row

    }


}