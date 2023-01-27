public class Main {
    public static void printSeparator() {
        System.out.println("+++++++++++++++");
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


    public static void task1() {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }
    // Выполнение домашней работы

    public static int printYear(int yearNumber) {
        if (yearNumber % 4 == 0 && yearNumber != 100 || yearNumber % 400 == 0) {
            System.out.println(yearNumber + " год является високосным");
        } else {
            System.out.println(yearNumber + " год не является високосным");
        }
        return yearNumber;
    }

    public static void task2() {

        printYear(2023);

    }

    // Задача №2
    public static int printIOS(int clientOS, int releaseYear) {

        if (clientOS == 0) {
            System.out.println("Для установки ОП системы для iOS, перейдите по ссылке");
            if (releaseYear < 2015) {
                System.out.println("Установите облегченную версию для iOS");
            } else {
                System.out.println("Установите обычную версию для iOS");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Для установки ОП системы для Android, перейдите по ссылке");
                if (releaseYear < 2015) {
                    System.out.println("Установите облегченную версию для Android");
                } else {
                    System.out.println("Установите обычную версию для Android");
                }
            }

        }
        return clientOS;

    }

    public static void task3() {

        printIOS(1, 2011);
    }

    public static int printDeliveryDistance(int distance) {
        if (distance > 100) {
            System.out.println("Доставки нет");
        } else {
            int deliveryDay = 1;

            if (distance > 20) {
                deliveryDay++;
            }
            if (distance > 60) {
                deliveryDay++;
            }
            System.out.println("Доставка займет " + deliveryDay);
        }
        return distance;
    }

    public static void task4() {
        printDeliveryDistance(95);
    }
}