package tutorial;

public class Account {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    // deposit method
    void deposit(float amt){
        amount = amount + amt;

        System.out.println(amt + " deposited");
    }

    // withdraw method
    void withdrawn(float amt){
        if(amount < amt){
            System.out.println("Insufficient balance");
        }else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    // method to check balance
    void checkBalance(){
        System.out.println("Balance is : " + amount);
    }

    // method to display values of an object
    void display(){
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
