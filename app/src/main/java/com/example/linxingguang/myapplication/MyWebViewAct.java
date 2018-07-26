package com.example.linxingguang.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class MyWebViewAct extends Activity {

    WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.layout_my_webviewact);

        //https://www.2cto.com/kf/201710/692588.html
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://www.2cto.com/kf/201710/692588.html");
        Intent intent = new Intent();
        this.startActivity(intent);
//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
    }

}
