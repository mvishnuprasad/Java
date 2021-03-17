import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //System.out.println("Enter Account num");
        //long number=scn.nextInt();
        Accounts obj=new Accounts();
        System.out.println(obj.getName());
    }
}

class Accounts{
    String Name;
    int balance;
    int MinBalance;
    long AccNum;
    public Accounts() {
        this("Name is bob", 20000);
        System.out.println("C1 called by main method constructor call");
    }
    public Accounts(String name, int balance) {
        this("Name is bob", 20000,1000,1234);
        System.out.println("C2 called c1");
    }
    public Accounts(String Name, int balance, int minBalance, long accNum) {
        this.Name = Name;
        this.balance = balance;
        this.MinBalance = minBalance;
        this.AccNum = accNum;
        System.out.println("c3 called by c2");
    }

    public String getDetails(long number){

        if(number==1234){
            return Name;
        }
        if(number==111)
            return getName();
        else return ")";
    }

    public String getName() {
        return Name;
    }
    public int getBalance() {
        return balance;
    }
    public int getMinBalance() {
        return MinBalance;
    }
    public long getAccNum() {
        return AccNum;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMinBalance(int minBalance) {
        MinBalance = minBalance;
    }

    public void setAccNum(long accNum) {
        AccNum = accNum;
    }
}

