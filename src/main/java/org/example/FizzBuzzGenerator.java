package org.example;

import java.util.HashMap;

public class FizzBuzzGenerator {
    private final PrintService printService;
    HashMap<Integer, String> fizzBuzzMap = new HashMap<>();

    public FizzBuzzGenerator(PrintService printService) {
        this.printService = printService;
        fizzBuzzMap.put(3, "fizz");
        fizzBuzzMap.put(5, "buzz");
        fizzBuzzMap.put(7, "pop");

    }

    public void generate(int i) {
        StringBuilder sb = new StringBuilder();
        for (Integer key : fizzBuzzMap.keySet()) {
            if (i % key == 0) {
                sb.append(fizzBuzzMap.get(key));
            }
        }
        if (sb.isEmpty()) {
            printService.print(i + "");
        }
        printService.print(sb.toString());
    }
}
