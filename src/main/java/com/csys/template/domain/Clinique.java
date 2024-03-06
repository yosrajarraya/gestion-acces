package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Clinique" , schema="dbo")
public class Clinique  {

    @Id
    @GeneratedValue
    @Column(name = "id_clinique")
    private int id_clinique;

    @Column(name = "name")
    private String name;
    
    
    @Column(name ="id_user")
    private Integer id_user;
    
    public Clinique() {
    }

    public int getId_clinique() {
        return id_clinique;
    }

    public void setId_clinique(int id_clinique) {
        this.id_clinique = id_clinique;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }


}
