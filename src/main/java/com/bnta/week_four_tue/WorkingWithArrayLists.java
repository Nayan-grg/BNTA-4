package com.bnta.week_four_tue;

import com.bnta.week_three_mon.CarOOP.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class WorkingWithArrayLists {
    public static void main(String[] args) {
        List<Person> people= new Vector<>();
        ArrayList<String> list =new ArrayList<>();
        list.add("nana");
        list.add("ani");
        list.add("Niru");
        list.forEach(e -> {
            System.out.println("e = " + e);
        });
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf(1));
        for (Object o : list) {
            if(o instanceof Person){
                Person person=(Person)o;
            }
        }


    }
}
