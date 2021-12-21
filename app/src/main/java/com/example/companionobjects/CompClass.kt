package com.example.companionobjects

import android.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout

class CompClass {
    companion object{
        var time = ""
        fun changeBK(main:ConstraintLayout){
            if (time == "day"){
                main.setBackgroundResource(R.drawable.daybk)

            }else if (time == "night"){
                main.setBackgroundResource(R.drawable.nightbkk)
            }else{
                main.setBackgroundColor(Color.WHITE)
            }
        }
    }
}