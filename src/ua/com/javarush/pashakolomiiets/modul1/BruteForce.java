package ua.com.javarush.pashakolomiiets.modul1;

import static ua.com.javarush.pashakolomiiets.modul1.Alphabet.Alphabets;
import static ua.com.javarush.pashakolomiiets.modul1.Coder.coder;

public class BruteForce {


    public static String bruteForce(String text) {
        int key = 1;
        String text1 = "";
        while (key < Alphabets().length()) {
            text1 +=  key + ") ключ - " + coder(text, key) ;
            key += 1;
        }
        return text1;
    }

}


