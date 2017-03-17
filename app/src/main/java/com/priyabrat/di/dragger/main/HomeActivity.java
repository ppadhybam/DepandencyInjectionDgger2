package com.priyabrat.di.dragger.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.priyabrat.di.dragger.R;

import dagger.Module;

@Module
public class HomeActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
}
