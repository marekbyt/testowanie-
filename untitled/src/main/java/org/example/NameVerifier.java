package org.example;

public class NameVerifier {

    boolean isNameValid (String name){
        return name != null
                && name.length() >0
                &&  !name.equals(name.toUpperCase())
                && !name.equals(name.toLowerCase());
    }
}
