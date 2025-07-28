// package Lab-ex;

// public class lab1 {
    
// }

import java.util.*;

class UserDetails {
    String SName, SCity;
    int iAge;
    
    UserDetails(){

    }

    UserDetails(String name, int age, String city) {
        SName = name;
        iAge = age;
        SCity = city;
    }

    void displayDetails() {
        System.out.println("User Details:");
        System.out.println("Name: " + SName);
        System.out.println("Age: " + iAge);
        System.out.println("City: " + SCity);
    }   
}

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SName,SCity;
        int iAge;
        System.out.println("Enter your name: ");
        SName = sc.nextLine();
        System.out.println("Enter your Age:");
        iAge = sc.nextInt();
        sc.nextLine();
        while (iAge < 0 | iAge >100) {   
            System.out.println("Pls enter a valid age:");
            iAge = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter city:");
        SCity = sc.nextLine();
        SCity = SCity.trim().isEmpty()? null :SCity;        

        UserDetails user = new UserDetails(SName, iAge, SCity);
        user.displayDetails();
        sc.close();
    }

}
