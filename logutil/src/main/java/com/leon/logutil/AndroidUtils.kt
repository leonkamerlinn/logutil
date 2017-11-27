package com.leon.logutil

import android.util.Log
import android.view.View

/**
 * Created by Laxman Bhattarai on 6/6/17.
 * erluxman@gmail.com
 * https://github.com/erluxman
 * https://twitter.com/erluxman
 */

class AndroidUtils {
    
    companion object {
        val msg = "Helo From AndroidUtils"
        private val DEFAULT_TAG: String = "util_log"

        fun setVisibility(view: View, visible: Boolean) {
            if (visible) view.visibility = View.VISIBLE
            else view.visibility = View.GONE
        }


        fun log(logValue: String) {
            Log.d(DEFAULT_TAG, logValue)
        }
    }
}
