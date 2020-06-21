package day23_state;

/**
 * @author zhuxu
 * @date 2020/6/21 15:33
 */
public class Dispense implements State {
    private Activity activity;

    public Dispense(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("can not deduct money...");
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("get prize...");
            activity.setState(activity.getNoRaffle());
        } else {
            System.out.println("sorry, prize is out...");
            activity.setState(activity.getDispenseOut());
        }
    }

    @Override
    public boolean raffle() {
        System.out.println("can not raffle...");
        return false;
    }
}
