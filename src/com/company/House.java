package com.company;

import java.util.Scanner;

public abstract class House {
    private String houseId;
    private String houseName;
    private String addres;
    private int price;
    private int year;
    private Person[] persons = new Person[10];
    private int indexOfNewPerson = 0;

    public House(String houseId, String houseName, String addres, int price, int year){
//        for(int i=0; i<persons.length; i++) {
//            for (int j=i+1; j<persons.length; j++) {
//                if(persons[i].getId() != persons[j].getId()) {
//                    this.houseId = houseId;
//                } else{
//                    System.out.println(persons[i].getFirstName() + " the same id with " + persons[j].getFirstName());
//                    while (persons[i].getId() == persons[j].getId()){
//                        Scanner scanner = new Scanner(System.in);
//                        System.out.println("Enter "  + persons[i].getFirstName() + "'s id again: ");
//                        persons[i].setId(scanner.next());
//                    }
//                }
//            }
//        }
        this.houseId = houseId;
        if (houseName.charAt(0) == 'r' || houseName.charAt(0) == 'o' ||
                houseName.charAt(0) == 'b' || houseName.charAt(0) == 'm' ||
                houseName.charAt(0) == 'w' || houseName.charAt(0) == 'h')
            this.houseName = houseName;
        else {
            System.out.println("Error! Аты r, o, b, m, w, h бир тамгасы менен башталышы керек");
            while (!(houseName.charAt(0) == 'r' || houseName.charAt(0) == 'o' ||
                    houseName.charAt(0) == 'b' || houseName.charAt(0) == 'm' ||
                    houseName.charAt(0) == 'w' || houseName.charAt(0) == 'h')){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter "  + getHouseName() + "'s name again: ");
                houseName = scanner.next();
            }
        }
        this.addres = addres;
        if (price > 70000)
            this.price = price;
        else {
            System.out.println("Error! Баасы 70000$ дан жогору болушу керек");
            while (!(price > 70000)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter "  + getHouseName() + "'s price again: ");
                price = scanner.nextInt();
            }
        }
        if (year > 2015)
            this.year = year;
        else {
            System.out.println("Error! 2015 - жылдан жогорку уйлор болсун эгер кичине болбошу керек");
            while (!(year > 2015)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter "  + getHouseName() + "'s year again: ");
                year = scanner.nextInt();
            }
        }
    }

    abstract void city();
    abstract void electricity();

    public void addPerson(Person person){
        persons[indexOfNewPerson] = person;
        indexOfNewPerson++;
    }

    public void setIndexOfNewPerson(int indexOfNewPerson) {
        this.indexOfNewPerson = indexOfNewPerson;
    }

    public int getIndexOfNewPerson() {
        return indexOfNewPerson;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "House{ houseId=" + houseId+
    "houseName=" + houseName+
    "addres=" + addres+
    "price=" + price+
    "year=" + year+ "}";
//    "persons=" + java.util.Arrays.toString(persons) + "}";
    }
}
