package ua.com.javarush.pashakolomiiets.modul1;


import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.BruteForce.bruteForce;


public class BruteForceFile {


    public static void bruteForseFile()  {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileWithBrute.txt").toAbsolutePath();

        try (FileReader coderText = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedDeCoder = new BufferedReader(coderText);
             FileWriter decoderText = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedDeCoder.ready()) {
                String text = bufferedDeCoder.readLine();
                decoderText.write(bruteForce(text));
                decoderText.flush();
            }

            System.out.println("Ваш файл расшифрован методом Брут Форс. Он находится в файле  - FileWithBrute.txt" );
        } catch (IOException e) {
            System.err.println("Файл не найде!");
            System.err.println("Укажите действующий путь к файлу! Вы указали путь - " +  e.getMessage());
        }


    }
}