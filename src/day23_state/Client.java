package day23_state;

public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(5);
        for (int i = 0; i < 100; i++) {
            System.out.println("==========" + i + "==========");
            activity.deductMoney();
            activity.raffle();
        }
    }
}
