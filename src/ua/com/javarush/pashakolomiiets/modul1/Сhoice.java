package ua.com.javarush.pashakolomiiets.modul1;

public class Сhoice {
    public static void choice(int choice) {

        if (choice == 1) {
            System.out.println("---Зашифровка файла---");
        } else if (choice == 2) {
            System.out.println("--Расшифровка файла---");
        } else if (choice == 3) {
            System.out.println("--Brute Force---");
        } else if (choice == 4) {
            System.out.println("--Статистический анализ---");
        } else {
            System.out.println("Incorrect choice");
            System.out.println("Сделайте ваш выбор от 1 до 4\n");
        }

    }
    public static void action() {
        System.out.println("Выберите действие : \n1 - Если вы хотите зашифровать текс с файла по ключу\n" +
                "2 - Если вы хотите расшифровать текст с файла по ключу\n" +
                "3 - Если вы хотите взлом (Brute Force)\n" +
                "4 - Если вы хотите Взлом (Статистический анализ)\n");
    }

}


