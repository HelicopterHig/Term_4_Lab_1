package com.lab_1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    protected void onStart(){
        super.onStart();
        timerTask = new TimerTask();
        timerTask.execute(this);
    }

    protected void Die(){
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed(){
        timerTask.cancel(true);
        super.onBackPressed();
    }
}
