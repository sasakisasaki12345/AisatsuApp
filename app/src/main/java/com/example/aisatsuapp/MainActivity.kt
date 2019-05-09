package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        showTimePickerDialog()


        }

    private fun showTimePickerDialog(){


        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{
                view,hour,minute ->
                if(2<=hour && hour<=9){
                    text1.text = "おはよう"
                }else if(10<=hour&& hour<=17){
                    text1.text = "こんにちは"
                }else if(hour <= 2 || 18 <=hour){
                text1.text = "こんばんは"
            }

            },
            13,0,true)

        timePickerDialog.show()


            }

    }

