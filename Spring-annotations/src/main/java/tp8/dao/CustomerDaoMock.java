package tp8.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import tp8.entity.Customer;

@Repository
public class CustomerDaoMock implements CustomerDao {
    private Map<Integer, Customer> storage = new TreeMap<>();

    public CustomerDaoMock() {
        storage.put(1, new Customer(1, "titi", "titi@gmail.com", "Versailles"));
        storage.put(2, new Customer(2, "toto", "toto@gmail.com", "Lille"));
    }

	@Override
	public void save(Customer c) {
		storage.put(c.getId(), c);
		
	}

	@Override
	public List<Customer> findAll() {
		return new ArrayList<>(storage.values());
	}

	@Override
	public Customer findById(int id) {
		return storage.get(id);
	}

	@Override
	public Customer findByName(String name) {
		return storage.values().stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
	}

	@Override
	public void delete(int id) {
		storage.remove(id);
		
	}

	@Override
	public int count() {
		return storage.size();
	}
    
    

}