package tp10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp10.entity.Customer;
import tp10.repository.CustomerRepository;

@Service("customerService")
public class CustomerService {

    @Autowired
    private CustomerRepository repository;
    
    public void sauve(Customer c) {
        repository.save(c);
    }

	public Iterable<Customer> grabAll() {
		return repository.findAll();
	}
	
	public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Customer findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}