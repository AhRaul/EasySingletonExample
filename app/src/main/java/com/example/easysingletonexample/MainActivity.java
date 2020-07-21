package com.example.easysingletonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SomeSingletone someSingletone = AppConfig.getInstance().getSomeSingletone();    //вызов инициализированного синглтона

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        someSingletone.outLog();                            //использование метода синглтона
    }
}
