package spring_pratice;

public class get_set_03 {
    private double Balance;

    public double deposit(double amount){
        if(amount>0){
            Balance += Balance + amount;
            return Balance;
        }
        else{
            System.out.println("Deposit amount must be positive");
            return Balance;
        }
    }
    
    public double withdraw(double amount){
            Balance = Balance - amount;
            return Balance;
    }

    public void getBalance(){
        System.out.println("Current Balance: " + Balance);
    }

    public static void main(String[] args) {
        get_set_03 obj = new get_set_03();
        obj.Balance = 1000;
        obj.getBalance();
        obj.deposit(500);
        obj.getBalance();
        obj.withdraw(200);
        obj.getBalance();
    }
}
