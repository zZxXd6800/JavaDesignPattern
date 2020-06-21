package day23_state;

import java.util.Random;

/**
 * @author zhuxu
 * @date 2020/6/21 15:33
 */
public class CanRaffle implements State {
    private Activity activity;

    public CanRaffle(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("money has been deducted...");
    }

    @Override
    public void dispensePrize() {
        System.out.println("please raffle...");
    }

    @Override
    public boolean raffle() {
        System.out.println("raffle: waiting...");
        int n = new Random().nextInt(10);
        if (n == 0) {
            System.out.println("congratulations!!!");
            activity.setState(activity.getDispensePrize());
            return true;
        } else {
            System.out.println("did not get prize...");
            activity.setState(activity.getNoRaffle());
            return false;
        }
    }
}
