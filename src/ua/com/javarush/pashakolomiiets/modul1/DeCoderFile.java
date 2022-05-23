package ua.com.javarush.pashakolomiiets.modul1;

import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.DeCoder.deCoder;

public class DeCoderFile {

    public static void deCoderFile(int key) {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileforDeCoder.txt").toAbsolutePath();

        try (FileReader coderText = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedDeCoder = new BufferedReader(coderText);
             FileWriter decoderText = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedDeCoder.ready()) {
                String text = bufferedDeCoder.readLine();
                decoderText.write(deCoder(text, key));
                decoderText.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}