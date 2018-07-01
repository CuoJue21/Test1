package com.example.linxingguang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondAct extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("onCreate","------SecondAct---------");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("onNewIntent","------SecondAct---------");
    }

    public void click(View v){
        Intent intent = new Intent(this,ThirdAct.class);
        startActivity(intent);
    }

    public void click2(View v){
        finish();
    }
}
