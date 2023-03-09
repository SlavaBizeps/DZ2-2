public class Main {
    public static void main(String[] args) {
        int Balance = 300;
        int EnterMany = 1100;
        int Bonus = 0;
        if (EnterMany > 1000) {
            Bonus = EnterMany / 100;
        }
        int Finish = Balance + EnterMany + Bonus;
        System.out.println("Итоговый счёт" + " " + Finish);
        System.out.println("Бонус" + " " + Bonus);


    }
}