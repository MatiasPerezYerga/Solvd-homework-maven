package com.softwareCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class BackgroundTask  implements Runnable{
    @Override
    public void run() {



        //MOST COMMON WAY
        for (int i = 0; i < 5; i++) {

            System.out.println("Background Taks:" + i );
            System.out.println("Pepe Argento");

                try{

                    Thread.sleep(5000);;

                    /*
                     This line instructs the current thread to pause its execution for the specified duration,
                      which is 1000 milliseconds (1 second) in this case. It's a way to simulate some work or
                       delay within the thread.

                     */

                }catch (InterruptedException e){

                    e.printStackTrace();

            }


        }


        // LAMBDA EXPRESSIONS

        Runnable task2 = ()->{};
        Runnable task = ()->{

               for (int i = 0; i < 5; i++) {
                    System.out.println("Background Task: " + i);
                    try {
                        Thread.sleep(1000); // Simulating some work being done
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }



        };

        // Creating and starting a new thread for the background task
        Thread backgroundThread = new Thread(task);
        backgroundThread.start();

        // Updating project names to uppercase
        //Consumer Lambda:
        //Create an ARray
        /*
        nombre Array.forEach(project -> {
            String upperCaseProject = project.toUpperCase();
            System.out.println("Updated Project: " + upperCaseProject);
        });*/

// Creating a new task using a supplier

        List<String> tasks=new ArrayList<String>();
        Supplier<String> newTaskSupplier = () -> "New Task";
        String newTask = newTaskSupplier.get();
        tasks.add(newTask);

    }
}
