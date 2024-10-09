package Bank;

import java.util.Random;
import java.security.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FixedDepositAccount {
    
    private final String fdaAccountHolderName;
    private final String fdAccountNumber;
    private float fdAccountBalance;
    private List<String> fdTransactions = new ArrayList<>();
    private boolean fdAccountStatus;
    private String fdAccountCreation;
    private String fdAccountClosed;
    private float interest = 3;
    private int durationInMonths = 6;
    private boolean interestRateChanged;
    private boolean durationChanged;

    Random rand = new SecureRandom();
    String bankNumber = String.format("%010d", rand.nextInt(1000000));

    // Get the current date and time
    LocalDateTime now = LocalDateTime.now();

    // Define a date-time format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Format the current date and time
    String formattedDateTime = now.format(formatter);

    public FixedDepositAccount(String name){
        this.fdaAccountHolderName = name;
        this.fdAccountNumber = bankNumber;
        this.fdAccountBalance = 0;
        this.interest = 3;
        this.durationInMonths =6;
        this.interestRateChanged = false;
        this.durationChanged = false;
    }
    
    public FixedDepositAccount(String name, Float balance){
        this.fdaAccountHolderName = name;
        this.fdAccountNumber = bankNumber;
        this.fdAccountBalance = balance;
        this.interest = 3;
        this.durationInMonths =6;
        this.interestRateChanged = false;
        this.durationChanged = false;
    }

    public FixedDepositAccount(String name, Float balance, Float interest){
        this.fdaAccountHolderName = name;
        this.fdAccountNumber = bankNumber;
        this.fdAccountBalance = balance;
        this.interest = interest;
        this.durationInMonths =6;
        if( this.interest != 3) this.interestRateChanged = true;
        this.durationChanged = false;
    }    

    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration){
        this.fdaAccountHolderName = name;
        this.fdAccountNumber = bankNumber;
        this.fdAccountBalance = balance;
        this.interest = interest;
        this.durationInMonths = duration;
        if( this.interest != 3) this.interestRateChanged = true;
        if( this.durationInMonths != 6)this.durationChanged = false;
    }    

    public String getFdaAccountHolderName() {
        return fdaAccountHolderName;
    }

    public String getFdAccountNumber() {
        return fdAccountNumber;
    }

    public float getFdAccountBalance() {
        return fdAccountBalance;
    }

    public void setFdAccountBalance(float fdAccountBalance) {
        this.fdAccountBalance = fdAccountBalance;
    }

    public List<String> getFdTransactions() {
        return fdTransactions;
    }

    public void setFdTransactions(List<String> fdTransactions) {
        this.fdTransactions = fdTransactions;
    }

    public boolean isFdAccountStatus() {
        return fdAccountStatus;
    }

    public void setFdAccountStatus(boolean fdAccountStatus) {
        this.fdAccountStatus = fdAccountStatus;
    }

    public String getFdAccountCreation() {
        return fdAccountCreation;
    }

    public void setFdAccountCreation(String fdAccountCreation) {
        this.fdAccountCreation = fdAccountCreation;
    }

    public String getFdAccountClosed() {
        return fdAccountClosed;
    }

    public void setFdAccountClosed(String fdAccountClosed) {
        this.fdAccountClosed = fdAccountClosed;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public boolean isInterestRateChanged() {
        return interestRateChanged;
    }

    public void setInterestRateChanged(boolean interestRateChanged) {
        this.interestRateChanged = interestRateChanged;
    }

    public boolean isDurationChanged() {
        return durationChanged;
    }

    public void setDurationChanged(boolean durationChanged) {
        this.durationChanged = durationChanged;
    }

    public void withdraw(){

    }

    public void deposit(){

    }

    public Float getBalance(){
        Float balance = this.fdAccountBalance += interest;
        return balance;
    }

}
