package com.csys.template.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "Utilisateur", schema = "dbo")
public class Utilisateur implements Serializable  {
 @Id
@GeneratedValue
@Column(name = "id_user")
    private Integer id_user;
    @Column(name = "code")
    private String code;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "designation_ar")
    private String designation_ar;
    
    @Column(name = "designation_fr")
    private String designation_fr;
    
    @Column(name = "designation_eng")
    private String designation_eng;
    
    @Column(name = "user_creation")
    private String user_creation;

    public Utilisateur(Integer id_user, String code, String name, LocalDateTime dateCreation, String password, String designation_ar, String designation_fr, String designation_eng, String user_creation, Boolean active) {
        this.id_user = id_user;
        this.code = code;
        this.name = name;
        this.dateCreation = dateCreation;
        this.password = password;
        this.designation_ar = designation_ar;
        this.designation_fr = designation_fr;
        this.designation_eng = designation_eng;
        this.user_creation = user_creation;
        this.active = active;
    }
    
    @Column(name = "active")
    private Boolean active;

    public Utilisateur() {
    }

    public Integer getIdUser() {
        return id_user;
    }

    public void setIdUser(Integer idUser) {
        this.id_user = idUser;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getUser_creation() {
        return user_creation;
    }

    public void setUser_creation(String user_creation) {
        this.user_creation = user_creation;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
       
  
   
}
