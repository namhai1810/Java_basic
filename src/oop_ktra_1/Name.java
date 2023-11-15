package oop_ktra_1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

class Name {
    private String firstName, midName, lastName;

    public Name(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + midName + " " + lastName;
    }
}
