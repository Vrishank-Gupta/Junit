package testing;

public class Account {

    int balance;
    boolean status;
    String name;

    public boolean isAcceptedName() {
        return acceptedName;
    }

    boolean acceptedName;
    public Account(String name) {
        this.status = false;
        this.balance = 0;
        this.name = name;
        if(name.matches(".*\\d.*"))
        {
            this.acceptedName = false;
        }
        else
            this.acceptedName = true;
    }



    public int getBalance()
    {
        return balance;
    }

    public void withdraw(int amount)
    {
        this.balance = this.balance-amount;
        if(this.balance <= 0)
        {
            this.status = false;
            this.balance = 0;
        }
    }

    public void addAmount(int amount)
    {
        this.balance += amount;
        if(this.balance >0)
            this.status = true;
    }

    public boolean getStatus() {
        return status;
    }


}

