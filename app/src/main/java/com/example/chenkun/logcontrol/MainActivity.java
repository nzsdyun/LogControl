package com.example.chenkun.logcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chenkun.logcontrol.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity created");
    }
}
