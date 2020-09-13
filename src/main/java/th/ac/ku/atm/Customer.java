package th.ac.ku.atm;

public class Customer {
    //attributes
    private int id;
    private String name;
    private int pin;

    // customer has bank account
    private BankAccount account; //object type composition

    public Customer(int id, String name, int pin) {
        this(id, name,pin,0);
    }
    public Customer(int id, String name, int pin, double balance){
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id, name,balance);
    }
    public boolean checkPin(int inputPin){
        return this.pin==inputPin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // detail of bank account
    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }
}
