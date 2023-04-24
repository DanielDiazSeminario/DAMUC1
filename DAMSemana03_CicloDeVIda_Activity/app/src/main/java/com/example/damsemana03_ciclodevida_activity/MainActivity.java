package com.example.damsemana03_ciclodevida_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Entramos al método onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.printf("Entramos al método OnRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Entramos al método OnStar");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Ingreamos al método OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Entramos al método OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Entramos al método onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Entramos al método OnDestroy");
    }
}