// Importing Java Packages
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.Month;

// Importing user defined packages
import Users.*;
import Account.*;
import OneSystem.*;

public class Main {

    public static void main (String[] args) {
        // System.out.println("Hello, world!");
        // LocalDate x = LocalDate.of(1990, Month.JANUARY, 15);
        User cus = new Customer("001","John", "Bow", LocalDate.of(1978, 2, 3), "ood", "c1111");
        Employee emp = new Employee("001","Jack", "Bringer", LocalDate.of(1998, 4, 4), "bbring", "2222");
        Account acc = new Account("111", cus, 10000);
        Account acc2 = new Account("112", cus, 10000);

        // System.out.println(cus.getFName());
        // System.out.println(emp.getCustomerInformation(cus));        
        // System.out.println(acc.getBalance());        
        // System.out.println(acc2.getBalance());  
        // acc.transfer(acc2, 2000);      
        // System.out.println(acc.getBalance());        
        // System.out.println(acc2.getBalance());  
        // System.out.println(emp.getAccountInformation(acc));        
        // System.out.println(emp.getAccountInformation(acc2));  

        for (String i : emp.getAccountInformation(acc).keySet()) {
            System.out.println(i + " - " + emp.getAccountInformation(acc).get(i) );
        }

        System.out.println(Output.outputJson(emp.getAccountInformation(acc)));
        System.out.println(Output.outputCsv(emp.getAccountInformation(acc)));
        // System.out.println(emp.getFName());
        System.out.println("Amber".charAt(0));
        
              

    }

    
}