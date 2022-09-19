public class Main {
    public static void main(String[] args) {
        //Задание 5.1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        {
            //Задание 5.2
            int clientOs = 1;
            int clientDeviceYear = 2013;
            boolean textVariant1 = (clientOs == 0 && clientDeviceYear >= 2015);
            boolean textVariant2 = (clientOs == 0 && clientDeviceYear < 2015);
            boolean textVariant3 = (clientOs == 1 && clientDeviceYear >= 2015);
            boolean textVariant4 = (clientOs == 1 && clientDeviceYear < 2015);
            if (textVariant1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (textVariant2) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (textVariant3) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (textVariant4) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        {
            //Задание 5.3
            int year = 2000;
            boolean leapYear1 = (year % 4 == 0);
            boolean leapYear2 = (year % 100 != 0);
            boolean leapYear3 = (year % 400 == 0);
            if ((leapYear1) && (leapYear2) || (leapYear3)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }
        { //Задание 5.4
            int deliveryDistance = 180;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + 1);
            } else if (deliveryDistance > 20) {
                System.out.println("Потребуется дней: " + (2 + (deliveryDistance - 20) / 40));
            }
        }
        { //Задание 5.5
            int monthNumber = 9;

            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень.");
                    break;
                default:
                    System.out.println("Месяца " + monthNumber + " не существует!");
            }
        }
    }
}