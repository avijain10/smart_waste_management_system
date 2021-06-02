
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avi
 */


@ManagedBean(name="n1")
@RequestScoped
public class Login {
    
    private String firstname;
   
    private String lastname;
    
    private String contactnumber;
    
    private String address;
    
    private String emadd;

    public Login() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    

    public String getEmadd() {
        return emadd;
    }

    public void setEmadd(String emadd) {
        this.emadd = emadd;
    }

   
    
    
    
}
