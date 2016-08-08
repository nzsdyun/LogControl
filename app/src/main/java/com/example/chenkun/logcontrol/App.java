package com.example.chenkun.logcontrol;

import com.example.chenkun.logcontrol.util.SApp;

/**
 * Created by sky on 8/8/2016.
 */
public class App extends SApp {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected boolean isDebugMode() {
        //here you can control the log switch
        return false;
    }

    @Override
    protected String hostPath() {
        return "";
    }
}
