package com.priyabrat.di.dragger.remote;

import android.content.SharedPreferences;

/**
 * Created by PriyabratP on 17-03-2017.
 */

public class HttpAuthenticate {

    public static final String KEY_LOGGED_IN = "is_logged_in";

    public static boolean makeLogin(SharedPreferences sharedPreferences,String userName,String userPass){
        if(sharedPreferences.getBoolean(KEY_LOGGED_IN,false)){
            return true;
        }else {
            if(userName.equalsIgnoreCase("admin") && userPass.equalsIgnoreCase("admin")){
                // Authenticate Using Login WebService, For Example checking hard coded data
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(KEY_LOGGED_IN,true);
                editor.commit();
                return true;
            }else {
                return false;
            }
        }
    }
}
