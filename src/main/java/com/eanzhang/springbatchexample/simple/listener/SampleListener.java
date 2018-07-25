package com.eanzhang.springbatchexample.simple.listener;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobExecution;
public class SampleListener implements JobExecutionListener{
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("**** before Job:"+jobExecution.getJobInstance()+" ****");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("after Job:"+jobExecution.getStatus());
    }
}
