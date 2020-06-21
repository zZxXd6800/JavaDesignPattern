package day23_state;

/**
 * 不能抽奖状态
 */
public class NoRaffle implements State {
    private Activity activity;

    public NoRaffle(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("deduct 50 money, then can raffle...");
        activity.setState(activity.getCanRaffle());
    }

    @Override
    public boolean raffle() {
        System.out.println("please deduct money...");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("can not dispense prize...");
    }
}
