package com.softwareCompany;

public enum EnumBugSeverity {

    CRITICAL(10) {

        public void handleBug() {
            // Custom handling for critical bugs
            System.out.println("Handling Critical Bug: Escalate immediately to the development team!");
        }
    },
    HIGH(8) {

        public void handleBug() {
            // Custom handling for high-severity bugs
            System.out.println("Handling High Bug: Assign to the development team for a quick resolution.");
        }
    },
    MEDIUM(5) {

        public void handleBug() {
            // Custom handling for medium-severity bugs
            System.out.println("Handling Medium Bug: Schedule for the next sprint.");
        }
    },
    LOW(2) {

        public void handleBug() {
            // Custom handling for low-severity bugs
            System.out.println("Handling Low Bug: Log and monitor; fix in future releases if necessary.");
        }
    };


    private final int severityLevel;



    // Static block to initialize common resources
    static {
        System.out.println("Initializing Bug Severity Enum");
    }

    // Constructor

    EnumBugSeverity(int severityLevel) {

        this.severityLevel = severityLevel;

    }

    // Instance method
    public int getSeverityLevel() {
        return severityLevel;
    }

    // Abstract method to be implemented by each enum constant
    public abstract void handleBug();

    // Instance block
    {
        System.out.println("Setting up Bug Severity: " + this.name());
    }
}
