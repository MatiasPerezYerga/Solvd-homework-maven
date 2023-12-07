package com.softwareCompany;

import org.apache.log4j.Logger;

import java.sql.SQLOutput;
import java.util.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.lang.reflect.*;


public class Main {
     public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

         //BasicConfigurator.configure();

         Logger logger = Logger.getLogger(Main.class);
         logger.info("LOGEANDO UN MENSAJE DE INFO;");
         logger.error("Este es un mensaje de ERROR");
         logger.warn("This is a warning message ");

         System.out.println("Welcome to the software company!");
         logger.info("WELCOME TO THE SOFTWARE COMPANY");


         List<String> skills = Arrays.asList("Java", "Testing", "Automation");
         Set<String> projects = new HashSet<>(Arrays.asList("ProjectA", "ProjectB"));
         Map<String, Integer> experience = new HashMap<>();
         experience.put("Java", 3);
         experience.put("Testing", 2);
         Queue<String> tasks = new LinkedList<>(Arrays.asList("Task1", "Task2", "Task3"));
         CustomCollection<String> customCollection = new CustomCollection<>();

         QAEngineer qaEngineer = new QAEngineer(44, "Matias", "Perez Yerga", "Spanish", 34917579, 465454321, 900.00, "La solucion depende del problema", skills, projects, experience, tasks, customCollection);


         //System.out.println(qaEngineer);
         logger.info("El QA Engineer instanciado es:");
         logger.info(qaEngineer);

         /*CREATING OTHER OBJECTS for differents subclasses*/
         String[] programmingLanguages = {"Java", "Python", "JavaScript"};

         Employee backendDev = new BackendDev(34, "Leo", "Messi", "Spanish", 564653245, 31658978, 4000.00, programmingLanguages);

         String[] programmingLanguagesFE = {"JavaScript", "Typescript"};
         Employee frontendDev = new FrontendDev(21, "Juan", "Perez", "Spanish", 45235421, 6598446, 700.00, programmingLanguagesFE);


         Consultant consultant = new Consultant(24, "Carmen", "Prime", "French", 46785432, 1234567, 600.00, 10, 9);

         Junior junior = new Junior(19, "Julian", "Terminator", "Spanish", 45456465, 455645646, 200.00, "I dont'have experience.");

         backendDev.code();
         frontendDev.code();


         // Creating an backUp.Employee object but referencing it as a backUp.Person
         Person person = new Employee(30, "John", "Doe", "English", 123, 456, 50000.0);
         // Accessing the overridden method in the backUp.Employee class

         //System.out.println("backUp.Employee ID: " + ((backUp.Employee) person).getEmployeeId());
         logger.info("backUp.Employee ID: " + ((Employee) person).getEmployeeId());
         // Accessing a method from the backUp.Person class
         //System.out.println("backUp.Person's name: " + person.getName());
         logger.info("backUp.Person's name: " + person.getName());
         // Using a method from the superclass (backUp.Person) on the object of the subclass (backUp.Employee)
         //System.out.println("backUp.Employee's age: " + person.getAge());
         logger.info("backUp.Employee's age: " + person.getAge());


         // Creating and second QA ENGINER

         List<String> mpySkills = Arrays.asList("Java", "Javascript", "Typescript", "Nodejs", "Angular");
         Set<String> mpyProjects = new HashSet<>(Arrays.asList("Solvd", "Daughter"));
         Map<String, Integer> mpyExperience = new HashMap<>();
         mpyExperience.put("Java", 3);
         mpyExperience.put("Angular", 3);
         mpyExperience.put("Nodejs", 3);
         Queue<String> mpyTasks = new LinkedList<>(Arrays.asList("Achieve work goals", "Take care of her daugther"));
         CustomCollection<String> mpyCustomCollection = new CustomCollection<>();

         Person qaEngineer2 = new QAEngineer(44, "Matias", "Perez Yerga", "Spanish", 34917579, 465454321, 900.00, "La solucion depende del problema", mpySkills, mpyProjects, mpyExperience, mpyTasks, mpyCustomCollection);

         // Accessing the overridden method in the backUp.Employee class
         System.out.println("backUp.Employee ID: " + ((Employee) qaEngineer2).getEmployeeId());

         // Accessing a method from the backUp.Person class
         System.out.println("backUp.Person's name: " + qaEngineer2.getName());

         // Using a method from the superclass (backUp.Person) on the object of the subclass (backUp.Employee)
         System.out.println("backUp.Employee's age: " + qaEngineer2.getAge());

         System.out.println("The solution from the class backUp.QAEngineer is " + ((QAEngineer) qaEngineer2).getSolution());
         //An backUp.Employee object is created and referenced by a backUp.Person type.
         //Despite being referenced as a backUp.Person, because backUp.Employee extends backUp.Person, it can be treated as a backUp.Person.
         //The backUp.Employee object can still access the overridden methods of the backUp.Employee class (e.g., getEmployeeId()).
         //It can also access the methods inherited from the backUp.Person class (e.g., getName(), getAge()).
         //Polymorphism here allows an backUp.Employee object to be referenced as a backUp.Person and treated as both an backUp.Employee and a backUp.Person, enabling flexibility in how it's utilized.

         // Print the collected information
         // I NEED TO CAST IN ORDER TO INVOKE THEIR METHODS

         System.out.println("Skills: " + ((QAEngineer) qaEngineer2).getSkills());
         System.out.println("Projects: " + ((QAEngineer) qaEngineer2).getProjects());
         System.out.println("Experience: " + ((QAEngineer) qaEngineer2).getExperience());
         System.out.println("Tasks: " + ((QAEngineer) qaEngineer2).getTasks());
         System.out.println("Custom Collection: " + ((QAEngineer) qaEngineer2).getCustomCollection());


         //
         logger.info(qaEngineer2);
         System.out.println(qaEngineer2);

         //FINAL METHOD. NO se puede OVERRIDE

         logger.info("Please,  QA Engineer 2 and backUp.Junior, lets introduce and code:");
         System.out.println("Please,  QA Engineer 2 and backUp.Junior, lets introduce and code:");


         Employee[] employees = new Employee[2];

         employees[1] = (Employee) qaEngineer2;
         employees[0] = (Employee) junior;

        /*for (backUp.Employee employee : employees) {
            employee.introduce();
            employee.code();
        }*/


         qaEngineer2.introduce();
         ((QAEngineer) qaEngineer2).giveAccess();


         junior.code();
         ((QAEngineer) qaEngineer2).code();

         junior.introduce();
         junior.giveAccess();
         //IMPRIMIR AL JUNIOR
         // System.out.println(junior);

         junior.buscarCafe();


         ((QAEngineer) qaEngineer2).testing1();

         try {
             // Code that might throw backUp.TestFailedException
             ((QAEngineer) qaEngineer2).testExampleScenario();
         } catch (TestFailedException e) {
             // Handle the exception (e.g., log it, mark the test as failed)
             logger.error("Test Failed: " + e.getMessage());
             //System.err.println("Test Failed: " + e.getMessage());
             //System.out.println("This a message from the block catch");
         }
         //TRY CATCH ALLOWING THE PROGRAM TO CONTINUE EXECUTING!
         junior.buscarCafe();

         ((QAEngineer) qaEngineer2).testing1();


         try {

             ((QAEngineer) qaEngineer2).enterWrongAccessCode(465);
         } catch (AccessDeniedException e) {

             System.err.println("Test Failed: " + e.getMessage());

         }


         // ((backUp.QAEngineer) qaEngineer2).enterWrongAccessCode(1546);

         System.out.println("LUEGO DE LA EXCEPTION");
         // ((backUp.QAEngineer) qaEngineer2).enterWrongAccessCode(4563);
         // AFTER THE EXCEPTIONS, THE EMPLOYEES PERFORMED BOTH METHOD INTRODUCE AND CODE AND PROGRAM FINISHED IN A CONTROLED WAY.

         for (Employee employee : employees) {
             employee.introduce();
             employee.code();

         }




      /*  ((backUp.QAEngineer) qaEngineer2).checkAccessCode();

        // If I create as other class instead QA Enginner, I will need to cast to invoke those methods
        /*((backUp.QAEngineer) qaEngineer2).addSkill("Java");
        ((backUp.QAEngineer) qaEngineer2).addSkill("Selenium");*/
       /*qaEngineer2.addExperience("Java", 3);
        qaEngineer2.addExperience("Selenium", 2);*/


         // Print the collected information
      /*  System.out.println("Skills: " + ((backUp.QAEngineer) qaEngineer2).getSkills());
        System.out.println("Projects: " + ((backUp.QAEngineer) qaEngineer2).getProjects());
        System.out.println("Experience: " + ((backUp.QAEngineer) qaEngineer2).getExperience());
        System.out.println("Tasks: " + ((backUp.QAEngineer) qaEngineer2).getTasks());
        System.out.println("Custom Collection: " + ((backUp.QAEngineer) qaEngineer2).getCustomCollection());*/



         //FUNCTIONAL INTERFACES
         //RUNNABLE

         // Creating an instance of backUp.BackgroundTask
       /*  BackgroundTask backgroundTask = new BackgroundTask();
         // Creating and starting a new thread for the background task
         Thread backgroundThread = new Thread(backgroundTask);
         backgroundThread.start();*/


         //with LAMBDA EXPRESSION
      //   backgroundTask.run();



        /* for (int i = 0; i < 3; i++) {
             System.out.println("backUp.Main Thread: " + i);
             try {
                 Thread.sleep(1500); // Simulating main thread work
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }*/

       //  Use at least 5 lambda functions from the java.util.function package

         //Invoking runnable
         ((QAEngineer) qaEngineer2).qaRunnable.run();

         //Invoking supplier
         ((QAEngineer) qaEngineer2).qaSupplier.get();
         //Printing the result of the SUpplier
         System.out.println( ((QAEngineer) qaEngineer2).qaSupplier.get());

         // Invoking Predicate
         ((QAEngineer) qaEngineer2).qaAccessCodePredicate.test(1546);
         //Printing the result of the PREDICATE
         System.out.println(((QAEngineer) qaEngineer2).qaAccessCodePredicate.test(1546));




         //Invoking SquareFunction FUNCTION (@FunctionalInterface) of the QA
        ((QAEngineer) qaEngineer2).qaSquareFunction.apply(4);


        //Printing the result
         System.out.println(((QAEngineer) qaEngineer2).qaSquareFunction.apply(4));



         List<String> cafes= List.of("Cortado", "Expresso", "Manchado");

         //Invoking Consumer
         cafes.forEach(((QAEngineer) qaEngineer2).tomarCafe);;


      // Create 3 custom Lambda functions with generics.

            //INVOKING  REQUIREMENT ANALYST
            ((QAEngineer) qaEngineer2).applyRequirementsAnalysis("Feature 4");
            //((QAEngineer) qaEngineer2).applyRequirementsAnalysis("Feature 5");

            ((QAEngineer) qaEngineer2).applyRequirementsAnalysis(45648);
            //((QAEngineer) qaEngineer2).applyRequirementsAnalysis(2312);


            //Invoking Classificator behavior with severity

            ((QAEngineer) qaEngineer2).classify(10);


         ((QAEngineer) qaEngineer2).classify(8);

         ((QAEngineer) qaEngineer2).classify(6);

         ((QAEngineer) qaEngineer2).classify(4);

         ((QAEngineer) qaEngineer2).classify(2);

         //Invoking Classificator behavior with severity
         ((QAEngineer) qaEngineer2).classify("The problems are affecting a partial operation of the client.");
         ((QAEngineer) qaEngineer2).classify("The problems are affecting a total of the operations of the client.");



         //REFLECTION
         //Creating an object qaEngineerClass with class Class that represent a QAengineer class.

         //qaEngineerClass
          Class<QAEngineer> qaEngineerClass = QAEngineer.class;


         // Creating an arrays of Field class name fields to  call qaEngineerClass to get DeclaredFields
          Field[] fields = qaEngineerClass.getDeclaredFields();

          System.out.println("Fields:");

          for (Field field: fields){
             System.out.println("Name: " + field.getName() + ", +Type: " + field.getType() + ", Modifiers: " + Modifier.toString(field.getModifiers()));
          }



          Constructor<?>[] constructors = qaEngineerClass.getDeclaredConstructors();

         System.out.println("Constructors:");

         for ( Constructor<?> constructor: constructors){
             System.out.println("Name " + constructor.getName() + ", Parameters: " + Arrays.toString(constructor.getParameterTypes()) + "Modifiers: " +  Modifier.toString((constructor.getModifiers())));
         }

         Method[] methods = qaEngineerClass.getDeclaredMethods();
         System.out.println("Methods:");

         // THE FOLLOWING BLOCK IS DISABLE BECAUSE BRING TOO MUCH INFORMATION,
         // Code function: get and print all the declared methods and their characteristics
         // Remove /* */ For watch results for console.

         /*for( Method method: methods){
          System.out.println(" Name: " + method.getName() + ", Return type: " + method.getReturnType() +  ", Parameters: " + Arrays.toString(methods) + ", Modifiers: " +  Modifier.toString(method.getModifiers()));

         }*/



         //CREATING AND ELEMENT  WITH REFLECTION:


        Constructor<QAEngineer> constructor = qaEngineerClass.getDeclaredConstructor(
                int.class, String.class, String.class, String.class, Integer.class , Integer.class, double.class,
                String.class, List.class, Set.class, Map.class, Queue.class, CustomCollection.class);

        QAEngineer qaEnginer3 = constructor.newInstance( 26, "Rocky" , "The Terrible", "English", 39524248, 12123132,2000,
                "I am thinking the solution,", Arrays.asList("Java ", "Testing", "Automation"),
                new HashSet<>(Arrays.asList("Project A", "Project B")),
                new HashMap<>(Map.of("Java",3,"Testing", 2)),
                new LinkedList<>(Arrays.asList("Task1", "Task2", "Tasks3")),
                new CustomCollection<>()

                );

         System.out.println(qaEnginer3);


         }
}
