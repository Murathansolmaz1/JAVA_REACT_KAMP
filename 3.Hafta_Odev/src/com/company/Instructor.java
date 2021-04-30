package com.company;

public class Instructor extends User{

    private String job;

    public String getJob() {
        return "Instructor's Job : " + job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
