public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a > 0){
            setBalance(getBalance() + a);
            System.out.println(a +" baht is deposited to " + getName() + ".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double amount) throws WithdrawException{
        if(amount > balance){
            throw new WithdrawException("Account " + getName() + " has not enough money!");
        }
        else{
            setBalance(getBalance() - amount);
            System.out.println(amount + " baht is withdrawn from " + getName() + " and your credit balance is " + getBalance() + ".");
        }
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showAccount(){
        System.out.println(getName() + " account has " + getBalance() + " baht.");
    }
        
}
