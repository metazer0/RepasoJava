public class Debt {

    double balance, interestRate = 0.0;
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance *= this.interestRate;
    }
}
