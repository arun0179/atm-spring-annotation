package th.ac.ku.atm;

import java.util.HashMap;
import java.util.Map;

public class DataSourceWebAPI implements DataSource {
    @Override
    public Map<Integer, Customer> readCustomers() {
        Map<Integer, Customer> customers = new HashMap<>();
        //...
        customers.put(1, new Customer(1, "Tyeong",1234,100000));
        customers.put(2, new Customer(2,"Johnny",2345,12000));
        customers.put(3,new Customer(3, "Juhyun",3456,30100));
        return customers;
    }
}
