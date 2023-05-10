public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 ()
    {
        System.out.println("Задача 1");
        char clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию для iOS по сслыке");
            default:
                System.out.println("У вас не телефон");
        }
    }
    public static void task2 ()
    {
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        int clientOS = 1;
        if (clientOS == 1 && clientDeviceYear < 2015)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию для iOS по сслыке");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 800;
        if ((year % 100 != 0 || year % 400 == 0) && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
    }
    public static void task4()
    {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        }
        else
            System.out.println("Доставки нет");
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        char monthNumbers = 14;
        switch (monthNumbers){
            case 1:
                System.out.println("Сезон зима");
                break;
            case 2:
                System.out.println("Сезон зима");
                break;
            case 3:
                System.out.println("Сезон весна");
                break;
            case 4:
                System.out.println("Сезон весна");
                break;
            case 5:
                System.out.println("Сезон весна");
                break;
            case 7:
                System.out.println("Сезон лето");
                break;
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
                System.out.println("Сезон осень");
                break;
            case 10:
                System.out.println("Сезон осень");
                break;
            case 11:
                System.out.println("Сезон осень");
                break;
            case 12:
                System.out.println("Сезон зима");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
