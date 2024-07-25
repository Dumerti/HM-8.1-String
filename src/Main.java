import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printingYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание №1");
        int year = LocalDate.now().getYear();
        printingYear(year);
    }


    public static void checkOS(int currentYear, int clientOS) {
        if (clientOS == 0) {
            if (currentYear >= 2015) {
                System.out.println("Устоновить обычную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Устоновить облегченую версию приложения для IOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (currentYear >= 2015) {
                System.out.println("Устоновить обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Устоновить облегченую версию приложения для Android по ссылке");

            }
        } else {
            System.out.println("Выберете операционую систему вашего устройства");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        checkOS(currentYear, clientOS);
    }

    public static int cheсkDistanceTime(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        } else return 0;
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");
        int deliveryDistance = 12;
        int days = cheсkDistanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуеться дней " + days);
        } else {
            System.out.println("Доставки нет");
        }


    }


}