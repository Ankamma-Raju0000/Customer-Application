package com;

public class CustomerInfo {
    private int customerId;
    private String customerName;
    private String customerAccNo;
    private String customerAddress;
    private String customerPhoneNo;

    
    public CustomerInfo(int customerId, String customerName, String customerAccNo, String customerAddress, String customerPhoneNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAccNo = customerAccNo;
        this.customerAddress = customerAddress;
        this.customerPhoneNo = customerPhoneNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAccNo() {
        return customerAccNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", customerName=" + customerName + ", customerAccNo="
				+ customerAccNo + ", customerAddress=" + customerAddress + ", customerPhoneNo=" + customerPhoneNo + "]";
	}

    
}
