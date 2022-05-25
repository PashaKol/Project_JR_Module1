package ua.com.javarush.pashakolomiiets.modul1;

import java.util.Scanner;

import static java.lang.System.exit;
import static ua.com.javarush.pashakolomiiets.modul1.BruteForce.BruteForceFile.bruteForseFile;
import static ua.com.javarush.pashakolomiiets.modul1.CoderDecoder.CoderFile.coderFile;
import static ua.com.javarush.pashakolomiiets.modul1.CoderDecoder.DeCoderFile.deCoderFile;


public class Interface {
    static Scanner scanner = new Scanner(System.in);
    static int coder = 1;
    static int decoder = 2;
    static int bruteForce = 3;
    static int exit = 4;

    public static void options(int option) {

        if (option > 4 || option < 1) {
            System.out.println("Не верный выбор!");
            System.out.println("Сделайте ваш выбор от 1 до 4\n");
        }
        switch (option) {
            case 1:
                System.out.println("---Зашифровка файла---");
                break;
            case 2:
                System.out.println("--Расшифровка файла---");
                break;
            case 3:
                System.out.println("--Brute Force---");
                break;
            case 4:
                exit(1);
        }
    }

    public static void interfaces() {
        System.out.println("Программа  Шифр Цезаря!");
        System.out.println("***********");
        System.out.println("Введите  цифру : \n1 - Если вы хотите зашифровать текс с файла по ключу\n" +
                "2 - Если вы хотите расшифровать текст с файла по ключу\n" +
                "3 - Если вы хотите взлом (Brute Force)\n" +
                "4 - Если вы хотите закрыть программу");
        System.out.println("***********");
    }


    public static void start() {

        interfaces();
        int choice = scanner.nextInt();
        options(choice);
        if (choice == coder) {
            System.out.println("Укажите  ключ по которому нужно зашифровать файл");
            int key = scanner.nextInt();
            coderFile(key);
        } else if (choice == decoder) {
            System.out.println("Укажите  ключ по которому нужно расшифровать файл");
            int key = scanner.nextInt();
            deCoderFile(key);
        } else if (choice == bruteForce) {
            bruteForseFile();
        } else if (choice == exit) {
            exit(2);
        }

    }


}


