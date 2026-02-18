package tp9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp9.entity.Customer;
import tp9.repository.CustomerRepository;

@Service("customerService")
public class CustomerService {

    @Autowired
    private CustomerRepository repository;
    
    public void sauve(Customer c) {
        repository.save(c);
    }
}