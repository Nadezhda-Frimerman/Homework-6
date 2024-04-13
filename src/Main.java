public class Main {
    public static void main(String[] args) {
        System.out.println("execise 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("execise 2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("execise 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("execise 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("execise 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("execise 6");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("execise 7");
        for (int i = 2; i <= 512; i = i + i) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("execise 8");
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + 29_000;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", i, money);
        }
        System.out.println("execise 9");
        double moneyWithPersent = 0;
        for (int i = 1; i <= 12; i++) {
            moneyWithPersent = (moneyWithPersent + 29_000) * 1.01;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей%n", i, moneyWithPersent);
        }
        System.out.println(" ");
        System.out.println("execise 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %s = %s%n", i, i * 2);
        }
    }
}