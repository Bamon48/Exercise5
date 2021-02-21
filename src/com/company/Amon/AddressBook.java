package com.company.Amon;

import java.util.*;


public class AddressBook {

    private List<Person> dog;

    // Constructor
    public AddressBook() {
        dog = new ArrayList<>();
    }

    // Getters and setters
    public boolean add(Person a) {
        return(dog.add(a));
    }

    public void setDog(List<Person> dog) {
        this.dog = dog;
    }


    public void dumpList() {
        System.out.println(dog);
    }

// ------------

    public String getEmail(String name) {
        Person dude;
        for(int i=0; i < dog.size(); i++) {
            dude = dog.get(i);
            if(dude.getName().equals(name)) {
                return(dude.getEmail());
            }
        } return "";
    }

    public String getName(String email) {
        Person dude;
        for(int i=0; i < dog.size(); i++) {
            dude = dog.get(i);
            if(dude.getEmail().equals(email)) {
                return(dude.getName());
            }
        } return "";
    }

}
