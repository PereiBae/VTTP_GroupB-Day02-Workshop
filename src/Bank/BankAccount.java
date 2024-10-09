package Bank;

import java.util.Random;
import java.security.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class BankAccount {
    
    private final String accountHolderName;
    private final String accountNumber;
    private float accountBalance;
    private List<String> transactions = new ArrayList<>();
    private boolean accountStatus;
    private String accountCreation;
    private String accountClosed;

    Random rand = new SecureRandom();
    String bankNumber = String.format("%010d", rand.nextInt(1000000));

    // Get the current date and time
    LocalDateTime now = LocalDateTime.now();

    // Define a date-time format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Format the current date and time
    String formattedDateTime = now.format(formatter);

    public BankAccount(String accHolderName){
        this.accountHolderName = accHolderName;
        this.accountNumber = bankNumber;
        this.accountBalance = 0;
        this.accountStatus = true;
        this.accountCreation = formattedDateTime;
    }

    public BankAccount(String accHolderName,Float accBalance ){
        this.accountHolderName = accHolderName;
        this.accountBalance = accBalance;
        this.accountNumber = bankNumber;;
        this.accountStatus = true;
        this.accountCreation = formattedDateTime;
    }

    public String getAccHolderName() {
        return accountHolderName;
    }

    public String getAccNumber() {
        return accountNumber;
    }

    public float getAccBalance() {
        return accountBalance;
    }

    public void setAccBalance(float accBalance) {
        this.accountBalance = accBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isAccStatus() {
        return accountStatus;
    }

    public void setAccStatus(boolean accStatus) {
        this.accountStatus = accStatus;
    }

    public String getAccCreation() {
        return accountCreation;
    }

    public void setAccCreation(String accCreation) {
        this.accountCreation = accCreation;
    }

    public String getAccClosed() {
        return accountClosed;
    }

    public void setAccClosed(String accClosed) {
        this.accountClosed = accClosed;
    }

    public void deposit(int amount){
        if (amount < 0 || accountStatus == false ) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        } else{
        accountBalance += amount;
        transactions.add("deposit " + amount + " at " +  formattedDateTime);
        }
    }

    public void withdraw (int amount){
        if (amount < 0 || accountStatus == false ) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        } else{
        accountBalance -= amount;
        transactions.add("withdraw " + amount + " at " +  formattedDateTime);
        }
    }


}
