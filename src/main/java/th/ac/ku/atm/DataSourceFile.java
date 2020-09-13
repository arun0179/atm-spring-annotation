package th.ac.ku.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class DataSourceFile implements DataSource {
    public Map<Integer, Customer> readCustomers(){
        Map<Integer, Customer> customers = new HashMap<>();
        //...
        customers.put(1, new Customer(1, "Wendy",1234,100000));
        customers.put(2, new Customer(2,"Jeong Jay",2345,12000));
        customers.put(3,new Customer(3, "Mr.Kang",3456,30100));
        return customers;
    }
}
