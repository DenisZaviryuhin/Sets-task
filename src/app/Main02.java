package app;

import java.util.Set;
import java.util.HashSet;

public class Main02 {
    public static void main(String[] args) {
        getOutput(showData(getData()));
        getOutput(showUpdatedData(getData()));

    }

    static Set<String> getData() {
        Set<String> fruits = new HashSet<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("strawberry");
        fruits.add("mango");
        return fruits;
    }

    static String showData(Set<String> fruits) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Initial data: ");
        int count = 0;
        for (String fruit : fruits) {
            count++;
            stringBuilder.append(count).append(") ").append(fruit).append("\n");

        }
        return stringBuilder.toString();
    }

    static String showUpdatedData(Set<String> fruits) {
        fruits.removeIf(str -> str.contains("kiwi"));
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Updated data: ");
        int count = 0;
        for (String fruit : fruits) {
            count++;
            stringBuilder.append(count).append(") ").append(fruit).append("\n");

        }
        return stringBuilder.toString();


    }

    static void getOutput(String output) {
        System.out.println(output);
    }
}
