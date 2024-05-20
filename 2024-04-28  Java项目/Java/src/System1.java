import entity.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class System1 {
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
            System.out.println("5. Manage Payments");
            System.out.println("6. Manage Transaction Histories");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageEntity("Customer", customers);
                    break;
                case 2:
                    manageEntity("Transaction", transactions);
                    break;
                case 3:
                    manageEntity("Bill", bills);
                    break;
                case 4:
                    manageEntity("Login", logins);
                    break;
                case 5:
                    manageEntity("Payment", payments);
                    break;
                case 6:
                    manageEntity("TransactionHistory", transactionHistories);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 0);
    }

    private static <T> void manageEntity(String entityName, List<T> entities) {
        int entityChoice;
        do {
            System.out.println("\n--- " + entityName + " Management ---");
            System.out.println("1. Add " + entityName);
            System.out.println("2. Edit " + entityName);
            System.out.println("3. Delete " + entityName);
            System.out.println("4. List All " + entityName + "s");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            entityChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (entityChoice) {
                case 1:
                    addEntity(entityName, entities);
                    break;
                case 2:
                    editEntity(entityName, entities);
                    break;
                case 3:
                    deleteEntity(entityName, entities);
                    break;
                case 4:
                    listEntities(entityName, entities);
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (entityChoice != 0);
    }

    private static <T> void addEntity(String entityName, List<T> entities) {
        System.out.print("Enter " + entityName + " details: ");
        // Implement entity-specific input and creation logic here
        // Example for Customer
        if (entityName.equals("Customer")) {
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
        }
        if (entityName.equals("Bill")) {
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
        if (entityName.equals("Login")) {
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
        if (entityName.equals("Payment")){
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
        }
        if  (entityName.equals("Transaction")){
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
        }
        if  (entityName.equals("TransactionHistory")){
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

        }
        // Add similar logic for other entities

        System.out.println(entityName + " added successfully!");
    }

    private static <T> void editEntity(String entityName, List<T> entities) {
        System.out.print("Enter " + entityName + " ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        // Implement entity-specific edit logic here
        // Example for Customer
        if (entityName.equals("Customer")) {
            Customer customer = (Customer) entities.get(id - 1);
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            customer.setName(newName);
            // Similarly, get and set other fields
        }
        // Add similar logic for other entities
        System.out.println(entityName + " updated successfully!");
    }

    private static <T> void deleteEntity(String entityName, List<T> entities) {
        System.out.print("Enter " + entityName + " ID to delete: ");
        int id = scanner.nextInt();
        entities.remove(id - 1);
        System.out.println(entityName + " deleted successfully!");
    }

    private static <T> void listEntities(String entityName, List<T> entities) {
        System.out.println("Listing all " + entityName + "s:");
        entities.forEach(entity -> System.out.println(entity.toString()));
    }
}
