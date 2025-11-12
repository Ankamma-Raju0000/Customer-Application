package com;

public class CustomerData {
    private int customerId;
    private String customerName;
    private String customerAccNo;
    private String customerPhone;

    
    public CustomerData(int customerId, String customerName, String customerAccNo, String customerPhone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAccNo = customerAccNo;
        this.customerPhone = customerPhone;
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

    public String getCustomerPhone() {
        return customerPhone;
    }

	@Override
	public String toString() {
		return "CustomerData [customerId=" + customerId + ", customerName=" + customerName + ", customerAccNo="
				+ customerAccNo + ", customerPhone=" + customerPhone + "]";
	}

}
