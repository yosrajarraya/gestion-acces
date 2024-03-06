/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;
import javax.persistence.*;

@Entity
@Table(name = "clinique", schema = "dbo")
public class Clinique {
    @Id
    @GeneratedValue
   @Column(name = "id_clinique")
    private Integer id_clinique;
    
    
    @Column(name = "id_user")
    private Integer id_user;
    
   
    
    @Column(name = "name")
    private String name;

    public Clinique() {
    }

    public Integer getId_clinique() {
        return id_clinique;
    }

    public void setId_clinique(Integer id_clinique) {
        this.id_clinique = id_clinique;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
 
    public Clinique(Integer id_clinique, Integer id_user, String name) {
        this.id_clinique = id_clinique;
        this.id_user = id_user;
        this.name = name;
    }

}