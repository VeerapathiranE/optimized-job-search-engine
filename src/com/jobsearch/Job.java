package com.jobsearch;

public class Job {

    private int id;
    private String title;
    private String company;
    private String skills;
    private String location;
    private double salary;

    public Job(int id, String title, String company,
               String skills, String location, double salary) {

        this.id = id;
        this.title = title;
        this.company = company;
        this.skills = skills;
        this.location = location;
        this.salary = salary;
    }

    public int getJobId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + company +
               " | " + skills + " | " + location +
               " | " + salary;
    }
}
