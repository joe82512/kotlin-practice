package com.example.demo

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import java.util.Timer
import java.util.TimerTask

class sub1 : BaseActivity() {
    private var text1: TextView? = null
    // account system
    private var user: EditText? = null
    private var pwd: EditText? = null
    private var show: TextView? = null
    // activity 初始化
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)
        // get data from main activity
        var input:String? = intent.getStringExtra("input")
        text1 = findViewById<TextView>(R.id.text1) //connect UI元件
        text1?.setText(input) //change text

        // image
        //var img1 = findViewById<ImageView>(R.id.img1) //connect UI元件
        //img1.setImageResource(R.drawable.bear) //change image

        // progress bar
        var bar1 = findViewById<ProgressBar>(R.id.bar1) //connect UI元件
        var b = bar1.progress //get bar value
        var t = Timer() //timer
        t.schedule(object : TimerTask() {
            override fun run() {
                b = b+10 //counts
                bar1.progress = b //bar value
                if (b == bar1.max) {
                    bar1.progress = 0 //initial
                    bar1.visibility = View.INVISIBLE //hidden bar
                    //img1.setImageResource(R.drawable.web) //why crash?
                    t.cancel()
                }
            }
        }, 100, 1000)

        // user and password
        user = findViewById<EditText>(R.id.user) //connect UI元件
        pwd = findViewById<EditText>(R.id.pwd) //connect UI元件
        show = findViewById<TextView>(R.id.show) //connect UI元件
    }

    fun b1_click(view: View) {
        findViewById<ImageView>(R.id.img1).setImageResource(R.drawable.web) //change image
        //finish() //close activity -> back to main
        // Dialog
        var dialog = AlertDialog.Builder(this)
        dialog.setTitle("Confirm")
        dialog.setMessage("Back to Home ?")
        dialog.setCancelable(false) //不能用返回鍵關閉
        dialog.setPositiveButton("Yes") {
            dialog, which -> finish() //close activity -> back to main
        }
        dialog.setNegativeButton("No") {
            dialog, which -> //do nothing -> close dialog
        }
        dialog.show() //顯示對話方塊
    }

    fun b_create(view: View) {
        var save_account = getSharedPreferences("engine", Activity.MODE_PRIVATE) //設定儲存檔
        var account = save_account.edit() //建立儲存檔容器
        account.putString("user", user?.text.toString()) //設定key-value
        account.putString("pwd", pwd?.text.toString())
        account.commit() //灌入 (覆寫)
    }

    fun b_check(view: View) {
        var save_account = getSharedPreferences("engine", Activity.MODE_PRIVATE) //設定儲存檔
        var get_user = save_account.getString("user","") //讀取key-value
        var get_pwd = save_account.getString("pwd","")
        var get_data = "username: "+get_user+"\npassword"+get_pwd
        show?.setText(get_data) //show
    }
}