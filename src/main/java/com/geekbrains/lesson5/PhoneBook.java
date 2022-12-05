package com.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBookMap = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if (phoneBookMap.get(surname) == null) {
            ArrayList<String> listPhoneNumber = new ArrayList<>();
            listPhoneNumber.add(phoneNumber);
            phoneBookMap.put(surname, listPhoneNumber);
        } else {
            phoneBookMap.get(surname).add(phoneNumber);
        }
    }

    public String get(String surname) {
        for (Map.Entry<String, ArrayList<String>> mapEntry : phoneBookMap.entrySet()) {
            if (surname.equals(mapEntry.getKey())) {
                return mapEntry.getKey() + " : " + mapEntry.getValue();
            }
        }
        return "В телефонной книге такой фамилии нет!";
    }
}