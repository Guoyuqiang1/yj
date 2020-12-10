package com.example.myapplication.application;

public class Application extends android.app.Application {
    //application上下文
    public static Application CONTEXT;
    @Override
    public void onCreate() {
        super.onCreate();
        CONTEXT = this;
    }
}
