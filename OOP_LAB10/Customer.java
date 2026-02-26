public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public Customer(){
        this.firstName = "";
        this.lastName = "";
        acct = new Account[5];
        this.numOfAccount = 0;
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        this.numOfAccount = 0;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return getFirstName() + getLastName() + getNumOfAccount();
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }    
}
