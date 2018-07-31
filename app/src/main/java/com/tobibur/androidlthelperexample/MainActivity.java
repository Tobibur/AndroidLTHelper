package com.tobibur.androidlthelperexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tobibur.androidlthelper.LogHelper;
import com.tobibur.androidlthelper.ToastHelper;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private LogHelper lh = new LogHelper(TAG);

    private ToastHelper th = new ToastHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lh.debug("Debug is working");

        lh.infos("Info is working");

        th.toast("This is short msg");

        th.toastlong("This is long msg");

    }
}
