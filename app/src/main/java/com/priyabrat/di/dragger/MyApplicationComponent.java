package com.priyabrat.di.dragger;

import com.priyabrat.di.dragger.login.LoginActivity;
import com.priyabrat.di.dragger.main.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by PriyabratP on 15-03-2017.
 */

@Singleton
@Component(
        modules = {
                MyAppModule.class,
                MyPersistanceModule.class
        }
)
public interface MyApplicationComponent {

    void inject(HomeActivity mainActivity);
    void inject(LoginActivity loginActivity);
}
