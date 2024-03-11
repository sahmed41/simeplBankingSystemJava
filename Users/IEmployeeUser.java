package Users;

import java.util.HashMap;

import Account.*;

public interface IEmployeeUser {

    public HashMap<String, String> getCustomerInformation(Customer customer);
    public HashMap<String, String> getAccountInformation(IAccount account);
    
} 
