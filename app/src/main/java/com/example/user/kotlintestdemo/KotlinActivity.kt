package com.example.user.kotlintestdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class KotlinActivity : AppCompatActivity() {
    // var means mutable object
    var var1 = 5;
    var var2 = 6



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        // val means immutable,read-only object...just like final in java
        val a:Int = 0
        val b:Int = 1
        val c = 2
        val d: Int
        d = 8
        var1 = 7
        var2 = 8




    }


    // returns int
    private fun addNumber(a:Int,b:Int):Int{
        // parameters a and b are implicitely val...so immutable
        return a+b;

    }
}
