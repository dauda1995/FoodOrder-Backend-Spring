package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Delivery {
    
    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String logo;

    @Column
    private String email;

    @Column
    private String phoneNo;

    @Column
    private String type;

    
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



   
    public Delivery() {
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setphoneNo(String phone) {
        this.phoneNo = phone;
    }





}
