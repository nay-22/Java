package MASTERCLASS.Section_7.BankClassChallenge;

public class Account {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    // Getters And Setters
    public long getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Contructor
    public Account() {
        this(2209, 5000, "Nay", "raon92001@gmail.com", 7021004272L);
        System.out.println("Empty Constructor");
    }
    public Account(long accountNumber, double accountBalance, String customerName, String email, long phoneNumber) {
        System.out.println("Constructor with parameters");
        this.accountBalance = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    

    // Transactional Methods
    public void depositFunds(double depositAmount) {
        System.out.println("Balance: "+this.accountBalance);
        this.accountBalance+=depositAmount;
        System.out.println("New Balance: "+this.accountBalance);
    }
    public void withdrawFunds(double withdrawAmount) {
        if(this.accountBalance-withdrawAmount<0) {
            System.out.println("Sorry, Withdraw Amount Greater Than Account Balance");
        } else {
            System.out.println("Balance: "+this.accountBalance);
            this.accountBalance-=withdrawAmount;
            System.out.println("New Balance: "+this.accountBalance);
        }
    }
}
