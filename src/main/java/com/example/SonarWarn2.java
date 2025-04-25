package com.example;

import java.util.ArrayList;
import java.util.List;

public class SonarWarn2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        // Code with multiple SonarQube issues
        for (int i = 0; i < 10; i++) {
            names.add("Name" + i);
        }

        // NullPointerException risk (method call on a potentially null object)
        String name = null;
        if (name.equals("John")) {  // Issue: NullPointerException risk
            System.out.println("Hello, John!");
        }

        // Code duplication: Same message printed twice
        System.out.println("This is a test message.");
        System.out.println("This is a test message.");  // Issue: Code duplication

        // Hardcoded value (not configurable)
        System.out.println("Max value: " + 100);  // Issue: Magic Number

        // Unnecessary use of a loop when size is constant (looping 10 times for a fixed list size)
        for (int i = 0; i < 10; i++) {  // Issue: Unnecessary loop
            System.out.println(names.get(i));
        }

        // Unsafe cast: Possibly casting Object to String without checking
        Object obj = "Test";
        String str = (String) obj;  // Issue: Unsafe cast

        // Misleading variable names (variable name does not match what it represents)
        int tempValue = 30;  // Issue: Misleading variable name
        if (tempValue > 20) {
            System.out.println("Temperature is above 20");
        }
    }
}
