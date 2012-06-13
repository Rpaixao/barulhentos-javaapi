/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barulhentos.javaapi;

import java.sql.Date;

/**
 *
 * @author rubenpaixao
 */
public class Partner{
    private String name;
    private int id;
    private String picture;
    private Date birthday;
    private Date enrolement;
    
    
    public Partner(int id, String name, String picture){
        this.id=id;
        this.name=name;
        this.picture=picture;
        this.birthday=null;//Not implemented yet.
        this.enrolement=null;//Not implemented yer.
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEnrolement() {
        return enrolement;
    }

    public void setEnrolement(Date enrolement) {
        this.enrolement = enrolement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
