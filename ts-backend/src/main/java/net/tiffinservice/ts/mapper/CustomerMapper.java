package net.tiffinservice.ts.mapper;

import net.tiffinservice.ts.dto.CustomerDto;
import net.tiffinservice.ts.entity.Customer;

public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getNumber()
        );
    }

    public static Customer mapToCustomer(CustomerDto customerDto){
        return new Customer(
                customerDto.getId(),
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getEmail(),
                customerDto.getNumber()
        );
    }
}
