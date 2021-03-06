package com.priyabrat.di.dragger.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.priyabrat.di.dragger.MyApplication;
import com.priyabrat.di.dragger.R;
import com.priyabrat.di.dragger.main.HomeActivity;
import com.priyabrat.di.dragger.remote.HttpAuthenticate;


import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LoginActivity extends AppCompatActivity {

    @InjectView(R.id.editTextUserName)
    EditText editTextUserName;

    @InjectView(R.id.editTextUserPass)
    EditText editTextUserPass;

    @InjectView(R.id.btnLogin)
    Button btnLogin;

    @Inject
    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        MyApplication.getComponent(this).inject(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isSuccess = HttpAuthenticate.makeLogin(sharedPreferences,editTextUserName.getText().toString(),editTextUserPass.getText().toString());
                if(isSuccess){
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                }
            }
        });
    }

}

