package app;

public class Customer {

private final String name;
    private final String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

   
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() + ", phone " + customer.getName();
        getOutput(output);
    }

    public static String[] getData() {
        return new String[]{"Жора", "+380000000000"};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
