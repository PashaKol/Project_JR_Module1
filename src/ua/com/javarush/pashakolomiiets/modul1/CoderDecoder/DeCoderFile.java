package ua.com.javarush.pashakolomiiets.modul1.CoderDecoder;

import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.CoderDecoder.Coder.coder;


public class DeCoderFile {

    public static void deCoderFile(int key) {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/CoderDecoder/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/CoderDecoder/Decoderfile.txt").toAbsolutePath();

        try (FileReader fileReader = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedReader.ready()) {
                String text = bufferedReader.readLine();
                fileWriter.write(coder(text, -key));
                fileWriter.flush();
            }
            System.out.println("Ваш файл расшифрован. Он находится в файле  - Decoderfile.txt");
        } catch (IOException e) {
            System.err.println("Файл не найден!");
            System.err.println("Укажите действующий путь к файлу! Вы указали путь - " + e.getMessage());
        }


    }
}