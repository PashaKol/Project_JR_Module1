package ua.com.javarush.pashakolomiiets.modul1;

public class DeCoder {
    private static final String ALPHABET = "АБВГДЕЁЖЗЙИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            "абвгдеёжзйиклмнопрстуфхцчшщъыьэюяю" +
            ".,:!?;- " +
            "0123456789";

    public static String deCoder(String text, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        int newindex;
        for (int i = 0; i < text.length(); i++) {
            newindex = (ALPHABET.indexOf(text.charAt(i)) - key) % ALPHABET.length();
            if (newindex < 0) {
                newindex = ALPHABET.length() + newindex;
            }
            stringBuilder.append(ALPHABET.charAt(newindex));
        }
        return stringBuilder.toString();
    }

}
