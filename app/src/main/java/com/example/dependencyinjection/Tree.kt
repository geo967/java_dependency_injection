package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject


class Tree @Inject constructor(var branch: Branch ) {

    fun shake(){
        Log.d("CAT","shaking the branch")
    }
    fun getTreeNumber(){
        Log.d("CAT","This is the 1st Tree")

    }
}