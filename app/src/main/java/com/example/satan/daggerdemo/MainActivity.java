package com.example.satan.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LoginHandler loginHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginHandlerComponent component = DaggerLoginHandlerComponent.builder().loginHandlerModule(new LoginHandlerModule()).build();

        loginHandler = component.provideLoginHandler();

        Toast.makeText(this, "Testing password length < 5", Toast.LENGTH_LONG).show();
        Toast.makeText(this, String.valueOf(loginHandler.login("test", "pass")), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Testing password length > 5", Toast.LENGTH_LONG).show();
        Toast.makeText(this, String.valueOf(loginHandler.login("test", "password")), Toast.LENGTH_LONG).show();
    }
}
