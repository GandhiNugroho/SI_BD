package Pojos;
// Generated Nov 1, 2018 12:37:59 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String password;
     private String username;

    public User() {
    }

    public User(String password, String username) {
       this.password = password;
       this.username = username;
    }
   
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }




}


