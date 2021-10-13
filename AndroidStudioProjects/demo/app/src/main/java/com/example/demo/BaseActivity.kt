package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //繼承
        Log.d("BaseActivity",javaClass.simpleName+": onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("BaseActivity",javaClass.simpleName+": onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("BaseActivity",javaClass.simpleName+": onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("BaseActivity",javaClass.simpleName+": onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("BaseActivity",javaClass.simpleName+": onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("BaseActivity",javaClass.simpleName+": onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("BaseActivity",javaClass.simpleName+": onRestart")
    }
}