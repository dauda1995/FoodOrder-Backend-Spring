package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Products {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String pic;

    @Column
    private String maker;

    @Column
    private String time;

    @Column
    private String description;

    

    // public Products(int id, String name, String pic, String maker, String time, String description) {
    //     this.id = id;
    //     this.name = name;
    //     this.pic = pic;
    //     this.maker = maker;
    //     this.time = time;
    //     this.description = description;
    // }

    public Products() {
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    


}
