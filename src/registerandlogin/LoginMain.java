/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerandlogin;

/**
 *
 * @author Vincent
 */

public class LoginMain {
    
    private String Sname;
    private String Uname;
    private String pass1;
    private String pass2;

    public void setSname(String Sname){
        this.Sname = Sname;
        
    }
    public void setUname(String Uname){
        this.Uname = Uname;
       
    }
    public void setpass1(String pass1){
        this.pass1 = pass1;
       
    }
    public void setpass2(String pass2){
        this.pass2 = pass2;
       
    }
    public String getSname(){
        return this.Sname;
    }
    public String getUname(){
        return this.Uname;
    }
    public String getpass1(){
        return this.pass1;
    }
    
   public String getpass2(){
        return this.pass2;
    }
    
}

