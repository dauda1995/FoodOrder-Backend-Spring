package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Buyer {
    
    @Id
    @Column
    private int id;

    @Column
    private String email;

    @Column
    private String phoneNo;

    @Column
    private String city;

    @Column
    private String type;
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public Buyer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
}
