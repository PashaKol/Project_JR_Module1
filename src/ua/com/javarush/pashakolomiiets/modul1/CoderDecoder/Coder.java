package ua.com.javarush.pashakolomiiets.modul1.CoderDecoder;

import static ua.com.javarush.pashakolomiiets.modul1.alphabet.Alphabet.alphabet;


public class Coder {

    public static String coder(String text, int key) {

        StringBuilder stringBuilder = new StringBuilder();
        int newindex;
        for (int i = 0; i < text.length(); i++) {
            newindex = (alphabet.indexOf(text.charAt(i)) + key) % alphabet.length();
            if (newindex < 0) {
                newindex = alphabet.length() + newindex ;
            }
            stringBuilder.append(alphabet.charAt(newindex));
        }
        return stringBuilder + "\n";
    }


}
