package ua.com.javarush.pashakolomiiets.modul1;

import static ua.com.javarush.pashakolomiiets.modul1.DeCoder.deCoder;

public class BruteForce {
    private static final String ALPHABET = "АБВГДЕЁЖЗЙИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            "абвгдеёжзйиклмнопрстуфхцчшщъыьэюяю" +
            ".,:!?;- " +
            "0123456789";

    public static String bruteForce(String text) {
        int key = 0;
        String text1 = "";
        while (key < ALPHABET.length()) {
            text1 = deCoder(text, key);
            System.out.println(text1);
            System.out.println(key);
            key += 1;

        }
        return text1;
    }

}


