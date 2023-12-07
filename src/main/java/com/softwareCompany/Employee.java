package com.softwareCompany;


public class Employee extends Person {

    private Integer employeeId;
    private double salary;


    //A final variable can't be changed after it's initialized.
    final int ACCESS_COMPANY= 15463;
    public Employee(int age, String name, String lastName, String languageContact, Integer id,Integer employeeId, double salary) {
        super(age, name, lastName, languageContact, id);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public  void code() {
        System.out.println("backUp.Employee is coding...");
    }



    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void introduce() {
        System.out.println("I'm an employee with ID " + employeeId + ". My name is " + getName() + " " + getLastName() + ".");
    }




    public final void giveAccess() {
        System.out.println("The access code is:"+ this.ACCESS_COMPANY);
    }

}
