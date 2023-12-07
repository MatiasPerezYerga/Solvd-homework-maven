package com.softwareCompany;

import java.util.Arrays;

public class FrontendDev extends Employee {

    private String[] frontendLangs;

    public FrontendDev(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, String[] frontendLangs) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.frontendLangs = frontendLangs;
    }

    public String[] getFrontendLangs() {
        return frontendLangs;
    }

    public void setFrontendLangs(String[] frontendLangs) {
        this.frontendLangs = frontendLangs;
    }


    @Override
    public void code() {
        System.out.println("Frontend developer is coding the user interface...");
    }

    @Override
    public String toString() {
        return "The backUp.FrontendDev languages are "+ Arrays.toString(frontendLangs);
    }

}
