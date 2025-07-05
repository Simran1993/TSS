package net.tiffinservice.ts.controller;

import lombok.AllArgsConstructor;
import net.tiffinservice.ts.dto.CustomerDto;
import net.tiffinservice.ts.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

    // Building Add Customer Rest API
    @PostMapping
    public ResponseEntity<CustomerDto> createCusomerDto(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer= customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }
    // Build Get Customer Rest API
    @GetMapping("{id}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") Long customerID){
        CustomerDto customerDto= customerService.GetCustomerById(customerID);
        return  ResponseEntity.ok(customerDto);

    }
}
