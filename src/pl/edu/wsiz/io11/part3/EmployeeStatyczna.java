package pl.edu.wsiz.io11.part3;

/*  Statyczna zmienna  */

public class EmployeeStatyczna {
    static String message = "Hi! I`m Klasa EmployeeStatyczna";
    String firstname, lastname;
    byte age;

    void print() {
        System.out.println(firstname + " " + lastname + "  " + age);
    }

    static void printHi() {


        System.out.println(message);
    }

}