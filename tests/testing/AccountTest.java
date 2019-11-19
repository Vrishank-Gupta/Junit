package testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    String NAME = "Vrishank";
    @Test
    public void AccountCreate()
    {
        Account account = new Account(NAME);
        boolean stat = account.getStatus();
        assertEquals(stat,false);
        int bal = account.getBalance();
        assertEquals(bal,0);
    }

    @Test
    public void nameCheck()
    {
        String numericalName = "d2sd3e";
        Account account = new Account(numericalName);
        assertEquals(account.isAcceptedName(),false);

        Account account1 = new Account(NAME);
        assertEquals(account1.isAcceptedName(),true);
    }

    @Test
    public void addAmountAccount()
    {
        Account account = new Account(NAME);
        account.addAmount(24);
        assertEquals(account.getStatus(),true);
        assertEquals((account.getBalance()),24);
    }

    @Test
    public void withdrawFromAccount()
    {
        Account account = new Account(NAME);
        account.addAmount(24);
        assertEquals(account.getStatus(),true);
        assertEquals((account.getBalance()),24);
        account.withdraw(16);
        assertEquals(account.getBalance(),8);

        account.withdraw(9);
        assertEquals(account.getStatus(),false);
    }



    @Test
    public void openLoanAccount()
    {
        LoanAccount loanAccount = new LoanAccount(2,400,NAME);
        loanAccount.addMoney(200);
        assertEquals(loanAccount.getLoanBalance(),200);
        assertEquals(loanAccount.getRemainingInstallments(),1);
        assertEquals(loanAccount.getStatus(),true);
    }

    @Test
    public void addSavingBal()
    {
        SavingsAccount savingsAccount = new SavingsAccount(8,NAME);
        assertEquals(savingsAccount.getStatus(),false);
        savingsAccount.addSavingsBalance(24);
        assertEquals(savingsAccount.getStatus(),true);
        assertEquals(savingsAccount.getRateOfInterest(),8);

        assertEquals(savingsAccount.getSimpleInterest(),1.92,0.012);
    }



}