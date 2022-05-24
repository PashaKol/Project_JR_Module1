package ua.com.javarush.pashakolomiiets.modul1;

import static ua.com.javarush.pashakolomiiets.modul1.Alphabet.Alphabets;

public class Coder {

    public static String coder(String text, int key) {

        StringBuilder stringBuilder = new StringBuilder();
        int newindex;
        for (int i = 0; i < text.length(); i++) {
            newindex = (Alphabets().indexOf(text.charAt(i)) + key) % Alphabets().length();
            if (newindex < 0) {
                newindex = Alphabets().length() + newindex ;
            }
            stringBuilder.append(Alphabets().charAt(newindex));
        }
        return stringBuilder + "\n";
    }

}
