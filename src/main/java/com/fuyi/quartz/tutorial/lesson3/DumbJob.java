package com.fuyi.quartz.tutorial.lesson3;

import org.quartz.*;

import java.util.ArrayList;
import java.util.Date;

public class DumbJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobKey key = context.getJobDetail().getKey();

        JobDataMap dataMap = context.getJobDetail().getJobDataMap();

        String jobSays = dataMap.getString("jobSays");
        float myFloatValue = dataMap.getFloat("myFloatValue");
//
//        JobDataMap dataMap = context.getMergedJobDataMap();  // Note the difference from the previous example
//
//        String jobSays = dataMap.getString("jobSays");
//        float myFloatValue = dataMap.getFloat("myFloatValue");
//        ArrayList state = (ArrayList)dataMap.get("myStateData");
//        state.add(new Date());

        System.err.println("Instance " + key + " of DumbJob says: " + jobSays + ", and val is: " + myFloatValue);
    }
}
