package com.workintech.SpringBoot.mapping;

import model.Developer;

public class  DeveloperResponse {

        private Developer developer;
        private String massage;
        private int status;

    public DeveloperResponse(Developer developer, String massage, int status) {
        this.developer = developer;
        this.massage = massage;
        this.status = status;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
