package com.softwareCompany;//private modifier can only be applied to Nested Classes

// A class can implement more than one interface.

public abstract class  Person {

    private int age;
    private String name;
    private String lastName;
    private String languageContact;
    private Integer id;

    //constructor parametrizador que asigna/inicializa los valores q vienen
    public Person(int pepe, String name, String lastName, String languageContact, Integer id) {
        this.age = pepe;
        this.name = name;
        this.lastName = lastName;
        this.languageContact = languageContact;
        this.id = id;
    }



    // getters and setters
    public int getAge() {
        return age;
    }
    //pepe.setAge(5);
    public void setAge(int age) {

        this.age= 4;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguageContact() {
        return languageContact;
    }

    public void setLanguageContact(String languageContact) {
        this.languageContact = languageContact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Abstract method
    public abstract void introduce(); // Abstract method to be overridden // DOESNT HAVE BRACKETS!!!



    //Static Block:
    //A static block is a block of code enclosed in curly braces that's executed when the class is loaded into memory.
    // It is executed only once when the class is first loaded.
    static {
        // Code in the static block
        System.out.println("This is a static block.");
        // Other code in the static block
    }
//The static block is executed only once when the class is loaded. It's often used to initialize static variables or to perform any necessary one-time setup for the class.

    //These static elements (block, method, and variable) are associated with the class itself
    // rather than with specific instances of the class and are often used for various purposes
    // such as initialization, utility functions, or managing shared data across all instances of the class.
}
