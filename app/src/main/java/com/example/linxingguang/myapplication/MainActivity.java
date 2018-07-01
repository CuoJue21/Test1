package com.example.linxingguang.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = new String("ddd");
//        button = findViewById(R.id.button);
        Log.i("onCreate","------MainActivity---------");

    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("onNewIntent","------MainActivity---------");

    }

    public void click(View v){
        Intent intent = new Intent(this,SecondAct.class);
        startActivity(intent);
    }
}
