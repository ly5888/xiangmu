import entity.*;

import java.util.ArrayList;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:36
 * Main program entrance
 */
import java.util.List;
import java.util.Scanner;

public class BillingAndInventorySystem {
    private static List<Customer> customers = new ArrayList<>();
    private static List<Transaction> transactions = new ArrayList<>();
    private static List<Bill> bills = new ArrayList<>();
    private static List<Login> logins = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();
    private static List<TransactionHistory> transactionHistories = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Billing and Inventory System ---");
            System.out.println("1. Manage Customers");
            System.out.println("2. Manage Transactions");
            System.out.println("3. Manage Bills");
            System.out.println("4. Manage Logins");
            System.out.println("5. Manage payments");
            System.out.println("6. Manage transactionHistories");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageCustomers();
                    break;
                case 2:
                    manageTransactions();
                    break;
                case 3:
                    manageBills();
                    break;
                case 4:
                    manageLogins();
                    break;
                case 5:
                    managePayments();
                    break;
                case 6:
                    manageTransactionHistories();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);
    }

    private static void manageTransactionHistories() {
        int customerChoice;
        do {
            System.out.println("\n--- Payment Management ---");
            System.out.println("1. Add TransactionHistories");
            System.out.println("2. Edit TransactionHistories");
            System.out.println("3. Delete TransactionHistories");
            System.out.println("4. List All TransactionHistories");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            customerChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (customerChoice) {
                case 1:
                    addTransactionHistories();
                    break;
                case 2:
                    editTransactionHistories();
                    break;
                case 3:
                    deleteTransactionHistories();
                    break;
                case 4:
                    listTransactionHistories();
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (customerChoice != 0);
    }

    private static void managePayments() {
        int customerChoice;
        do {
            System.out.println("\n--- Payment Management ---");
            System.out.println("1. Add Payment");
            System.out.println("2. Edit Payment");
            System.out.println("3. Delete Payment");
            System.out.println("4. List All Payments");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            customerChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (customerChoice) {
                case 1:
                    addPayment();
                    break;
                case 2:
                    editPayment();
                    break;
                case 3:
                    deletePayment();
                    break;
                case 4:
                    listPayments();
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (customerChoice != 0);
    }

    private static void manageLogins() {
        int customerChoice;
        do {
            System.out.println("\n--- Login Management ---");
            System.out.println("1. Add Login");
            System.out.println("2. Edit Login");
            System.out.println("3. Delete Login");
            System.out.println("4. List All Logins");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            customerChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (customerChoice) {
                case 1:
                    addLogin();
                    break;
                case 2:
                    editLogin();
                    break;
                case 3:
                    deleteLogin();
                    break;
                case 4:
                    listLogins();
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (customerChoice != 0);
    }

    private static void manageBills() {
        int customerChoice;
        do {
            System.out.println("\n--- Bill Management ---");
            System.out.println("1. Add Bill");
            System.out.println("2. Edit Bill");
            System.out.println("3. Delete Bill");
            System.out.println("4. List All Bills");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            customerChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (customerChoice) {
                case 1:
                    addBill();
                    break;
                case 2:
                    editBill();
                    break;
                case 3:
                    deleteBill();
                    break;
                case 4:
                    listBills();
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (customerChoice != 0);
    }

    private static void manageCustomers() {
        int customerChoice;
        do {
            System.out.println("\n--- Customer Management ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Edit Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. List All Customers");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            customerChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (customerChoice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    editCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    listCustomers();
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (customerChoice != 0);
    }

    private static void manageTransactions() {
        int transactionChoice;
        do {
            System.out.println("\n--- Transaction Management ---");
            System.out.println("1. Add Transaction");
            System.out.println("2. Edit Transaction");
            System.out.println("3. Delete Transaction");
            System.out.println("4. List All Transactions");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            transactionChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (transactionChoice) {
                case 1:
                    addTransaction();
                    break;
                case 2:
                    editTransaction();
                    break;
                case 3:
                    deleteTransaction();
                    break;
                case 4:
                    listTransactions();
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (transactionChoice != 0);
    }

    // Methods to add, edit, delete, and list customers
    private static void addCustomer() {
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customers.size() + 1, name, mobile, email, username, password, address);
        customers.add(customer);
        System.out.println("Customer added successfully!");
    }

    private static void editCustomer() {
        System.out.print("Enter Customer ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new Mobile: ");
        String newMobile = scanner.nextLine();
        System.out.print("Enter new Email: ");
        String newEmail = scanner.nextLine();
        System.out.print("Enter new Username: ");
        String newUsername = scanner.nextLine();
        System.out.print("Enter new Password: ");
        String newPassword = scanner.nextLine();
        System.out.print("Enter new Address: ");
        String newAddress = scanner.nextLine();

        Customer customer = customers.get(id - 1);
        customer.setName(newName);
        customer.setMobile(newMobile);
        customer.setEmail(newEmail);
        customer.setUsername(newUsername);
        customer.setPassword(newPassword);
        customer.setAddress(newAddress);
        System.out.println("Customer updated successfully!");
    }

    private static void deleteCustomer() {
        System.out.print("Enter Customer ID to delete: ");
        int id = scanner.nextInt();
        customers.remove(id - 1);
        System.out.println("Customer deleted successfully!");
    }

    private static void listCustomers() {
        System.out.println("Listing all customers:");
        customers.forEach(customer -> System.out.println("ID: " + customer.getCustomerId() + ", Name: " + customer.getName())); }

    // Methods to add, edit, delete, and list transactions
    private static void addTransaction() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Bill: ");
        String bill = scanner.nextLine();
        System.out.print("Enter Transaction Number: ");
        String transactionNumber = scanner.nextLine();
        System.out.print("Enter Type: ");
        String type = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        Transaction transaction = new Transaction(transactions.size() + 1, customerId, amount, bill, transactionNumber, type, description);
        transactions.add(transaction);
        System.out.println("Transaction added successfully!");
    }

    private static void editTransaction() {
        System.out.print("Enter Transaction ID to edit: ");
        int id = scanner.nextInt();
        System.out.print("Enter new amount: ");
        double newAmount = scanner.nextDouble();
        Transaction transaction = transactions.get(id-1);
        transaction.setAmount(newAmount);
        System.out.println("Transaction updated successfully!");
    }

    private static void deleteTransaction() {
        System.out.print("Enter Transaction ID to delete: ");
        int id = scanner.nextInt();
        transactions.remove(id - 1);
        System.out.println("Transaction deleted successfully!");
    }

    private static void listTransactions() {
        System.out.println("Listing all transactions:");
        transactions.forEach(transaction -> System.out.println("ID: " + transaction.getTransactionId() + ", Customer ID: " + transaction.getCustomerId() + ", Amount: " + transaction.getAmount()));
    }

    // Methods to add, edit, delete, and list bills
    private static void addBill() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Bill Number: ");
        String billNumber = scanner.nextLine();
        System.out.print("Enter Bill Type: ");
        String billType = scanner.nextLine();
        System.out.print("Enter Bill Receipt: ");
        String billReceipt = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        Bill bill = new Bill(bills.size() + 1, customerId, billNumber, billType, billReceipt, description);
        bills.add(bill);
        System.out.println("Bill added successfully!");
    }

    private static void editBill() {
        System.out.print("Enter Bill ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Customer ID: ");
        int newCustomerId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Bill Number: ");
        String newBillNumber = scanner.nextLine();
        System.out.print("Enter new Bill Type: ");
        String newBillType = scanner.nextLine();
        System.out.print("Enter new Bill Receipt: ");
        String newBillReceipt = scanner.nextLine();
        System.out.print("Enter new Description: ");
        String newDescription = scanner.nextLine();

        Bill bill = bills.get(id - 1);
        bill.setCustomerId(newCustomerId);
        bill.setBillNumber(newBillNumber);
        bill.setBillType(newBillType);
        bill.setBillReceipt(newBillReceipt);
        bill.setDescription(newDescription);
        System.out.println("Bill updated successfully!");
    }

    private static void deleteBill() {
        System.out.print("Enter Bill ID to delete: ");
        int id = scanner.nextInt();
        bills.remove(id - 1);
        System.out.println("Bill deleted successfully!");
    }

    private static void listBills() {
        System.out.println("Listing all bills:");
        bills.forEach(bill -> System.out.println("ID: " + bill.getBillId() + ", Customer ID: " + bill.getCustomerId() + ", Number: " + bill.getBillNumber() + ", Type: " + bill.getBillType() + ", Receipt: " + bill.getBillReceipt() + ", Description: " + bill.getDescription()));
    }

    // Methods to add, edit, delete, and list logins

    private static void addLogin() {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter Role ID: ");
        int roleId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Last Login Date (YYYY-MM-DD HH:MM:SS): ");
        String lastLogin = scanner.nextLine();

        Login login = new Login(logins.size() + 1, userId, roleId, username, password, lastLogin);
        logins.add(login);
        System.out.println("Login added successfully!");
    }

    private static void editLogin() {
        System.out.print("Enter Login ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new User ID: ");
        int newUserId = scanner.nextInt();
        System.out.print("Enter new Role ID: ");
        int newRoleId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Username: ");
        String newUsername = scanner.nextLine();
        System.out.print("Enter new Password: ");
        String newPassword = scanner.nextLine();
        System.out.print("Enter new Last Login Date (YYYY-MM-DD HH:MM:SS): ");
        String newLastLogin = scanner.nextLine();

        Login login = logins.get(id - 1);
        login.setLoginUserId(newUserId);
        login.setLoginRoleId(newRoleId);
        login.setLoginUsername(newUsername);
        login.setLoginPassword(newPassword);
        login.setLoginLastLogin(newLastLogin);
        System.out.println("Login updated successfully!");
    }

    private static void deleteLogin() {
        System.out.print("Enter Login ID to delete: ");
        int id = scanner.nextInt();
        logins.remove(id - 1);
        System.out.println("Login deleted successfully!");
    }

    private static void listLogins() {
        System.out.println("Listing all logins:");
        logins.forEach(login -> System.out.println("ID: " + login.getLoginId() + ", User ID: " + login.getLoginUserId() + ", Role ID: " + login.getLoginRoleId() + ", Username: " + login.getLoginUsername() + ", Last Login: " + login.getLoginLastLogin()));
    }

    // Methods to add, edit, delete, and list payments
    private static void addPayment() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Payment Date (YYYY-MM-DD): ");
        String paymentDate = scanner.nextLine();
        System.out.print("Enter Bill: ");
        String bill = scanner.nextLine();
        System.out.print("Enter Type: ");
        String type = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        Payment payment = new Payment(payments.size() + 1, customerId, paymentDate, bill, type, description);
        payments.add(payment);
        System.out.println("Payment added successfully!");
    }

    private static void editPayment() {
        System.out.print("Enter Payment ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Customer ID: ");
        int newCustomerId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter new Payment Date (YYYY-MM-DD): ");
        String newPaymentDate = scanner.nextLine();
        System.out.print("Enter new Bill: ");
        String newBill = scanner.nextLine();
        System.out.print("Enter new Type: ");
        String newType = scanner.nextLine();
        System.out.print("Enter new Description: ");
        String newDescription = scanner.nextLine();

        Payment payment = payments.get(id - 1);
        payment.setCustomerId(newCustomerId);
        payment.setPaymentDate(newPaymentDate);
        payment.setBill(newBill);
        payment.setType(newType);
        payment.setDescription(newDescription);
        System.out.println("Payment updated successfully!");
    }

    private static void deletePayment() {
        System.out.print("Enter Payment ID to delete: ");
        int id = scanner.nextInt();
        payments.remove(id - 1);
        System.out.println("Payment deleted successfully!");
    }

    private static void listPayments() {
        System.out.println("Listing all payments:");
        payments.forEach(payment -> System.out.println("ID: " + payment.getPaymentId() + ", Customer ID: " + payment.getCustomerId() + ", Date: " + payment.getPaymentDate() + ", Bill: " + payment.getBill() + ", Type: " + payment.getType() + ", Description: " + payment.getDescription()));
    }

    // Methods to add, edit, delete, and list transactionHistorys
    private static void addTransactionHistories() {
        System.out.print("Enter TransactionHistory historyId: ");
        int historyId = scanner.nextInt();
        System.out.print("Enter TransactionHistory customerId: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter TransactionHistory amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter TransactionHistory bill ");
        String bill = scanner.nextLine();
        System.out.print("Enter TransactionHistory number ");
        String number = scanner.nextLine();
        System.out.print("Enter TransactionHistory type ");
        String type = scanner.nextLine();
        System.out.print("Enter TransactionHistory description ");
        String description = scanner.nextLine();

        TransactionHistory transactionHistory = new TransactionHistory(historyId,customerId,amount,bill,number,type,description);
        transactionHistories.add(transactionHistory);
        System.out.println("TransactionHistory added successfully!");
    }

    private static void editTransactionHistories() {
        System.out.print("Enter TransactionHistory historyId to edit: ");
        int historyId = scanner.nextInt();
        System.out.print("Enter TransactionHistory customerId to edit: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter TransactionHistory amount to edit: ");
        double amount = scanner.nextInt();
        System.out.print("Enter TransactionHistory bill to edit: ");
        String bill = scanner.nextLine();
        System.out.print("Enter TransactionHistory number to edit: ");
        String number = scanner.nextLine();
        System.out.print("Enter TransactionHistory type to edit: ");
        String type = scanner.nextLine();
        System.out.print("Enter TransactionHistory description to edit: ");
        String description = scanner.nextLine();

        TransactionHistory transactionHistory = transactionHistories.get(historyId - 1);
        transactionHistory.setHistoryId(historyId);
        transactionHistory.setCustomerId(customerId);
        transactionHistory.setAmount(amount);
        transactionHistory.setBill(bill);
        transactionHistory.setNumber(number);
        transactionHistory.setType(type);
        transactionHistory.setDescription(description);

        System.out.println("TransactionHistory updated successfully!");
    }

    private static void deleteTransactionHistories() {
        System.out.print("Enter TransactionHistory ID to delete: ");
        int id = scanner.nextInt();
        payments.remove(id - 1);
        System.out.println("TransactionHistory deleted successfully!");
    }

    private static void listTransactionHistories() {
        System.out.println("Listing all transactionHistorys:");
        payments.forEach(payment -> System.out.println("ID: " + payment.getPaymentId() + ", Customer ID: " + payment.getCustomerId() + ", Date: " + payment.getPaymentDate() + ", Bill: " + payment.getBill() + ", Type: " + payment.getType() + ", Description: " + payment.getDescription()));
    }

}

