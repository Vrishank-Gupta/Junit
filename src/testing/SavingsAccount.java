package testing;

public class SavingsAccount extends Account {

    int rateOfInterest;
    int savingsBalance;
    String name;
    public SavingsAccount(int rateOfInterest, String name) {
        super(name);
        this.name = name;
        this.rateOfInterest = rateOfInterest;
    }

    public int getSavingsBalance() {
        return savingsBalance;
    }


    public void addSavingsBalance(int amount)
    {
        this.savingsBalance += amount;
        if(savingsBalance > 0)
            super.status = true;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    public double getSimpleInterest()
    {
        return savingsBalance*rateOfInterest/100.0;
    }
}
