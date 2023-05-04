package assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void showMenu (){
        System.out.println("-----------Menu------------");
        System.out.println("1. Show Menu phone.");
        System.out.println("2. Show Menu Tools.");
        System.out.println("0. Exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    public void Menu_phone() {
        System.out.println("-----------Menu Phone------------");
        System.out.println("1. Insert a new phone.");
        System.out.println("2. Update a phone.");
        System.out.println("3. Delete a phone.");
        System.out.println("4. Display all.");
        System.out.println("0. Exit.");
        System.out.println("---------------------------------");
        System.out.print("Please choose: ");
    }
    public void Menu_Tools (){
        System.out.println("-----------Menu Tools------------");
        System.out.println("1. Filter by manufacturer.");
        System.out.println("2. Order by release date desc.");
        System.out.println("3. Filter by price.");
        System.out.println("4. Order by price desc.");
        System.out.println("0. Exit.");
        System.out.println("---------------------------------");
        System.out.print("Please choose: ");
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

    }
}
