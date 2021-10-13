package com.example.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : BaseActivity() {
    private var edit1:EditText? = null
    private var text1:TextView? = null
    // activity 初始化
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //繼承
        setContentView(R.layout.activity_main) //connect UI
        edit1 = findViewById<EditText>(R.id.edit1) //connect UI元件
        text1 = findViewById<TextView>(R.id.text1) //connect UI元件
    }

    fun b1_click(view:View) {
        text1?.setText(edit1?.text) //show text
        Toast.makeText(this, text1?.text, Toast.LENGTH_LONG).show() //toast
    }

    //change page
    fun b2_click(view:View) {
        //finish() //close activity
        var intent = Intent("sub")
        intent.addCategory("sub_activity") //filter
        var msg:String = text1?.text.toString() //create message
        intent.putExtra("input", msg) //send data
        startActivity(intent)
    }
    //change to web
    fun chrome(view: View) {
        var intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://anime1.me/category/2021%e5%b9%b4%e5%86%ac%e5%ad%a3/%e8%b3%bd%e9%a6%ac%e5%a8%98pretty-derby-%e7%ac%ac%e4%ba%8c%e5%ad%a3"))
        startActivity(intent)
    }
    //change to tel
    fun phone(view: View) {
        var intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse("tel:0000"))
        startActivity(intent)
    }
}