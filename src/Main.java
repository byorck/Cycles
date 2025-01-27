public class Main {
    public static void main(String[] args) {
        System.out.println("Task № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Task № 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Task № 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Task № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Task № 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.printf("%s год является високосным%n", i);
        }
        System.out.println("Task № 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("Task № 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Task № 8");
        int inBottle = 0;
        int bottleMonth = 0;
        for (int i = 0; i < 12; i++) {
            inBottle += 29000;
            bottleMonth += 1;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", bottleMonth, inBottle);
        }
        System.out.println("Task № 9");
        int salary = 29000;
        int inBank = 0;
        int bankMonth = 0;
        for (int i = 0; i < 12; i++) {
            inBank += salary;
            inBank += inBank / 100;
            bankMonth += 1;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", bankMonth, inBank);
        }
        System.out.println("Task № 10");
        int multiplicand = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = multiplicand * i;
            System.out.println(multiplicand + "*" + i + "=" + result);
        }
    }
}