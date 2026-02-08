package com.jobsearch;

import java.io.*;
import java.util.*;

public class FileManager {

    public static List<Job> loadJobs(String fileName) {

        List<Job> jobs = new ArrayList<>();

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = br.readLine()) != null) {

                String[] p = line.split("\\|");

                int id = Integer.parseInt(p[0]);
                String title = p[1];
                String company = p[2];
                String skills = p[3];
                String location = p[4];
                double salary = Double.parseDouble(p[5]);

                jobs.add(new Job(id, title, company,
                                 skills, location, salary));
            }

            br.close();

        } catch (Exception e) {
            System.out.println("File not found.");
        }

        return jobs;
    }
}
