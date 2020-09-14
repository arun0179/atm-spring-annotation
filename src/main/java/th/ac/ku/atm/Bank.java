package th.ac.ku.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component //component เพื่อสร้าง bean
public class Bank {
    private String name;

    //composition
    private Map<Integer,Customer> customers;
//    private DataSourceDB dataSourceDB;
//    private DataSourceFile dataSourceFile;

    //receive the dataSource like this it is like you can change object
    @Autowired //auto doing dependency injection
    public Bank(@Value("${bankname}") String name, DataSource dataSource) {
        this.name = name;
        this.customers = dataSource.readCustomers();
    }
    public void registerCustomer(Customer customer){
        this.customers.put(customer.getId(),customer);
    }
    public Customer findCustomer(int id){
        return customers.get(id);
    }

    public String getName() {
        return name;
    }
}
