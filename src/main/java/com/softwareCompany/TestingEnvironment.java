package com.softwareCompany;

public enum TestingEnvironment {
    OBFUSCATED ("Obfuscated Testing"){
        public void defineActions(){
            System.out.println("Create a copy of the client instance with obfuscator tool and test the feature.");
        }

    },
    STAGING ("Staging Testing") {
        public void defineActions(){
            System.out.println("Access to Staging instance and set up the testing environment. Then test the feature");

        }

    },
    SANDBOX("Sandbox Testing") {

        public void  defineActions(){
            System.out.println("Access to Staging instance and set up the testing environment.  Then test the feature");
        }


    },
    PRODUCTION ("Production Testing"){
        public void defineActions(){
            System.out.println("Make sure that at least Staging or Sandbox testing are successful previous to move to production environment.");


        }
    };


    public final String testingPhase;

    //INTELLIJ suggest make final

    TestingEnvironment(String testingPhase) {
        this.testingPhase = testingPhase;
    }


    public String getTestingPhase() {
        return testingPhase;
    }



}




