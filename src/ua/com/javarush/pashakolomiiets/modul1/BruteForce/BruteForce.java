package ua.com.javarush.pashakolomiiets.modul1.BruteForce;

import static ua.com.javarush.pashakolomiiets.modul1.alphabet.Alphabet.alphabet;

import static ua.com.javarush.pashakolomiiets.modul1.CoderDecoder.Coder.coder;

public class BruteForce {


    public static String bruteForce(String message) {
        int key = 1;
        String decrypedText = "";
        while (key < alphabet.length()) {
            decrypedText +=  "ключ " + key + "  - " + coder(message, key) ;
            key += 1;
        }

        return decrypedText;
    }

}


