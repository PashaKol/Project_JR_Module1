package ua.com.javarush.pashakolomiiets.modul1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.Coder.coder;


public class DeCoderFile {

    public static void deCoderFile(int key) {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/Decoderfile.txt").toAbsolutePath();
        try (FileReader coderText = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedDeCoder = new BufferedReader(coderText);
             FileWriter decoderText = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedDeCoder.ready()) {
                String text = bufferedDeCoder.readLine();
                decoderText.write(coder(text, -key));
                decoderText.flush();
            }
            System.out.println("Ваш файл расшифрован. Он находится в файле  - Decoderfile.txt" );
        } catch (IOException e) {
            System.err.println("Файл не найде!");
            System.err.println("Укажите действующий путь к файлу! Вы указали путь - " +  e.getMessage());
        }


    }
}