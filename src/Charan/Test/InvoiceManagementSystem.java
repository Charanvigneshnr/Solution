package Charan.Test;

import java.util.*;

class Customer {
    String customerId;
    String customerName;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Customer Name: " + customerName;
    }
}

class Item {
    String itemId;
    String itemName;
    double itemPrice;

    public Item(String itemId, String itemName, double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Item Name: " + itemName + ", Item Price: $" + itemPrice;
    }
}

class Invoice {
    String invoiceId;
    Customer customer;
    List<Item> items;

    public Invoice(String invoiceId, Customer customer) {
        this.invoiceId = invoiceId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.itemPrice;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder invoiceDetails = new StringBuilder();
        invoiceDetails.append("Invoice ID: ").append(invoiceId).append("\n");
        invoiceDetails.append("Customer: ").append(customer).append("\n");
        invoiceDetails.append("Items:\n");
        for (Item item : items) {
            invoiceDetails.append("\t").append(item).append("\n");
        }
        invoiceDetails.append("Total: $").append(calculateTotal()).append("\n");

        return invoiceDetails.toString();
    }
}

public class InvoiceManagementSystem {
    private final Map<String, Customer> customers;
    private final Map<String, Invoice> invoices;
    private final Map<String, Item> items;
    private int invoiceCounter = 1;

    public InvoiceManagementSystem() {
        customers = new HashMap<>();
        invoices = new HashMap<>();
        items = new HashMap<>();
    }

    public static void main(String[] args) {
        InvoiceManagementSystem ims = new InvoiceManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Invoice Management System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Invoice");
            System.out.println("3. Add Item to Invoice");
            System.out.println("4. List All Customers");
            System.out.println("5. List All Invoices");
            System.out.println("6. List Invoices of a Customer");
            System.out.println("7. Display Full Details of an Invoice");
            System.out.println("8. Add Item");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    ims.addCustomer(customerId, customerName);
                    break;
                case 2:
                    System.out.print("Enter Customer ID for the Invoice: ");
                    String invoiceCustomerId = scanner.nextLine();
                    ims.addInvoice(invoiceCustomerId);
                    break;
                case 3:
                    System.out.print("Enter Invoice ID: ");
                    String invoiceId = scanner.nextLine();
                    System.out.print("Enter Item ID to add to the Invoice: ");
                    String itemId = scanner.nextLine();
                    ims.addItemToInvoice(invoiceId, itemId);
                    break;
                case 4:
                    ims.listAllCustomers();
                    break;
                case 5:
                    ims.listAllInvoices();
                    break;
                case 6:
                    System.out.print("Enter Customer ID: ");
                    String listCustomerId = scanner.nextLine();
                    ims.listInvoicesOfCustomer(listCustomerId);
                    break;
                case 7:
                    System.out.print("Enter Invoice ID: ");
                    String displayInvoiceId = scanner.nextLine();
                    ims.displayInvoiceDetails(displayInvoiceId);
                    break;
                case 8:
                    System.out.print("Enter Item ID: ");
                    String newItemId = scanner.nextLine();
                    System.out.print("Enter Item Name: ");
                    String newItemName = scanner.nextLine();
                    System.out.print("Enter Item Price: ");
                    double newItemPrice = scanner.nextDouble();
                    ims.addItem(newItemId, newItemName, newItemPrice);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public void addCustomer(String customerId, String customerName) {
        Customer customer = new Customer(customerId, customerName);
        customers.put(customerId, customer);
    }

    public void addInvoice(String customerId) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            Invoice invoice = new Invoice("INV" + invoiceCounter++, customer);
            invoices.put(invoice.invoiceId, invoice);
            System.out.println("Invoice created successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    public void addItemToInvoice(String invoiceId, String itemId) {
        Invoice invoice = invoices.get(invoiceId);
        Item item = items.get(itemId);

        if (invoice != null && item != null) {
            invoice.addItem(item);
            System.out.println("Item added to the invoice.");
        } else {
            System.out.println("Invoice or item not found.");
        }
    }

    public void listAllCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    public void listAllInvoices() {
        for (Invoice invoice : invoices.values()) {
            System.out.println(invoice);
        }
    }

    public void listInvoicesOfCustomer(String customerId) {
        for (Invoice invoice : invoices.values()) {
            if (invoice.customer.customerId.equals(customerId)) {
                System.out.println(invoice);
            }
        }
    }

    public void displayInvoiceDetails(String invoiceId) {
        Invoice invoice = invoices.get(invoiceId);
        if (invoice != null) {
            System.out.println(invoice);
        } else {
            System.out.println("Invoice not found.");
        }
    }

    public void addItem(String itemId, String itemName, double itemPrice) {
        Item item = new Item(itemId, itemName, itemPrice);
        items.put(itemId, item);
        System.out.println("Item added successfully.");
    }
}
