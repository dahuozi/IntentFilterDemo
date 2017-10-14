package com.dahuozi.intentfilterdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view)
    {
        switch (view.getId()){
            case R.id.btn1:
                Intent intent = new Intent();
                intent.setAction("com.dahuozi.action");
                //intent.setData(Uri.parse("dahuozi://com"));
                intent.setDataAndType(Uri.parse("dahuozi://com"),"text/*");
                startActivity(intent);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent();
                intent2.setAction("com.dahuozi.intent");
                startActivity(intent2);
                break;
        }
    }
}
