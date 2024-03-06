/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;

import javax.validation.Valid;


@Entity
@Table(name = "Access_Control", schema = "dbo")
public class AccessControl implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;   
   @Column(name = "code")
    private String code;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "designation_ar")
    private String designation_ar;

    @Column(name = "designation_fr")
    private String designation_fr;

    @Column(name = "designation_eng")
    private String designation_eng;
  @ManyToOne
    @JoinColumn(name = "user_id")
    @Valid 
    private Utilisateur user;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @Valid 
    private Group_user group;

   public String getCode() {
    return code;
}

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDesignation_ar() {
        return designation_ar;
    }

    public void setDesignation_ar(String designation_ar) {
        this.designation_ar = designation_ar;
    }

    public String getDesignation_fr() {
        return designation_fr;
    }

    public void setDesignation_fr(String designation_fr) {
        this.designation_fr = designation_fr;
    }

    public String getDesignation_eng() {
        return designation_eng;
    }

    public void setDesignation_eng(String designation_eng) {
        this.designation_eng = designation_eng;
    }
  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public Group_user getGroup() {
        return group;
    }

    public void setGroup(Group_user  group) {
        this.group = group;
    }
    
    
}
