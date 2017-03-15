package com.priyabrat.di.dragger;

import com.priyabrat.di.dragger.login.LoginActivity;
import com.priyabrat.di.dragger.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by PriyabratP on 15-03-2017.
 */

@Singleton
@Component(
        modules = {
                MyAppModule.class,
                LoginActivity.class,
                MainActivity.class
        }
)
public interface MyApplicationComponent {

    public void inject(MainActivity mainActivity);

    public void inject(LoginActivity loginActivity);

}
