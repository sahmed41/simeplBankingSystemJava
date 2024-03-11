package Users;

import java.time.LocalDate;

public class Customer extends User {

    public Customer(String id, String fname, String lname, LocalDate dob, String userName, String password) {
        super(id, fname, lname, dob, userName, password);
    }

    // public double listAccount(Account ac) {
    //     return ac.getBalance();
    // }
    
}
