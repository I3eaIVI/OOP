public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
        super(0,"");
        credit = 0;
    }
    
    public CheckingAccount(double balance,String name,double credit) {
        super(balance,name);
        this.credit = credit;
    }
    
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer");
        }
    }
    
    public double getCredit() {
        return credit;
    }
    
    @Override
    public void withdraw(double a) throws WithdrawException {
        if(a > 0){
            if (getBalance() - a >= 0){
                setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else if ((getBalance() - a) + getCredit() >= 0){
                setCredit(getCredit() - (a - getBalance()));
                setBalance(0);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else{
                throw new WithdrawException("Account " + getName() + " has not enough money!");
            }
        }
        else{
            super.withdraw(a);
        }

    
    double needFromCredit = a - balance;
    if (needFromCredit <= credit) {
        balance = 0;
        credit -= needFromCredit;
        System.out.println(a + " baht is withdrawn from " + name
                + " and your credit balance is " + credit + ".");
        }
    }
    
    public void withdraw(String a) throws WithdrawException {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return "The "+ name + " account has "+ balance + " baht and "+ credit + " credits.";
    }


}

