package com.priyabrat.di.dragger;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PriyabratP on 17-03-2017.
 */

@Module
public class MyPersistanceModule {

    static final String PREFS_DEFAULT = "priyabratPreferences";

    public MyPersistanceModule(){

    }

    @Provides
    @Singleton
    SharedPreferences providePreference(Application app) {
        return app.getSharedPreferences(PREFS_DEFAULT, Context.MODE_PRIVATE);
    }
}
