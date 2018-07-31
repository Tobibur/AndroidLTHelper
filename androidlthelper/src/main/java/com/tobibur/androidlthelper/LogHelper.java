package com.tobibur.androidlthelper;

import android.util.Log;

public class LogHelper {

   private String TAG;

    public LogHelper(String tag) {
        TAG = tag;
    }

    public void debug(String string){
        Log.d(TAG, "debug: "+string);
    }

    public void infos(String string){
        Log.i(TAG, "infos: "+string);
    }

}
