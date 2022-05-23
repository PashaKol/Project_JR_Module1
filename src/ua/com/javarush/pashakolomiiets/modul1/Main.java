package ua.com.javarush.pashakolomiiets.modul1;

import java.util.Scanner;


import static ua.com.javarush.pashakolomiiets.modul1.CoderFile.coderFile;
import static ua.com.javarush.pashakolomiiets.modul1.DeCoderFile.deCoderFile;
import static ua.com.javarush.pashakolomiiets.modul1.Сhoice.action;
import static ua.com.javarush.pashakolomiiets.modul1.Сhoice.choice;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        action();
        int choice = scanner.nextInt();
        choice(choice);


        if (choice == 1){
            System.out.println("Укажите  ключ по которому нужно зашифровать файл");
            int key = scanner.nextInt();
            coderFile(key);
        }
        else if(choice ==2){
            System.out.println("Укажите  ключ по которому нужно расшифровать файл");
            int key = scanner.nextInt();
            deCoderFile(key);
        }

    }
}



