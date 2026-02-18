package tp8.dao;
import java.util.List;

import tp8.entity.Customer;

public interface CustomerDao {
    void save(Customer c);
    List<Customer> findAll();
    Customer findById(int id);
    Customer findByName(String name);
    void delete(int id);
    int count();
}