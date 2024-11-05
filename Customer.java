package lab_2_bushra;

public class Customer implements CommonFunctions {
    private String customerId;
    private String name;
    private String address;
    private int phoneNo;
    private int age;

    public Customer(String customerId, String name, String address, int phoneNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    @Override
    public void searchTicket() {
        System.out.println("Customer searching for ticket...");
    }

    @Override
    public void bookTicket() {
        System.out.println("Customer booking ticket...");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Customer canceling ticket...");
    }

    @Override
    public void makePayment() {
        System.out.println("Customer making payment...");
    }

    @Override
    public void fillDetail() {
        System.out.println("Customer filling details...");
    }

    public void addDetails() {
        System.out.println("Adding customer details...");
    }

    public void modifyDetails() {
        System.out.println("Modifying customer details...");
    }
}
