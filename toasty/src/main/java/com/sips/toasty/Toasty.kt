package com.sips.toasty

import android.content.Context
import android.widget.Toast

 class Toasty {
     fun Toaster(context: Context, msg: String) {
       Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}