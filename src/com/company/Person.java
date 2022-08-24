package com.company;

import java.util.Scanner;

public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phoneNumber;

    public Person(String id, String firstName, String lastName, String email, int age, String phoneNumber){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        if (email.contains("@"))
            this.email = email;
        else {
            System.out.println("@ Жок кайрадан текшериниз");
            while (!(email.contains("@"))){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter "  + getFirstName() + "'s email again: ");
                email = scanner.nextLine();
            }
        }

        if (age <= 110 && age > 0)
            this.age = age;
        else {
            System.out.println("Терс сан берууго жана жок жаш берууго болбойт");
            while (!(age <= 110 && age > 0)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter "  + getFirstName() + "'s age again: ");
                age = scanner.nextInt();
            }
        }

        if (phoneNumber.contains("+996"))
            this.phoneNumber = phoneNumber;
        else {
            System.out.println("Кыргыз номер бериниз");
            while (!(phoneNumber.contains("+996"))){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter "  + getFirstName() + "'s phone number again: ");
                phoneNumber = scanner.nextLine();
            }
        }
    }

    public void work(String work){
        System.out.println((work + " болуп иштешет"));
    }

    public void timetable(int days, int hours){
        System.out.println("жумасына " + days + " кун " + hours + " сааттан иштешет");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
