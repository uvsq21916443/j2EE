package tp8.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp8.dao.CustomerDao;
import tp8.entity.Customer;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void creerClient(Customer c) {
    	customerDao.save(c);
    }

    public List<Customer> recupererTout() {
        return customerDao.findAll();
    }
    
    public void trouverClient(int id) {
        System.out.println(customerDao.findById(id));
    }
    
    public void trouverClient(String name) {
        System.out.println(customerDao.findByName(name));
    }
    
    public void supprimerClient(int id) {
    	customerDao.delete(id);
    }
    
    public int totalClient() {
    	return customerDao.count();
    }
}