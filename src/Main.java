public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
//task1

    public static void task1() {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Install app for iOS");
        } else if (clientOS == 1) {
            System.out.println("Install app for Android");
        }
    }

    //task2
    public static void task2() {
        int clientOS = 1;
        int phoneYear = 2013;
        if (clientOS == 0 && phoneYear > 2015) {
            System.out.println("Install app for iOS");
        }
        if (clientOS == 0 && phoneYear < 2015) {
            System.out.println("Install light iOS version of the app via this link");
        } else if (clientOS == 1 && phoneYear > 2015) {
            System.out.println("Install app for Android");
        } else if (clientOS == 1 && phoneYear < 2015) {
            System.out.println("Install light Android version of the app via this link");


        }


    }

    //task3
    public static void task3() {
        int year = 2024;
        int by4 = year % 4;
        int by100 = year % 100;
        int by400 = year % 400;

        if (by4 == 0 && by100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (by400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


    }

//task4

    public static void task4() {

        int deliveryDistance = 15;
        int days = 0;
        if (deliveryDistance < 20) {
            days = days + 1;
            System.out.println("Delivery in " + days + " day.");
        }

        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Delivery in 2 days");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Delivery is in 3 days");
        } else if (deliveryDistance > 100) {
            System.out.println("Delivery is in 4 days");
        }


    }
    //task5
    public static void task5 () {
        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is a winter month");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is a spring month");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is a summer month");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is an autumn month");
                break;
            default:
                System.out.println("Month number is invalid");
        }
    }
}
