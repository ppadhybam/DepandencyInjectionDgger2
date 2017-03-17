package com.priyabrat.di.dragger;

import android.app.Application;
import android.content.Context;

/**
 * Created by PriyabratP on 15-03-2017.
 */

public class MyApplication extends Application {

    MyApplicationComponent myApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplicationComponent = DaggerMyApplicationComponent.builder()
                .myAppModule(new MyAppModule(this))
                .myPersistanceModule(new MyPersistanceModule())
                .build();
    }

    public static MyApplicationComponent getComponent(Context context){
        return ((MyApplication)context.getApplicationContext()).myApplicationComponent;
    }
}
