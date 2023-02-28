public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Download the app for IOS following the link");
        } else if (clientOS == 1) {
            System.out.println("Download the app for Android following the link");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Download the app for IOS following the link");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Download the light version of the app for IOS following the link.");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Download the app for Android following the link");
        } else {
                        System.out.println("Download the light version of the app for Android following the link");
                    }
                }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 3096;
        if (year % 4 == 0 && year % 100 != 1 || year % 400 ==0) {
            System.out.println("Год високосный.");
        } else if (year % 4 != 0 && year % 100 == 0 || year % 400 != 0) {
            System.out.println("It is not a leap year.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("It takes 1 day.");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("It takes 2 days.");
        } else if (deliveryDistance >60 && deliveryDistance < 100) {
            System.out.println("It takes 3 days.");
        } else {
            System.out.println("Delivery is not available.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("This month doesn`t exist.");
        }
    }
}