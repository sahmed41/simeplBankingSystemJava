package Users;

// Importing Java Packages
import java.time.LocalDate;
import java.util.HashMap;

// Importing User Defined Packages
import Account.*;

public class Employee extends User implements IEmployeeUser{

    public Employee(String id, String fname, String lname, LocalDate dob, String userName, String password) {
        super(id, fname, lname, dob, userName, password);
    }

    public HashMap<String, String> getCustomerInformation(Customer customer) { // This method returns the informaton of a given customer as a hash map 

        HashMap<String, String> customerInformation = new HashMap<String, String>();   
        
        // Adding consumer informatoin to hash map
        customerInformation.put("ID", customer.getId());
        customerInformation.put("First Name", customer.getFName());
        customerInformation.put("Last Name", customer.getLName());
        customerInformation.put("DOB", customer.getDob().toString());
        customerInformation.put("userName", customer.getUserName());

        return customerInformation;
    }

    
    public HashMap<String, String> getAccountInformation(IAccount account) { // This method returns the informaton of a given account as a hash map

        HashMap<String, String> accountInformation = new HashMap<String, String>();   
        
        // Adding consumer informatoin to hash map
        accountInformation.put("Number", account.getNumber());
        accountInformation.put("Account Holder", account.getHolder().getId());
        accountInformation.put("Balance", String.valueOf(account.getBalance()));

        return accountInformation;
    }



     
}
