import java.time.LocalDate;

public class Main {

    public static boolean determineTheYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }

    public static void checkDeviceAndOS(int oS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String platform = "";

        if (oS == 0) {
            platform = "iOS";
        } else if (oS == 1) {
            platform = "Android";
        } else {
            System.out.println("Ошибка: Доступно только для iOS и Android");
            return;
        }


        String version = (clientDeviceYear < currentYear) ? "облегченную версию" : "версию";


        System.out.println("Установите " + version + " приложения для " + platform + " по ссылке");
    }

    public static void determineTheDistance(int deliveryDistance) {

        int deliveryDays = switch (deliveryDistance) {
            default -> {
                if (deliveryDistance >= 20 && deliveryDistance <= 60) yield 2;
                if (deliveryDistance > 60 && deliveryDistance <= 100) yield 3;
                yield -1;
            }
        };

        if (deliveryDays != -1) {
            System.out.println(deliveryDays);
        } else {
            System.out.println("На такое расстояние не возим");
        }
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2000;

        if (year < 1584) {
            System.out.println("Григорианский календарь еще не был введен");
        } else {

            if (determineTheYear(year)) {
                System.out.println(year + " — високосный год");
            } else {
                System.out.println(year + " — не високосный год");
            }
        }

        System.out.println("Задание 2");

        checkDeviceAndOS(0, 2026);
        System.out.println("Задание 3");
        determineTheDistance(95);

    }

}
