package com.priyabrat.di.dragger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PriyabratP on 15-03-2017.
 */

@Module
public class MyAppModule {

    private MyApplication myApplication;

    public MyAppModule(MyApplication myApplication){
        this.myApplication = myApplication;
    }

    @Provides
    @Singleton
    public MyApplication provideMyApplication(){
        return myApplication;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return myApplication;
    }
}
