# Electricity Bill Calculator

A simple object-oriented Java console project for calculating electricity bills. The project demonstrates core OOP concepts including encapsulation, abstraction, inheritance, and polymorphism.

## Features

- Customer information management
- Previous and current meter reading input
- Automatic unit calculation
- Residential and commercial customer billing
- Slab-based electricity tariff calculation
- Fixed charge and tax calculation
- Printable bill receipt
- Input validation for meter readings and customer type

## OOP Concepts Used

- **Encapsulation:** Customer and billing data is stored in classes with private fields and public methods.
- **Abstraction:** `Customer` defines the common structure for all customer types.
- **Inheritance:** `ResidentialCustomer` and `CommercialCustomer` extend the base `Customer` class.
- **Polymorphism:** Each customer type overrides billing behavior through its own `TariffPlan`.

## Project Structure

```text
src/com/electricitybill/
├── Bill.java
├── BillCalculator.java
├── CommercialCustomer.java
├── CommercialTariffPlan.java
├── Customer.java
├── ElectricityBillApp.java
├── MeterReading.java
├── ResidentialCustomer.java
├── ResidentialTariffPlan.java
└── TariffPlan.java
```

## How to Run

From the project root:

```bash
javac -d out src/com/electricitybill/*.java
java -cp out com.electricitybill.ElectricityBillApp
```

## Example Input

```text
Enter customer ID: C101
Enter customer name: Ali Khan
Enter address: Main Street
Select customer type:
1. Residential
2. Commercial
Enter choice: 1
Enter previous meter reading: 1200
Enter current meter reading: 1375
```

## Example Output

```text
========== Electricity Bill ==========
Customer ID   : C101
Customer Name : Ali Khan
Address       : Main Street
Customer Type : Residential
Previous Read : 1200
Current Read  : 1375
Units Used    : 175
Energy Charge : Rs. 1212.50
Fixed Charge  : Rs. 75.00
Tax           : Rs. 60.63
Total Bill    : Rs. 1348.13
======================================
```
