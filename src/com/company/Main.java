package com.company;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<City> set = new HashSet<>();
        set.add(new City(321, "Bishkek"));
        set.add(new City(3133, "Kara-Balta"));
        set.add(new City(3222, "Osh"));
        set.add(new City(3522, "Naryn"));
        set.add(new City(3559, "Min-Kush"));
        set.add(new City(3622, "Batken"));
        set.add(new City(3948, "Ak-Suu"));
        set.add(new City(10, "Rotterdam"));
        set.add(new City(20, "Amsterdam"));
        set.add(new City(212, "New York"));
        set.add(new City(62, "Bali"));
        set.add(new City(49, "Avignon"));
        set.add(new City(13, "Versailles"));

//        System.out.println(set);

        Set<City> cityOdd = new TreeSet<>(set);
        for (City city : cityOdd) {
            if (city.getCode() % 2 != 0) {
                cityOdd.add(city);
                System.out.println(city);
            }
        }
    }
}

