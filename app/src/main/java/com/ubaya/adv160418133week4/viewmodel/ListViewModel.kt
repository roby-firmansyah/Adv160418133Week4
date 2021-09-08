package com.ubaya.adv160418133week4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.adv160418133week4.model.Student

class ListViewModel:ViewModel() {
    val studentsLD = MutableLiveData<List<Student>>()
    val loadingErrorLD = MutableLiveData<Boolean>()
    val loadingDoneLD = MutableLiveData<Boolean>()

    fun refresh() {
        val student1 =
            Student("29-7346075","Loni","1983-08-11","4387287239","http://dummyimage.com/100x75.png/dddddd/000000")
        val student2 =
            Student("25-2223397","Ashley","1953-11-25","3818143583","http://dummyimage.com/100x75.png/ff4444/ffffff")
        val student3 =
            Student("52-2712075","Cammi","1957-08-12","3319401761","http://dummyimage.com/100x75.png/cc0000/ffffff")

        val studentList:ArrayList<Student> = arrayListOf<Student>(student1, student2, student3)
        studentsLD.value = studentList
        loadingErrorLD.value = false
        loadingDoneLD.value = true
    }
}