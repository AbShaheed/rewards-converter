public class RewardValue {
    double cash;
    float miles;

    public RewardValue(double cash){
        this.cash=cash;
        this.miles = (float) (cash / 0.0035);

    }
    public RewardValue(float miles){
        this.miles=miles;
        this.cash =(cash* 0.0035);

    }

    public double getCashValue() {
        return cash;
    }
    public float getMilesValue()
    {
        return miles;
    }
}
