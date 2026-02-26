import java.util.*;
public class Customer1 {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;
    
    public Customer1(){
        this.firstName = "";
        this.lastName = "";
        acct = new ArrayList<>();
        this.numOfAccount = 0;
    }
    public Customer1(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList<>();
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
        return acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount++;
    }
    public int getNumOfAccount(){
        return acct.size();
    }    
}
