package ua.com.javarush.pashakolomiiets.modul1;

public class Coder {
    private static final String ALPHABET = "АБВГДЕЁЖЗЙИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            "абвгдеёжзйиклмнопрстуфхцчшщъыьэюяю" +
            ".,:!?;- " +
            "0123456789";

    public static String coder(String text, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(ALPHABET.charAt((ALPHABET.indexOf(text.charAt(i)) + key) % ALPHABET.length()));
        }
        return stringBuilder.toString();
    }
}
