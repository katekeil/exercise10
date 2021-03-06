package com.kate;

import java.util.*;
//Kate Keil, 3/20/19, Exercise 10


//contact class
class Contact{
    String name;
    String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display(){
        System.out.println("Name: "+ name + ", Email: "+ email);
    }


}
//the collection class that implements from the contact class
class Collection implements Iterable<Contact>{
    List<Contact> contacts = new ArrayList<>();
    @Override
    public Iterator<Contact> iterator() {
        return this.contacts.iterator();
    }

    public void addContact(Contact con){
        contacts.add(con);
    }

    public void seeContact(){
        for(Contact contact: contacts) {
            contact.display();
        }
    }
}
class Main {

    public static void main(String[] args) {
        Contact bob = new Contact("Allan", "allan@gmail.com");
        Contact arthur = new Contact("Charlie ","cbrecks2@cscc.edu");
        Collection collection = new Collection();
        collection.addContact(bob);// pushing bob into the addContact method
        collection.addContact(arthur);

        collection.seeContact();

    }
}
