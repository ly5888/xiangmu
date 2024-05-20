package entity;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:20
 */
import java.util.List;
import java.util.Optional;

public class Payment {
    private int paymentId;
    private int customerId;
    private String paymentDate;
    private String bill;
    private String type;
    private String description;

    public Payment(int paymentId, int customerId, String paymentDate, String bill, String type, String description) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.paymentDate = paymentDate;
        this.bill = bill;
        this.type = type;
        this.description = description;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
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

    public static void addPayment(List<Payment> payments, Payment payment) {
        payments.add(payment);
    }

    public static void editPayment(List<Payment> payments, int paymentId, String newDescription) {
        payments.stream()
                .filter(payment -> payment.paymentId == paymentId)
                .findFirst()
                .ifPresent(payment -> payment.description = newDescription);
    }

    public static void deletePayment(List<Payment> payments, int paymentId) {
        payments.removeIf(payment -> payment.paymentId == paymentId);
    }

    public static Optional<Payment> searchPayment(List<Payment> payments, String paymentType) {
        return payments.stream()
                .filter(payment -> payment.type.equals(paymentType))
                .findFirst();
    }
    @Override
    public String toString() {
        return "Payment [id=" + paymentId + ", customerId=" + customerId + ", paymentDate=" + paymentDate + ", bill=" + bill + ", type=" + type + ", description=" + description + "]";
    }

}

