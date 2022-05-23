package ua.com.javarush.pashakolomiiets.modul1;

import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.Coder.coder;

public class CoderFile {

    public static void coderFile(int key) {
        Path pathOfOriginalText = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileWithText.txt").toAbsolutePath();
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileforCoder.txt").toAbsolutePath();

        try (FileReader originalText = new FileReader(pathOfOriginalText.toFile());
             BufferedReader bufferedCoder = new BufferedReader(originalText);
             FileWriter coder = new FileWriter(pathToFileForCoder.toFile())) {

            while (bufferedCoder.ready()) {
                String text = bufferedCoder.readLine();
                coder.write(coder(text, key));
                coder.flush();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
