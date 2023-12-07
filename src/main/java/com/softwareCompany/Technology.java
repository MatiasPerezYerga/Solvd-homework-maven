package com.softwareCompany;

public enum Technology {

    JAVA("backend"),
    PYTHON ("backend"),
    JAVASCRIPT("backend and frontend"),
    HTML("frontend"),
    CSS ("frontend"),
    SQL("backend"),
    ANGULAR ("frontend"),
    NODE_JS("backend"),
    MONGODB("backend");


    private   String typeOfSkill;

    Technology(String typeOfSkill) {
        this.typeOfSkill = typeOfSkill;
    }


    public String getTypeOfSkill() {
        return typeOfSkill;
    }

    //Static block to initialize common resources

    static{
        System.out.println("Initializing Technology");
    }


  // Instance block
    {
        System.out.println("Setting up: " + this.typeOfSkill);

    }

}
