package ua.com.javarush.pashakolomiiets.modul1.CoderDecoder;

import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.CoderDecoder.Coder.coder;


public class CoderFile {

    public static void coderFile(int key) {
        Path pathOfOriginalText = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/CoderDecoder/FileWithText.txt").toAbsolutePath();
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/CoderDecoder/FileforCoder.txt").toAbsolutePath();

        try ( FileReader originalText = new FileReader(pathOfOriginalText.toFile());
             BufferedReader bufferedCoder = new BufferedReader(originalText);
             FileWriter coder = new FileWriter(pathToFileForCoder.toFile())) {

            while (bufferedCoder.ready()) {
                String text = bufferedCoder.readLine();
                coder.write(coder(text, key));
                coder.flush();
            }
            System.out.println("Ваш файл зашифрован. Он находится в файле  - FileforCoder.txt" );

        } catch (IOException e) {
            System.err.println("Файл не найден!");
            System.err.println("Укажите действующий путь к файлу! Вы указали путь - " +  e.getMessage());
        }



    }


}
