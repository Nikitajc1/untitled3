public class Main {
    public static void main(String[] args) {
        int amount = 1000;
        int refill = 2000;
        int check = amount + refill;
        int bonus = refill / 100;
        int bill = check + bonus;

        if (refill > 1000) {
            System.out.println("Итоговый счёт: " + bill);
            System.out.println("Бонусных рублей: " + bonus);
        }
        else {
            System.out.println("Итоговый счёт: " + check);
            System.out.println("Бонусных рублей: 0");
        }
    }
}
