import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Условный оператор 2.0
        //Задание 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйста, выберите номер своей операционной системы: ");
        System.out.println("\n0 - iOS");
        System.out.println("1 - Android");
        int clientOS = scan.nextInt();


        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Неверно введён номер ОС. Пожалуйста, повторите Вашу попытку позже.\n");
        }

        //Задание 2
        System.out.print("Введите год производства Вашего телефона: ");
        int clientDeviceYear = scan.nextInt();

        if ((clientOS == 0 || clientOS == 1) && (clientDeviceYear <= 2022 && clientDeviceYear >= 2015)) {
            System.out.println(clientOS == 0 ? "Установите версию приложения для iOS по ссылке\n" : "Установите версию приложения для Android по ссылке\n");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }

        //Задание 3
        System.out.print("Введите год: ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным\n");
        } else {
            System.out.println(year + " не является високосным\n");
        }

        //Задание 4
        System.out.println("Введите дистанцию до клиента (в км): ");
        int deliveryDistance = scan.nextInt();
        int daysToDelivery = 0;

        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            daysToDelivery += 1;
            System.out.println("Потребуется дней: " + daysToDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysToDelivery += 2;
            System.out.println("Потребуется дней: " + daysToDelivery);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysToDelivery += 3;
            System.out.println("Потребуется дней: " + daysToDelivery);
        }

        //Задание 5
        System.out.println("\nВведите номер месяца: ");

        switch (scan.nextInt()) {
            case 1:
                System.out.println("Месяц: январь.\nСезон - зима.");
                break;
            case 2:
                System.out.println("Месяц: февраль.\nСезон - зима.");
                break;
            case 3:
                System.out.println("Месяц: март.\nСезон - весна.");
                break;
            case 4:
                System.out.println("Месяц: апрель.\nСезон - весна.");
                break;
            case 5:
                System.out.println("Месяц: май.\nСезон - весна.");
                break;
            case 6:
                System.out.println("Месяц: июнь.\nСезон - лето.");
                break;
            case 7:
                System.out.println("Месяц: июль.\nСезон - лето.");
                break;
            case 8:
                System.out.println("Месяц: август.\nСезон - лето.");
                break;
            case 9:
                System.out.println("Месяц: сентябрь.\nСезон - осень.");
                break;
            case 10:
                System.out.println("Месяц: октябрь.\nСезон - осень.");
                break;
            case 11:
                System.out.println("Месяц: ноябрь.\nСезон - осень.");
                break;
            case 12:
                System.out.println("Месяц: декабрь.\nСезон - зима.");
                break;
            default:
                System.out.println("Некорректно введён номер месяца. Попробуйте ещё раз.");
        }
    }

}

//by Igor