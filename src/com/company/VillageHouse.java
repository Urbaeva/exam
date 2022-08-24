package com.company;

public class VillageHouse extends House{
    public VillageHouse(String houseId, String houseName, String addres, int price, int year) {
        super(houseId, houseName, addres, price, year);
    }



    @Override
    void city() {
        System.out.println( getHouseName() + " жашоочулары "+getAddres() + "те жашайт");
    }

    @Override
    void electricity() {
        System.out.println(getHouseName() + " жашоочулары бирге электричествого толошот");
    }


}
