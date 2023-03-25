package com.ultralesson.webautomations.webplayground.data.mappers;

import com.ultralesson.webautomations.webplayground.e2e.Customer;

public class CustomerDataClient extends DataClient{
    public Customer getValidCustomerOfType(String key) {
        String filePath = getFilePath("customers/valid_customers.json");
        return dataMapper.map(filePath, key, Customer.class);
    }
}
