public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int enterMany = 1100;
        int bonus = 0;
        if (enterMany > 1000) {
            bonus = enterMany / 100;
        }
        int finish = balance + enterMany + bonus;
        System.out.println("Итоговый счёт" + " " + finish);
        System.out.println("Бонус" + " " + bonus);


    }
}