package com.juara.jobscheduller;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button btnStart;
    TaskService ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btnStart);



        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startScheduller();
            }
        });


    }

    MainScheduller mTestService;
    private static int kJobId = 0;


    public void startScheduller(){
        SchedullerJobs.scheduleJob(getApplicationContext());
    }









    @Override
    protected void onResume() {
        super.onResume();

    }


}
