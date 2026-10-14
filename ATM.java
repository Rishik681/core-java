class ATM {

    void checkBalance() {
        System.out.println("Your balance is ₹10,000");
    }

    void withdrawMoney() {
        System.out.println("Please enter the amount to withdraw");
    }

    
    void depositMoney() {
        System.out.println("Please enter the amount to deposit");
    }

    
    void changePin() {
        System.out.println("Enter your new PIN");
    }

   
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.checkBalance();
        atm.withdrawMoney();
        atm.depositMoney();
        atm.changePin();
    }
}