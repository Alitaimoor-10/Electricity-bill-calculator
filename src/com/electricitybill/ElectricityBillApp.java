package com.electricitybill;

import java.util.Scanner;

/**
 * Console entry point for the electricity bill calculator.
 */
public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Electricity Bill Calculator");
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        Customer customer = readCustomer(scanner, customerId, name, address);
        int previousReading = readMeterReading(scanner, "Enter previous meter reading: ");
        int currentReading = readMeterReading(scanner, "Enter current meter reading: ");

        try {
            MeterReading meterReading = new MeterReading(previousReading, currentReading);
            BillCalculator billCalculator = new BillCalculator();
            Bill bill = billCalculator.generateBill(customer, meterReading);
            bill.printReceipt();
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
        }

        scanner.close();
    }

    private static Customer readCustomer(Scanner scanner, String customerId, String name, String address) {
        while (true) {
            System.out.println("Select customer type:");
            System.out.println("1. Residential");
            System.out.println("2. Commercial");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                return new ResidentialCustomer(customerId, name, address);
            }

            if (choice.equals("2")) {
                return new CommercialCustomer(customerId, name, address);
            }

            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private static int readMeterReading(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException error) {
                System.out.println("Invalid reading. Please enter a whole number.");
            }
        }
    }
}
