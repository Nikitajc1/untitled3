public class Main {
    public static void main(String[] args) {
        int x = 1000;
        int y = 2000;
        int z = x + y;
        int w = y / 100;
        int c = z + w;

        if (y > 1000) {
            System.out.println("Итоговый счёт: " + c);
            System.out.println("Бонусных рублей: " + w);
        }
        else {
            System.out.println("Итоговый счёт: " + z);
            System.out.println("Бонусных рублей: 0");
        }
    }
}
