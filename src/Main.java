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
        } else {
            System.out.println("Install app for Android");
        }
    }

    //task2
    public static void task2() {
        int clientOS = 1;
        int phoneYear = 2021;

        if (clientOS == 0) {
            if (phoneYear < 2015) {
                System.out.println("Install light iOS version of the app via this link");
            } else {
                    System.out.println("Install app for iOS");
            }
        } else {
                if (phoneYear < 2015) {
                    System.out.println("Install light iOS version of the app via this link");
                } else {
                    System.out.println("Install app for Android");
                }
            }



            }

    private static void task3() {
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

    private static void task4() {

        int deliveryDistance = 15;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }

        System.out.println("Delivery is in " + deliveryDays + " days");
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
                System.out.println("Incorrect month number: " + monthNumber);
        }
    }
}
