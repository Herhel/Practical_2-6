package com.alfa.work2;

public class Runner {
    public void run() {
        Person person = new Person();
        person.setFirstName("Владимир");
        person.setLastName("Иванов");
        try {
            person.setAge(120);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(person);
    }
}
