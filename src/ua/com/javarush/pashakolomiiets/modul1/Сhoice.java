package ua.com.javarush.pashakolomiiets.modul1;
import java.nio.file.Files;
import java.util.Scanner;

import static java.lang.System.exit;
import static jdk.internal.net.http.common.Utils.close;
import static ua.com.javarush.pashakolomiiets.modul1.BruteForceFile.bruteForseFile;
import static ua.com.javarush.pashakolomiiets.modul1.CoderFile.coderFile;
import static ua.com.javarush.pashakolomiiets.modul1.DeCoderFile.deCoderFile;


public class Сhoice {

    static Scanner scanner = new Scanner(System.in);

    public static void choice(int choice) {

        if (choice == 1) {
            System.out.println("---Зашифровка файла---");
        } else if (choice == 2) {
            System.out.println("--Расшифровка файла---");
        } else if (choice == 3) {
            System.out.println("--Brute Force---");
        }  else if (choice > 4 || choice < 1){
            System.out.println("Не верный выбор!");
            System.out.println("Сделайте ваш выбор от 1 до 4\n");
        }else if (choice == 4){
            exit();

        }

    }

    private static void exit() {
    }

    public static void action() {


        System.out.println("Программа  Шифр Цезаря!");
        System.out.println("***********");
        System.out.println("Введите  цифру : \n1 - Если вы хотите зашифровать текс с файла по ключу\n" +
                "2 - Если вы хотите расшифровать текст с файла по ключу\n" +
                "3 - Если вы хотите взлом (Brute Force)\n" +
                "4 - Если вы хотите закрыть программу");
        System.out.println("***********");

    }


public static void start()  {
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
    else if(choice == 3 ){
        bruteForseFile();
    }

}




}


