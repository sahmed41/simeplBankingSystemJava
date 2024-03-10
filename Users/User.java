package Users;

import java.time.LocalDate;

/**
 * User
 */
abstract class User {
    
    private String id;
    private String fname;
    private String lname;
    private LocalDate dob;
    private String userName;
    private String password;

    public User(String id, String fname, String lname, LocalDate dob, String userName, String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.userName = userName;
        this.password = password;
    }


    // Getters

    public String getId() {
        return id;
    };

    public String getFName() {
        return fname;
    };

    public String getLName() {
        return lname;
    };

    public LocalDate getDob() {
        return dob;
    };

    public String getUserName() {
        return userName;
    };
    public String getPassword() {
        return password;
    };


    // Setters

    public void setFName(String newFName) {
        fname = newFName;
    };

    public void setLName(String newLname) {
        lname = newLname;
    };

    public void setdob(LocalDate newDob) {
        dob = newDob;
    };

    public void setUserName(String newUserName) {
        userName = newUserName;
    };

    public void setPassword(String newPassword) {
        password = newPassword;
    };

    // Other methods
    // public void login() {
    //     System.out.println("You are successfully loggedin");
    // }

    // // Other methods
    // public void logout() {
    //     System.out.println("You are successfully loggedout");
    // }
} 
