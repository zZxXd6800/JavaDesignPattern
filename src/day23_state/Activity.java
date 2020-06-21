package day23_state;

/**
 * @author zhuxu
 * @date 2020/6/21 15:33
 */
public class Activity {
    // 活动当前状态
    private State state;
    // 奖品数量
    private int count;

    private NoRaffle noRaffle = new NoRaffle(this);
    private CanRaffle canRaffle = new CanRaffle(this);
    private Dispense dispense = new Dispense(this);
    private DispenseOut dispenseOut = new DispenseOut(this);

    public Activity(int count) {
        this.state = getNoRaffle();
        this.count = count;
    }

    public void deductMoney() {
        state.deductMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count--;
    }

    public State getNoRaffle() {
        return noRaffle;
    }

    public State getCanRaffle() {
        return canRaffle;
    }

    public State getDispensePrize() {
        return dispense;
    }

    public State getDispenseOut() {
        return dispenseOut;
    }
}
