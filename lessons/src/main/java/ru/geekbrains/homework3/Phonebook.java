package ru.geekbrains.homework3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public class Phonebook {

    private final Map<String, Set<String>> entries = new TreeMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname) {
        return entries.computeIfAbsent(surname, new Function<String, Set<String>>() {
            @Override
            public Set<String> apply(String key) {
                return new HashSet<>();
            }
        });
    }

    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    public Set<String> getAllSurnames() {
        return entries.keySet();
    }
}
