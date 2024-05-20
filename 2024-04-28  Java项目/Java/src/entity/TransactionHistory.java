package entity;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:20
 */
import java.util.List;
import java.util.Optional;

public class TransactionHistory {
    private int historyId;
    private int customerId;
    private double amount;
    private String bill;
    private String number;
    private String type;
    private String description;

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public TransactionHistory(int historyId, int customerId, double amount, String bill, String number, String type, String description) {
        this.historyId = historyId;
        this.customerId = customerId;
        this.amount = amount;
        this.bill = bill;
        this.number = number;
        this.type = type;
        this.description = description;
    }

    public static void addTransactionHistory(List<TransactionHistory> histories, TransactionHistory history) {
        histories.add(history);
    }

    public static void editTransactionHistory(List<TransactionHistory> histories, int historyId, String newDescription) {
        histories.stream()
                .filter(history -> history.historyId == historyId)
                .findFirst()
                .ifPresent(history -> history.description = newDescription);
    }

    public static void deleteTransactionHistory(List<TransactionHistory> histories, int historyId) {
        histories.removeIf(history -> history.historyId == historyId);
    }

    public static Optional<TransactionHistory> searchTransactionHistory(List<TransactionHistory> histories, String number) {
        return histories.stream()
                .filter(history -> history.number.equals(number))
                .findFirst();
    }
    @Override
    public String toString() {
        return "TransactionHistory [historyId=" + historyId + ", customerId=" + customerId + ", amount=" + amount + ", bill=" + bill + ", number=" + number + ", type=" + type + ", description=" + description + "]";
    }



}
