package com.csys.template.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;


@Entity
@Table(name = "group_user", schema = "dbo") 
public class Group_user implements Serializable {
    
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private Integer id_group;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "designation_ar")
    private String designation_ar;

    @Column(name = "designation_fr")
    private String designation_fr;

    @Column(name = "designation_eng")
    private String designation_eng;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(LocalDateTime userCreation) {
        this.userCreation = userCreation;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    @Column(name = "active")
    private Boolean active;
    
    @Column(name = "user_creation")
    private LocalDateTime userCreation;
    
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;

    public Integer getId_group() {
        return id_group;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDesignation_ar() {
        return designation_ar;
    }

    public String getDesignation_fr() {
        return designation_fr;
    }

    public String getDesignation_eng() {
        return designation_eng;
    }




    public void setId_group(Integer id_group) {
        this.id_group = id_group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesignation_ar(String designation_ar) {
        this.designation_ar = designation_ar;
    }

    public void setDesignation_fr(String designation_fr) {
        this.designation_fr = designation_fr;
    }

    public void setDesignation_eng(String designation_eng) {
        this.designation_eng = designation_eng;
    }

 


    @Override
    public String toString() {
        return "Group_user{" + "id_group=" + id_group + ", name=" + name + ", code=" + code + ", designation_ar=" + designation_ar + ", designation_fr=" + designation_fr + ", designation_eng=" + designation_eng +  '}';
    }
     
     
}