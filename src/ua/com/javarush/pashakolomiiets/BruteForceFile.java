package ua.com.javarush.pashakolomiiets;


import java.io.*;
import java.nio.file.Path;

import static ua.com.javarush.pashakolomiiets.modul1.BruteForce.bruteForce;
import static ua.com.javarush.pashakolomiiets.modul1.DeCoder.deCoder;

public class BruteForceFile {


    public static void bruteForseFile() throws IOException {
        Path pathToFileForCoder = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/FileforCoder.txt").toAbsolutePath();
        Path pathToFileForDeCedor = Path.of("src/ua/com/javarush/pashakolomiiets/modul1/Decoderfile.txt").toAbsolutePath();

        try (FileReader coderText = new FileReader(pathToFileForCoder.toFile());
             BufferedReader bufferedDeCoder = new BufferedReader(coderText);
             FileWriter decoderText = new FileWriter(pathToFileForDeCedor.toFile())) {

            while (bufferedDeCoder.ready()) {
                String text = bufferedDeCoder.readLine();
                decoderText.write(bruteForce(text));
                decoderText.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}