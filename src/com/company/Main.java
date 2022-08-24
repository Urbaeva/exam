package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		Person person1 = new Person("1", "Burulai", "Urbaeva", "burulaiurbaeva13@gmail.com", 20, "+996990550724");
		Person person2 = new Person("2", "Nurkyz", "Kasymova", "kasymova@gmail.com", 19, "+996774555724");
		Person person3 = new Person("3", "Esra", "Chichek", "esrachichek@gmail.com", 22, "+99655555724");
		Person person4 = new Person("4", "Sude", "Kundurolu", "sudekundurolugmail.com", 20, "+996990550724");
		Person person5 = new Person("5", "Adida", "Munarbekova", "munarbekova@gmail.com", 20, "+996990550724");
		Person person6 = new Person("6", "Ziregul", "Kalyberdieva", "kalyberdieva@gmail.com", 21, "+996990550724");
		Person person7 = new Person("7", "Kulen", "Shamshiev", "kulenshamshiev@gmail.com", 18, "+996990550724");
		Person person8 = new Person("8", "Zulaika", "Shamshieva", "zulaikashamshieva@gmail.com", 28, "+996990550724");
		Person person9 = new Person("5", "Musya", "Urbaeva", "musyaurbaeva@gmail.com", 14, "+996990550724");
		Person person10 = new Person("10", "Buju", "Shamshieva", "bujushamshieva@gmail.com", 21, "+996990550724");
		Person person11 = new Person("11", "BUU", "Shamshieva", "bujushamshieva@gmail.com", 21, "+996990550724");



		VillageHouse villageHouse = new VillageHouse("001", "oil", "Erkin", 75000, 2017);
		BestHouse bestHouse = new BestHouse("0023", "rest", "Bishkek", 118000, 2021);

		Person[] people = {person1, person2, person3, person4, person5,
				person6, person7, person8, person9, person10, person11};

//		for(int i=0; i<people.length; i++) {
//			for (int j=i+1; j<people.length; j++) {
//				if(people[i].getId() == people[j].getId()) {
//					System.out.println(people[i].getFirstName() + " the same id with " + people[j].getFirstName());
//				}
//			}
//		}

		System.out.println("------------VILLAGE HOUSE ------------------");
		System.out.println("House id: " + villageHouse.getHouseId());
		System.out.println("House name: " + villageHouse.getHouseName());
		System.out.println("Addres: " + villageHouse.getAddres());
		System.out.println("Price: " + villageHouse.getPrice());
		System.out.println("Year: " + villageHouse.getYear());
		System.out.print("Жашоочулар: ");
		for (int i = 0; i < people.length/2; i++) {
			villageHouse.addPerson(people[i]);
			System.out.print(people[i].getFirstName() + " ");
		}
		people[0].work("Teacher");
		people[0].timetable(5, 6);
		System.out.println();
		villageHouse.city();
		villageHouse.electricity();

		System.out.println("\n");

		System.out.println("------------BEST HOUSE ------------------");
		System.out.println("Best id: " + bestHouse.getHouseId());
		System.out.println("Best name: " + bestHouse.getHouseName());
		System.out.println("Addres: " + bestHouse.getAddres());
		System.out.println("Price: " + bestHouse.getPrice());
		System.out.println("Year: " + bestHouse.getYear());
		System.out.print("Жашоочулар: ");
		for (int i = people.length/2; i < people.length; i++) {
			bestHouse.addPerson(people[i]);
			System.out.print(people[i].getFirstName() + " ");
		}
		people[0].work("Electronic");
		people[0].timetable(3, 4);
		System.out.println();
		bestHouse.city();
		bestHouse.electricity();

	}

}
