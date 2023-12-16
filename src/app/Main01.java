package app;

import java.util.Set;
import java.util.HashSet;

public class Main01 {
    public static void main(String[] args) {
        getOutput(showData(getData()));
        getOutput(showUpdatedData(getData()));

    }

    static Set<String> getData() {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");
        return set;
    }

    static String showData(Set<String> set) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Initial data: ");
        int count = 0;
        for (String element : set) {
            count++;
            stringBuilder.append(count).append(") ").append(element).append("\n");
        }
        return stringBuilder.toString();
    }

    static String showUpdatedData(Set<String> set) {
        set.add("grape");
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Updated data: ");
        int count = 0;
        for (String element : set) {
            count++;
            stringBuilder.append(count).append(") ").append(element).append("\n");
        }
        return stringBuilder.toString();

    }

    static void getOutput(String output) {
        System.out.println(output);
    }

}
