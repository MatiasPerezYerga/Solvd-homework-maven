package com.softwareCompany;

public class Consultant  extends Employee implements ProductPresenter, ClientNegotiator {

    private  int softSkills;
    private int languageSkills;


    public Consultant(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, int softSkills, int languageSkills) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.softSkills = softSkills;
        this.languageSkills = languageSkills;
    }

    public int getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(int softSkills) {
        this.softSkills = softSkills;
    }

    public int getLanguageSkills() {
        return languageSkills;
    }

    public void setLanguageSkills(int languageSkills) {
        this.languageSkills = languageSkills;
    }


    @Override
    public void negotiate() {

        System.out.println("Ok.Your requested has been proceesed. In order to move foward .Please complete the following information:");

    }

    @Override
    public void presentProduct() {
        System.out.println("The software has Paypal and Payoneer Integration. Also from the portal...bla bla bla");
    }
}
