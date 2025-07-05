package net.tiffinservice.ts.service.impl;

import lombok.AllArgsConstructor;
import net.tiffinservice.ts.dto.CustomerDto;
import net.tiffinservice.ts.entity.Customer;
import net.tiffinservice.ts.exception.ResourceNotFoundException;
import net.tiffinservice.ts.mapper.CustomerMapper;
import net.tiffinservice.ts.repository.CustomerRepository;
import net.tiffinservice.ts.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer= CustomerMapper.mapToCustomer(customerDto);// converted customerDto into jpa Entity(DTO is a server side only) and (Enitiy is a Step to save the data into database) got my point my bruhhh)
        Customer savedCustomer =customerRepository.save(customer);// saving them in the databse by using the entity class
        return CustomerMapper.mapToCustomerDto(savedCustomer);
    }

    @Override
    public CustomerDto GetCustomerById(Long customerId) {
       Customer customer= customerRepository.findById(customerId)
                .orElseThrow(()->
                        new ResourceNotFoundException("Customer not Exist : " + customerId));
        return CustomerMapper.mapToCustomerDto(customer);
    }
}
