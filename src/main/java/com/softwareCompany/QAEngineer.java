package com.softwareCompany;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class QAEngineer extends Employee implements Debugger, Developer, RequirementsAnalyst, Classificator {

    Logger logger= Logger.getLogger(Main.class);

    private String solution;

    private List<String> skills;  // List collection for storing skills
    private Set<String> projects; // Set collection for storing projects
    private Map<String, Integer> experience; // Map collection for storing experience (skill, years)
    private Queue<String> tasks; // Queue collection for storing tasks

    private CustomCollection<String> customCollection; // Custom collection

    public QAEngineer(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, String solution, List<String> skills, Set<String> projects, Map<String, Integer> experience, Queue<String> tasks, CustomCollection<String> customCollection) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.solution = solution;
        this.skills = skills;
        this.projects = projects;
        this.experience = experience;
        this.tasks = tasks;
        this.customCollection = customCollection;
    }

    /*int age = 25;
    String name = "John";
    String lastName = "Doe";
    String languageContact = "English";
    Integer id = 1;
    Integer employeeId = 101;
    double salary = 50000.0;
    String solution1 = "Sample solution";
    List<String> skills = Arrays.asList("Java", "Testing", "Automation");
    Set<String> projects = new HashSet<>(Arrays.asList("ProjectA", "ProjectB"));
    Map<String, Integer> experience = new HashMap<>();
        experience.put("Java", 3);
        experience.put("Testing", 2);
    Queue<String> tasks = new LinkedList<>(Arrays.asList("Task1", "Task2", "Task3"));
    backUp.CustomCollection<String> customCollection = new backUp.CustomCollection<>();*/



    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Set<String> getProjects() {
        return projects;
    }

    public void setProjects(Set<String> projects) {
        this.projects = projects;
    }

    public Map<String, Integer> getExperience() {
        return experience;
    }

    public void setExperience(Map<String, Integer> experience) {
        this.experience = experience;
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public void setTasks(Queue<String> tasks) {
        this.tasks = tasks;
    }

    public CustomCollection<String> getCustomCollection() {
        return customCollection;
    }

    public void setCustomCollection(CustomCollection<String> customCollection) {
        this.customCollection = customCollection;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }



    /*public backUp.QAEngineer(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, String solution) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.solution = solution;
    }*/


    @Override
    public String toString() {

        return "QAEngineer{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", languageContact='" + getLanguageContact() + '\'' +
                ", id=" + getId() +
                ", employeeId=" + getEmployeeId() +
                ", salary=" + getSalary() +
                ", solution='" + solution + '\'' +
                ", skills=" + skills +
                ", projects=" + projects +
                ", experience=" + experience +
                ", tasks=" + tasks +
                ", customCollection=" + customCollection +
                '}';
    }

    @Override
    public void introduce() {
        super.introduce();
        logger.info("I'm QA ENGINEER and the solution is " + getSolution());
        // System.out.println("I'm QA ENGINEER and the solution is " + getSolution());
    }

    @Override
    public void code() {
        super.code();
        logger.info("I can code frontend and backend side in order to debug it");
        // System.out.println("I can code frontend and backend side in order to debug it");
    }

    @Override
    public void debug() {
        logger.info("First I will check de Frontend, and then...Backend");
        // System.out.println("First I will check de Frontend, and then...Backend");
    }



    public void testExampleScenario() throws TestFailedException {

        boolean condition = testing1();

        if (!condition) {
            throw new TestFailedException("The result of test was FAILED");
        }
    }


    public  boolean testing1(){
        logger.info("Performing QA testing 1.");
        //System.out.println("Performing QA testing 1.");
        return false;
    }

    public void enterWrongAccessCode(int key) throws AccessDeniedException {

        if (key != 15463) {
            // System.out.println("WRONG KEY!");
            throw new AccessDeniedException("Wrong from the QAEnginnerClass");
        }

    }


    public void checkAccessCode() {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Enter access code: ");
            System.out.print("Enter access code: ");
            int userEnteredCode = scanner.nextInt();
            logger.info("The given code was:" + userEnteredCode);
            enterWrongAccessCode(userEnteredCode);

            logger.info("Access granted!");
            System.out.println("Access granted!"); // This will be printed if the access code is correct
        } catch (AccessDeniedException e) {
            logger.info("Access denied: " + e.getMessage());
            System.err.println("Access denied: " + e.getMessage());

        } catch (Exception e) {
            logger.info("An unexpected error occurred: " + e.getMessage());
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    //COLLECTION METHOD'S
    //Collection: skill Class: ArrayList<>();  List<String>;
    public void addSkill(String skill) {
        skills.add(skill);
    }

    //Collection: Projects HashSet<>(); Set<String> projects;
    public void addProject(String project) {

        projects.add(project);
    }

    ////Collection: Experience  Class --> HashMap<>(); Interface Map();
    public void addExperience(String skill, int years) {

        experience.put(skill, years);
    }

    // //Collection: Task   LinkedList<>(); Interface Queue<String>
    public void addTask(String task) {

        tasks.add(task);
    }

    ////Collection:  customCollection backUp.CustomCollection<>(); backUp.CustomCollection<String>
    public void addToCustomCollection(String item) {

        customCollection.add(item);
    }


    //Runnable (No input, No output):

    Runnable qaRunnable = () ->{

        System.out.println("Standard is are executing");
    };


    Supplier<String> qaSupplier = () -> {
        // Your code here
    int accessCode= 1546;

        return "This access code provide by the supplier is "+ accessCode+".";
    };

    /*Predicate<Integer> qaAccessCodePredicate = (num) -> {
        return num ==1546;
    };*/

    // Lambda Expression --> more compact
    Predicate<Integer> qaAccessCodePredicate = (num) -> num ==1546;


    // Function

    Function<Integer , Integer> qaSquareFunction = (x)-> x*x;

    // Consumer


    Consumer<String> tomarCafe = (cafe)-> {
        System.out.println("In order to debuggate first, I will drink a " + cafe);
    };



    // GENERICS METHODS WITH LAMBDA EXPRESSIONS


    //QaEnginner Has the ability to interpret different types of data
    //Using A lambda with Generics
    @Override
    public void applyRequirementsAnalysis(Object newInput) {

     List<String> inputs = new ArrayList<>( List.of("Feature 1 1", "Feature 2 1 ", "feature 3 1", "Feature 1 1" ));

     Set<Integer> intInputs = new HashSet<>(Set.of(5,7,4,2,3,46));


        if (newInput instanceof String) {
            String newString = newInput.toString();

            inputs.add(newString);


            // Using lamda forEach

            System.out.println("STREAMS TERMINAL OPS");
            System.out.println("FOR EACH WIThOUT STREAM");

            inputs.forEach(feature -> System.out.println(feature));

            // Using lambda for each 2

            inputs.forEach(System.out::println);


            //USING STREAM
            System.out.println("STREAM FOR EACH");
            // FOR EACH
            inputs.stream()
                    .forEach(feature2 -> System.out.println(feature2));

            // Reduce with lamda
            System.out.println("STREAM REDUCE WITH LAMBDA");
            String combinedFeatures = inputs.stream()
                    .reduce((f1,f2)->f1+","+f2)
                    .orElse("No features");
            System.out.println("Combined Features:"+ combinedFeatures);


            //Collect

            System.out.println("STREAM COLLECT WITH LAMBDA");
            //
            List<String> filteredFeatures = inputs.stream()
                    .filter(feature -> feature.contains("1"))
                    .collect(Collectors.toList());
            System.out.println("Filtered features"+ filteredFeatures);

            //COUNT
            int featureCount = (int) inputs.stream().count();
            System. out.println("Number of Feature: " + featureCount);

        /*---------------------------------------------------------------------------------------------*/


            System.out.println("NON TERMINAL OPS");


            List<String> upperCaseFeature = inputs.stream()
                    .map(String::toUpperCase) // map and transform each element
                    .collect(Collectors.toList());
            System.out.println("Upper Case Features: " + upperCaseFeature);

            // filter element based on conditions

            List<String> filtered2Features = inputs.stream()
                    .filter( feachure -> feachure.contains("1"))
                    .collect(Collectors.toList());
            System.out.println("Filtered Features: "+ filtered2Features);


             //distinct (removing duplicate elements)

            List<String> distinticFeature = inputs.stream()
                    .map(String::toUpperCase)
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Distinct Features: " + distinticFeature);

            // sorted (sorting elements)

            List<String> sortedFeatures = inputs.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(" Sorted Features: " + sortedFeatures);










        } else if(newInput instanceof Integer){

                        // Al Objeto lo casteas como
         Integer newInt= (Integer) newInput;
           intInputs.add(newInt);




         intInputs.forEach(intList -> System.out.println(intList));



        }

    }

    @Override
    public String classify(Object input) {
        String action = new String();
        // QA ENGINEER HAS THE HABILITY OF CLASSIFY THE SEVERITY OF THE BUGS/DEFECTS
        // This classification ensure best handling of the crisis, time and resources

        if(input instanceof Integer){



            for (EnumBugSeverity bugSeverity : EnumBugSeverity.values()) {
                if (bugSeverity.getSeverityLevel() == (Integer) input) {
                    System.out.println("Bug Severity for Level " + bugSeverity.getSeverityLevel() + ": " + bugSeverity.name());
                    action= "Bug Severity for Level " + bugSeverity.getSeverityLevel() + ": " + bugSeverity.name();
                }
            }
            return action;



          /* EnumBugSeverity.CRITICAL.handleBug();
            EnumBugSeverity.HIGH.handleBug();
            EnumBugSeverity.MEDIUM.handleBug();
            EnumBugSeverity.LOW.handleBug();*/

        }else if(input instanceof String){


            if(input.equals("The problems are affecting a partial operation of the client.")){


                System.out.println("The issue must be handled as a minor and should be fixed in 2 business day.");
                    action="The issue must be handled as a minor and should be fixed in 2 business day.";

            }else if(input.equals("The problems are affecting a total of the operations of the client.")){

                System.out.println("The issue must be handled as a Major and should be fixed in 4 business hours.");
                action="The issue must be handled as a Major and should be fixed in 4 business hours.";
            }




        }

       return action;
    }
}
