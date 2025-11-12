package com;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorage {
    private List<CustomerInfo> customerInfoList;

    public CustomerStorage() {
        this.customerInfoList = new ArrayList<>();
    }

    // Method to add CustomerInfo
    public void addCustomerInfo(CustomerInfo customerInfo) {
        customerInfoList.add(customerInfo);
    }

    // Method to retrieve CustomerInfo by customerId from CustomerData
    public CustomerInfo getCustomerInfoByCustomerId(int customerId) {
        for (CustomerInfo customerInfo : customerInfoList) {
            if (customerInfo.getCustomerId() == customerId) {
                return customerInfo;
            }
        }
        return null; // Returns null if no matching customerId is found
    }

    // Main method for demonstration
    public static void main(String[] args) {
        CustomerStorage storage = new CustomerStorage();

        // Adding CustomerInfo
        CustomerInfo customerInfo1 = new CustomerInfo(1, "Alice", "ACC123", "123 Main St", "555-1234");
        CustomerInfo customerInfo2 = new CustomerInfo(2, "Bob", "ACC456", "456 Oak St", "555-5678");
        storage.addCustomerInfo(customerInfo1);
        storage.addCustomerInfo(customerInfo2);

        // Simulating a CustomerData instance with a known customerId
        CustomerData customerData = new CustomerData(1, "Alice", "ACC123", "555-1234");

        // Retrieving CustomerInfo using the customerId from CustomerData
        CustomerInfo retrievedCustomerInfo = storage.getCustomerInfoByCustomerId(customerData.getCustomerId());
        
        if (retrievedCustomerInfo != null) {
            System.out.println("Retrieved CustomerInfo: " + retrievedCustomerInfo);
        } else {
            System.out.println("CustomerInfo not found for customerId: " + customerData.getCustomerId());
        }
    }
}
