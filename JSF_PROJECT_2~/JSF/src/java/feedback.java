/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Avi n Nirmit
 */

@ManagedBean(name = "feedback")
@SessionScoped

public class feedback {
    
private String rating;

private String ftext;

    public String getRating() {
        return rating;
    }

    public String getFtext() {
        return ftext;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setFtext(String ftext) {
        this.ftext = ftext;
    }

}
