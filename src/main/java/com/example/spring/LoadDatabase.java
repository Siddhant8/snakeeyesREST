package com.example.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CodeInterface codeInterface) {

        return args -> {
            log.info("Preloading " + codeInterface.save(new Info("FRQ Tips", "1. FRQs must access from Arrays and ArrayLists correctly.")));
            log.info("Preloading " + codeInterface.save(new Info("FRQ Tips", "2. FRQs Must not cause Side Effects or there will be a penalty.")));
            log.info("Preloading " + codeInterface.save(new Info("FRQ Tips", "3. FRQs must access arrays and ArrayLists properly")));
            log.info("Preloading " + codeInterface.save(new Info("FRQ Tips", "4. All variables used must be declared")));
            log.info("Preloading " + codeInterface.save(new Info("FRQ Tips", "5. Never write a print statement on the FRQ")));
            log.info("Preloading " + codeInterface.save(new Info("FRQ Tips", "6. You will not be penalized for using the wrong equal signs")));
            log.info("Preloading " + codeInterface.save(new Info("MC Tips", "1. Guess on whichever question you do not know")));
            log.info("Preloading " + codeInterface.save(new Info("MC Tips", "2. Read all answer choices before answering")));
            log.info("Preloading " + codeInterface.save(new Info("MC Tips", "3. Manually run code by hand to get the correct answer.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "Inheritance is when one class can take the attributes of another class.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "Super is a keyword that can access specific aspects of the parent class.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "@Override is a keyword that overrides a parent method.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "If the constructor has no parameters: " +
                    "You do not need to do anything." +
                    "If the Constructor has a parameter:" +
                    "Use super(parameter);.")));

            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "In a method of a child class, super is used to call the same method located in the parent class.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "Super can be used to call any public instance variables.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "A compile-time error in polymorphism when the reference type does not have a method the object has.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "For polymorphism runtime, the method of the subclass is always executed.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "Super can only be used to access instance variables that are declared as public.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "The String toString method returns an object in its string form.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "Static binding decides which method the child class will reference during compile - time.")));
            log.info("Preloading " + codeInterface.save(new Info("Inheritance", "Dynamic binding decides which method the parent class will reference during runtime")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "They store data in rows and columns - multiple dimensions. They also have indexes.")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "You declare a 2D array using datatype[][] name = .")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "You access an element by using x[row][column].")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "name.length gives us the number of rows in a 2D array.")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "The first row has index 0, the first column has index 0.")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "All 2D arrays on the AP CSA test are rectangular.")));
            log.info("Preloading " + codeInterface.save(new Info("2D Arrays", "You find the length of a row of a 2D Array using x[row].length;.")));
            log.info("Preloading " + codeInterface.save(new Info("2D Array", "The Length of a 2D Array is found the same way as in finding a regular array.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "Recursion is when a method continuously calls itself until a certain condition is met.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "The base case of recursion is the comparison that decides that the recursion sequence is finished.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "The method calls itself repeatedly and ignores the previous method calls until the base case is met.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "The method calls are on a stack, and the method calls are then executed in reverse when the base case is met.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "A stack overflow error occurs when you have infinite recursion.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "You do not need to write your own recursion method on the AP Exam.")));
            log.info("Preloading " + codeInterface.save(new Info("Recursion", "Write each call of the method with the parameter. Then replace each method with its result when the base case is met.")));




        };
    }
}

