public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1.1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 1.2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 1.3");
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        System.out.println("Задача 1.3");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2.1");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным ");
        }

        System.out.println("Задача 2.2");
        for (int i = 7; i < 99; i += 7) {
            System.out.println(i);
        }
        System.out.println("Задача 2.3");
        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3.1");
        for (int i = 1; i < 13; i++) {
            double j = 29_000.00 * i;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей", i, j);
            System.out.println();
        }
        System.out.println("Задача 3.2");
        double percentInAge = 12.00;
        double cash = 29_000.00;
        double percentInMonth = percentInAge / 12;
        double k = (percentInMonth / 100) * cash;
        for (int i = 1; i <= 12; i++) {
            double j = i * (k + cash);
            System.out.printf( " Месяц %d сумма накоплений равна %.2f рублей \n", i, j );
        }


    }
}


