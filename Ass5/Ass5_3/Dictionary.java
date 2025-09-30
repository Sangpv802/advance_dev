package advance_dev.Ass5.Ass5_3;

import java.util.*;

public class Dictionary {
    private Map<String, List<String>> dict = new HashMap<>();

    public void addWord(String english, String vietnamese) {
        dict.putIfAbsent(english, new ArrayList<>());
        dict.get(english).add(vietnamese);
        System.out.println("Added: " + english + " -> " + vietnamese);
    }

    public void removeWord(String english) {
        if (dict.remove(english) != null) {
            System.out.println("Removed word: " + english);
        } else {
            System.out.println("Word not found!");
        }
    }

    public void addMeaning(String english, String vietnamese) {
        if (dict.containsKey(english)) {
            dict.get(english).add(vietnamese);
            System.out.println("Added meaning for " + english);
        } else {
            System.out.println("Word not found!");
        }
    }

    public void removeMeaning(String english, String vietnamese) {
        if (dict.containsKey(english)) {
            List<String> meanings = dict.get(english);
            if (meanings.remove(vietnamese)) {
                System.out.println("Removed meaning: " + vietnamese);
            } else {
                System.out.println("Meaning not found!");
            }
        } else {
            System.out.println("Word not found!");
        }
    }

    public void lookup(String english) {
        if (dict.containsKey(english)) {
            System.out.println(english + " -> " + dict.get(english));
        } else {
            System.out.println("Word not found!");
        }
    }

    public void displayAll() {
        if (dict.isEmpty()) {
            System.out.println("Dictionary is empty.");
        } else {
            for (Map.Entry<String, List<String>> e : dict.entrySet()) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }
}
