import java.time.LocalDate;

public class Main {

    public static int determineTheYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год високосный");
            return 1;
        }
        System.out.println(year + " год не является високосным");
        return 0;
    }

    public static void checkDeviceAndOS(int oS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String platform;

        if (oS == 0) {
            platform = "iOS";
        } else if (oS == 1) {
            platform = "Android";
        } else {
            System.out.println("Доступно только для iOS и Android");
            return;
        }


        String version = (clientDeviceYear < currentYear) ? "облегченную версию " : "обычную версию ";

        System.out.println("Установите " + version + "приложения для " + platform + " по ссылке");
    }

    public static void determineTheDistance(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("На такое расстояние не возим");
        }

    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2024;

        if (year < 1584) {
            System.out.println("Григорианский календарь еще не был введен");
        } else {
            determineTheYear(year);
        }
        System.out.println("Задание 2");

        checkDeviceAndOS(0, 2026);
        System.out.println("Задание 3");
        determineTheDistance(95);

    }

}