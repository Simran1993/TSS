package net.tiffinservice.ts.controller;

import lombok.AllArgsConstructor;
import net.tiffinservice.ts.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

}
