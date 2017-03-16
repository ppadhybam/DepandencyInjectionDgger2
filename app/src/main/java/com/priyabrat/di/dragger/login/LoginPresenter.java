package com.priyabrat.di.dragger.login;

import android.app.Activity;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by PriyabratP on 16-03-2017.
 */

public class LoginPresenter {

    @Inject
    public LoginPresenter(LoginContract.View view){

    }

    public void getData(Activity activity){
        Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT).show();
    }
}
