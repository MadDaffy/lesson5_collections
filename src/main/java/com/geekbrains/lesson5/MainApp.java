package com.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

//        1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//        вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать, сколько раз встречается каждое слово.
//        2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
//        лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
//        через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
//        справочника.

public class MainApp {
    public static void main(String[] args) {
        //Тестовые данные для первого задания
        String[] strings = new String[]{
                "Слово1",
                "Слово2",
                "Слово2",
                "Слово3",
                "Слово3",
                "Слово3",
                "Слово4",
                "Слово4",
                "Слово4",
                "Слово4",

        };
        getFrequencyRepeat(strings);
        //Тестовые данные для второго задания
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sysoev", "12345");
        phoneBook.add("Sysoev", "0000000000");
        phoneBook.add("Efanov", "54321");
        phoneBook.add("Urkov", "7777777");
        phoneBook.add("Urkov", "8888888888");
        phoneBook.add("Urkov", "99999999999999999");
        System.out.println(phoneBook.get("Efanov"));
        System.out.println(phoneBook.get("Sysoev"));
        System.out.println(phoneBook.get("Urkov"));
        System.out.println(phoneBook.get("Dayni"));

    }

    public static void getFrequencyRepeat(String[] stringArray) {
        ArrayList<String> fullWordsList = new ArrayList<>(Arrays.asList(stringArray));
        HashSet<String> arrayWithoutRepeats = new HashSet<>(fullWordsList);
        for (String word : arrayWithoutRepeats) {
            System.out.println(word + " встречается в списке: " + Collections.frequency(fullWordsList, word) + " раз.");
        }

    }
}