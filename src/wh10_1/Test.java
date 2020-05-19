package wh10_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imie:");
        String firstName = scanner.nextLine();

        System.out.println("Podaj Nazwisko:");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wiek:");
        int salary = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj PESEL:");
        int pesel = scanner.nextInt();
        scanner.nextLine();

        try {
            Person person = new Person(firstName,lastName,salary,pesel);
            System.out.println(person.toString());
        } catch (NameUndefinedException | IncorrectAgeException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
