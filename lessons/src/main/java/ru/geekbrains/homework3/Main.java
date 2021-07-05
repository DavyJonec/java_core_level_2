package ru.geekbrains.homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {

    private static final String words =
            "orange " +
                    "blue " +
                    "dark " +
                    "blue " +
                    "yellow " +
                    "dark " +
                    "functional ";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords((words.toLowerCase().split(" "))));
        System.out.println(getWordsCount((words.toLowerCase().split(" "))));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ermakov", "89302702260");
        phonebook.add("Dedov", "89802702260");
        phonebook.add("Dedov", "82803707680");
        phonebook.add("Petrov", "8882702260");
        phonebook.add("Makson", "89322702260");
        phonebook.add("Makson", "89399928390");

        System.out.println("phone Ermakov " + phonebook.get("Ermakov"));
        System.out.println("phone Dedov " + phonebook.get("Dedov"));
        System.out.println("phone Petrov " + phonebook.get("Petrov"));
        System.out.println("phone Makson " + phonebook.get("Makson"));
        System.out.println("phone sfdgd " + phonebook.get("sfdgd"));
        System.out.println(phonebook.getAllSurnames());
    }
}
