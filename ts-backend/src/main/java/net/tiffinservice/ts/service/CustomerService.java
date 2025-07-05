package net.tiffinservice.ts.service;

import net.tiffinservice.ts.dto.CustomerDto;

public interface CustomerService {

    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto GetCustomerById(Long customerId);
}
