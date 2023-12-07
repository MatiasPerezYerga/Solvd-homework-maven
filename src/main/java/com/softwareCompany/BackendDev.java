package com.softwareCompany;

import java.util.Arrays;



public class BackendDev extends Employee {



    public BackendDev(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, String[] langs) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.langs = langs;
    }

    private String[] langs ;

    public String[] getLangs() {
        return langs;
    }

    public void setLangs(String[] langs) {
        this.langs = langs;
    }

    @Override
    public void code() {
        System.out.println("Backend developer is coding the server-side logic...");
    }

    @Override
    public String toString() {
        return "The  backUp.BackendDev language are:+"+ Arrays.toString(langs);
    }
}





