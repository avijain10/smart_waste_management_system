import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avi
 */

@ManagedBean(name = "scheduleData")
@SessionScoped
public class schedule implements Serializable {
   private static final long serialVersionUID = 1L;
   public String[] data = {"1","2","3","4"};

    /**
     *
     */
    Date date;
    public String data1 = "1";
    public String data2 = "1";

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   
    
   public String[] getData() {
      return data;
     
   }

   public void setData(String[] data) {
      this.data= data;
   }

    public String getData1() {
        return String.valueOf(data1);
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }
    
    

  
   
}  

  
  