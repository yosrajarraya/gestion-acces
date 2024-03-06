package com.csys.template.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "Utilisateur", schema = "dbo")
public class Utilisateur implements Serializable {
   @Id
    @GeneratedValue
    @Column(name = "id_user")
    private Integer idUser;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "date_creation")
    private LocalDateTime date_creation;

    @Column(name = "password")
    private String password;
    
    @Column(name = "designation_ar")
    private String designationAr;
    
    @Column(name = "designation_fr")
    private String designationFr;
    
    @Column(name = "designation_eng")
    private String designationEng;

    @Column(name = "user_creation")
    private String userCreation;

    @Column(name = "active")
    private Boolean active;


public Utilisateur() {
 
}

    @JsonCreator
    public Utilisateur(@JsonProperty("id_user") Integer idUser) {
        this.idUser = idUser;
       
    }


    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    public LocalDateTime getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(LocalDateTime date_creation) {
        this.date_creation = date_creation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignationAr() {
        return designationAr;
    }

    public void setDesignationAr(String designationAr) {
        this.designationAr = designationAr;
    }

    public String getDesignationFr() {
        return designationFr;
    }

    public void setDesignationFr(String designationFr) {
        this.designationFr = designationFr;
    }

    public String getDesignationEng() {
        return designationEng;
    }

    public void setDesignationEng(String designationEng) {
        this.designationEng = designationEng;
    }

    public String getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(String userCreation) {
        this.userCreation = userCreation;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
   
}
