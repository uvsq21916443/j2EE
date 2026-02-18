package tp9.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tp9.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
