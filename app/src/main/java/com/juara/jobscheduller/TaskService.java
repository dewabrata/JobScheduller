package com.juara.jobscheduller;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TaskService extends Service {
    private final IBinder mBinder = new MyBinder();


    //assume we start this service with activity.bindService

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        postDataGPS();
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        postDataGPS();
        return mBinder;
    }

    public class MyBinder extends Binder {
        TaskService getService() {
            return TaskService.this;
        }
    }



    private void postDataGPS() {


        Toast.makeText(TaskService.this,"JALAN\" + new Date()",Toast.LENGTH_SHORT).show();
        Log.d("TASSSSK SERVICE","JALAN " + new Date());
    }
}
