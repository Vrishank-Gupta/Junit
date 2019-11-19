package testing;

public class LoanAccount extends Account {
    int remainingInstallments;
    int loanBalance;
    String name;

    public LoanAccount(int remainingInstallments, int loanBalance, String name) {
        super(name);
        this.name = name;
        this.remainingInstallments = remainingInstallments;
        this.loanBalance = loanBalance;

        if(remainingInstallments > 0)
            super.status = true;
    }

    public void addMoney(int amount)
    {
        this.loanBalance-=amount;
        this.remainingInstallments--;
        if(loanBalance <= 0 || remainingInstallments == 0)
            super.status = false;
    }


    public int getRemainingInstallments() {
        return remainingInstallments;
    }


    public int getLoanBalance() {
        return loanBalance;
    }

}
