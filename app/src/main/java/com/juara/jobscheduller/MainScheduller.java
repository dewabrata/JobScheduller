package com.juara.jobscheduller;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class MainScheduller extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Intent service = new Intent(getApplicationContext(), TaskService.class);
        getApplicationContext().startService(service);
        SchedullerJobs.scheduleJob(getApplicationContext()); // reschedule the job
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }

}
