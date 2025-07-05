package net.tiffinservice.ts.service.impl;

import lombok.AllArgsConstructor;
import net.tiffinservice.ts.dto.CustomerDto;
import net.tiffinservice.ts.entity.Customer;
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
        Customer customer= CustomerMapper.mapToCustomer(customerDto);// converted customerDto into jpa Entity
        Customer savedCustomer =customerRepository.save(customer);
        return CustomerMapper.mapToCustomerDto(savedCustomer);
    }
}
