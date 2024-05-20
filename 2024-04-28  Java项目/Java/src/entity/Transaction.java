package entity;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:19
 */
import java.util.List;
import java.util.Optional;

public class Transaction {
    private int transactionId;
    private int customerId;
    private double amount;
    private String bill;
    private String transactionNumber;
    private String type;
    private String description;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Transaction(int transactionId, int customerId, double amount, String bill, String transactionNumber, String type, String description) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
        this.bill = bill;
        this.transactionNumber = transactionNumber;
        this.type = type;
        this.description = description;
    }

    public static void addTransaction(List<Transaction> transactions, Transaction transaction) {
        transactions.add(transaction);
    }

    public static void editTransaction(List<Transaction> transactions, int transactionId, String newDescription) {
        transactions.stream()
                .filter(transaction -> transaction.transactionId == transactionId)
                .findFirst()
                .ifPresent(transaction -> transaction.description = newDescription);
    }

    public static void deleteTransaction(List<Transaction> transactions, int transactionId) {
        transactions.removeIf(transaction -> transaction.transactionId == transactionId);
    }

    public static Optional<Transaction> searchTransaction(List<Transaction> transactions, String transactionNumber) {
        return transactions.stream()
                .filter(transaction -> transaction.transactionNumber.equals(transactionNumber))
                .findFirst();
    }
    @Override
    public String toString() {
        return "Transaction [id=" + transactionId + ", customerId=" + customerId + ", amount=" + amount + ", bill=" + bill + ", transactionNumber=" + transactionNumber + ", type=" + type + ", description=" + description + "]";
    }

}

