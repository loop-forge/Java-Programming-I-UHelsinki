public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if(this.balance>=2.60){
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        // write code here
        if(this.balance>=4.60){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if(amount>0){
            this.balance += amount;
        }
        if (balance > 150) {
            balance = 150;
        }
    }
}