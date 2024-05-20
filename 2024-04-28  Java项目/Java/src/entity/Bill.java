package entity;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:19
 * Bill
 */
import java.util.List;
import java.util.Optional;

public class Bill {
    private int billId;
    private int customerId;
    private String billNumber;
    private String billType;
    private String billReceipt;
    private String description;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillReceipt() {
        return billReceipt;
    }

    public void setBillReceipt(String billReceipt) {
        this.billReceipt = billReceipt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bill(int billId, int customerId, String billNumber, String billType, String billReceipt, String description) {
        this.billId = billId;
        this.customerId = customerId;
        this.billNumber = billNumber;
        this.billType = billType;
        this.billReceipt = billReceipt;
        this.description = description;
    }

    public static void addBill(List<Bill> bills, Bill bill) {
        bills.add(bill);
    }

    public static void editBill(List<Bill> bills, int billId, String newDescription) {
        bills.stream()
                .filter(bill -> bill.billId == billId)
                .findFirst()
                .ifPresent(bill -> bill.description = newDescription);
    }

    public static void deleteBill(List<Bill> bills, int billId) {
        bills.removeIf(bill -> bill.billId == billId);
    }

    public static Optional<Bill> searchBill(List<Bill> bills, String billNumber) {
        return bills.stream()
                .filter(bill -> bill.billNumber.equals(billNumber))
                .findFirst();
    }
    @Override
    public String toString() {
        return "Bill [id=" + billId + ", customerId=" + customerId + ", billNumber=" + billNumber + ", billType=" + billType + ", billReceipt=" + billReceipt + ", description=" + description + "]";
    }
}
