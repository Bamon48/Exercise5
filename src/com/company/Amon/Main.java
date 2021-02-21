/*
Benton Amon
Exercise 5
 */

package com.company.Amon;

public class Main {


    public static void main(String[] args) {

        // Create the address book
        AddressBook book = new AddressBook();

        // Create and add people to the book
        Person person1 = new Person("Lauren", "lauren@killoran.gmail.com");
        book.add(person1);
        Person person2 = new Person("Johnny", "johnnytest@hotspot.com");
        book.add(person2);
        Person person3 = new Person("Jorge", "jorge@yahoo.com");
        book.add(person3);

        // Show all the people added to the list
        book.dumpList();

        // get the email by searching the name
        System.out.println("The name Johnny has an email of: " + book.getEmail("Johnny"));

        // get the name by searching the email
        System.out.println("The email lauren@killoran.gmail.com has a name of: " + book.getName("lauren@killoran.gmail.com"));


    }
}
