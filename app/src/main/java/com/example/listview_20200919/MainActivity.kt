package com.example.listview_20200919

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listview_20200919.adapter.StudentAdapter
import com.example.listview_20200919.data.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudents = ArrayList<Student>()

    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudents.add(Student("조경진", "서울시 은평구", 1988))
        mStudents.add(Student("구도희", "인천시 부평구", 1995))
        mStudents.add(Student("모준승", "안양시 동안구", 1992))
        mStudents.add(Student("백창주", "서울시 관악구", 1988))
        mStudents.add(Student("신동철", "서울시 종로구", 1987))
        mStudents.add(Student("신지환", "서울시 금천구", 1991))
        mStudents.add(Student("우병현", "서울시 관악구", 1986))
        mStudents.add(Student("이도형", "서울시 광진구", 1974))
        mStudents.add(Student("임태규", "서울시 송파구", 1969))
        mStudents.add(Student("최성호", "경기도 부천시", 1979))
        mStudents.add(Student("주지현", "서울시 송파구", 1993))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudents)
        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->
            val clicked = mStudents[position]

            Toast.makeText(this, clicked.name, Toast.LENGTH_SHORT).show()
        }


    }
}