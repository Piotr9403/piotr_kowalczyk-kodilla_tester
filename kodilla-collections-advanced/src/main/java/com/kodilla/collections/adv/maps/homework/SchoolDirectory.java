package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Principal dir1 = new Principal("Jan", "Kowalski");
        Principal dir2 = new Principal("Maria", "Nowak");

        List<Integer> students1 = List.of(30,25,31,26);
        List<Integer> students2 = List.of(20,18,22,25,21,29);

        School s1 = new School("SP1 Warszawa", students1);
        School s2 = new School("SP1 Lodz", students2);

        //Tworzenie pustej mapy
        Map<Principal, School> ministryOfEducation = new HashMap<>();
        ministryOfEducation.put(dir1,s1);
        ministryOfEducation.put(dir2,s2);

        for(Map.Entry<Principal, School> entry : ministryOfEducation.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
