package entity;

/**
 * @author Wang.Kone
 * @date 2024/4/2 9:19
 * Customer
 */
import java.util.List;
import java.util.Optional;

public class Customer {
    private int customerId;
    private String name;
    private String mobile;
    private String email;
    private String username;
    private String password;
    private String address;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(int customerId, String name, String mobile, String email, String username, String password, String address) {
        this.customerId = customerId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public static void addCustomer(List<Customer> customers, Customer customer) {
        customers.add(customer);
    }

    public static void editCustomer(List<Customer> customers, int customerId, String newName) {
        customers.stream()
                .filter(customer -> customer.customerId == customerId)
                .findFirst()
                .ifPresent(customer -> customer.name = newName);
    }

    public static void deleteCustomer(List<Customer> customers, int customerId) {
        customers.removeIf(customer -> customer.customerId == customerId);
    }

    public static Optional<Customer> searchCustomer(List<Customer> customers, String name) {
        return customers.stream()
                .filter(customer -> customer.name.equals(name))
                .findFirst();
    }
    @Override
    public String toString() {
        return "Customer [id=" + customerId + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password=" + password + ", address=" + address + "]";
    }
}
