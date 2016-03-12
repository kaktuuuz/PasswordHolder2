/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.Serializable;

/**
 *
 * @author Toshiba
 */
public class MyBean implements Serializable{
    private String whereFrom;
    private String login;
    private String password;
    private String options;

    public String getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        this.whereFrom = whereFrom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public MyBean(String whereFrom, String login, String password, String options) {
        this.whereFrom = whereFrom;
        this.login = login;
        this.password = password;
        this.options = options;
    }
    @Override
    public String toString(){
        return this.getWhereFrom()+" "+this.getLogin()+" "+this.getPassword()+" "+this.getOptions();
    }
    
}
