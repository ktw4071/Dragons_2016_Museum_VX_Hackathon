package com.None.ARTest;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DragonsSplashActivity extends AppCompatActivity {


    Intent intent;
    Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon_splash);
        start_button = (Button)findViewById(R.id.start_button);

        start_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                intent = new Intent(DragonsSplashActivity.this, UnityPlayerNativeActivity.class);
                startActivity(intent);
            }
        });


//        splashHander = new Handler() {
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                intent = new Intent(DragonsSplashActivity.this, UnityPlayerNativeActivity.class);
//                startActivity(intent);
//            }
//        };
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}