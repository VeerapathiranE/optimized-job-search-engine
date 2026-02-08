package com.jobsearch;

import java.util.*;

public class JobService {

    private Map<Integer, Job> jobMap = new HashMap<>();

    public JobService() {

        // LOAD FROM TXT
        List<Job> jobs =
                FileManager.loadJobs("jobs.txt");

        for (Job j : jobs) {
            jobMap.put(j.getJobId(), j);
        }
    }

    public void addJob(Job job) {
        jobMap.put(job.getJobId(), job);
    }

    public void viewAllJobs() {

        if (jobMap.isEmpty()) {
            System.out.println("No jobs available.");
            return;
        }

        for (Job j : jobMap.values()) {
            System.out.println(j);
        }
    }

    public List<Job> getAllJobs() {
        return new ArrayList<>(jobMap.values());
    }

    public void deleteJob(int id) {
        jobMap.remove(id);
        System.out.println("Job deleted.");
    }
}
