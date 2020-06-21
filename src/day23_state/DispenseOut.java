package day23_state;

/**
 * @author zhuxu
 * @date 2020/6/21 15:37
 */
public class DispenseOut implements State {
    private Activity activity;

    public DispenseOut(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("sorry, prize is out...");
    }

    @Override
    public void dispensePrize() {
        System.out.println("sorry, prize is out...");
    }

    @Override
    public boolean raffle() {
        System.out.println("sorry, prize is out...");
        return false;
    }
}
