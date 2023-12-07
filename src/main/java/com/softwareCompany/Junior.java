package com.softwareCompany;

import org.apache.log4j.Logger;
public  final class Junior extends Employee {

    Logger logger=Logger.getLogger(Main.class);
    // A final class cannot be subclassed.
    /*These final entities serve different purposes in Java:

Final variables ensure their values remain constant.
Final methods prevent subclasses from changing their behavior.
Final classes prevent inheritance and ensure that the class cannot be extended.*/
    private String problem;

    final int PROBLEMS_QUANTITY = 1;


    public Junior(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, String problem) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.problem = problem;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }


    @Override
    public String toString() {
        return "I have  "+ this.PROBLEMS_QUANTITY + " problem:"+ this.problem+'.';
    }


    public final void buscarCafe() {
        //
        logger.info("Does any one need Coffe?");
        //System.out.println("Does any one need coffe? ");
    }

}
