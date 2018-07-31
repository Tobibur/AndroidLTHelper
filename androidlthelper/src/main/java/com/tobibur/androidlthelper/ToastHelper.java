package com.tobibur.androidlthelper;

import android.content.Context;
import android.widget.Toast;

public class ToastHelper {
    private Context mContext;

    public ToastHelper(Context context) {
        mContext = context;
    }

    public void toast(String message){
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }

    public void toastlong(String message){
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }
}
