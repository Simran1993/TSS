package net.tiffinservice.ts.repository;

import net.tiffinservice.ts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long > {
}
