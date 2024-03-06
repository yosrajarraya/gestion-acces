package com.csys.template.domain;

import java.io.Serializable;
<<<<<<< HEAD
import java.time.LocalDateTime;
=======
import java.util.List;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import javax.persistence.*;


@Entity
<<<<<<< HEAD
@Table(name = "group_user", schema = "dbo") 
=======
@Table(name = "Group_user", schema = "dbo") 
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
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

<<<<<<< HEAD
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

=======
    public Group_user(Integer id_group, String name, String code, String designation_ar, String designation_fr, String designation_eng) {
        this.id_group = id_group;
        this.name = name;
        this.code = code;
        this.designation_ar = designation_ar;
        this.designation_fr = designation_fr;
        this.designation_eng = designation_eng;
    }

    public Group_user() {
    }

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public Integer getId_group() {
        return id_group;
    }

<<<<<<< HEAD
=======
    public void setId_group(Integer id_group) {
        this.id_group = id_group;
    }

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public String getName() {
        return name;
    }

<<<<<<< HEAD
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

=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
=======
    public String getCode() {
        return code;
    }

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public void setCode(String code) {
        this.code = code;
    }

<<<<<<< HEAD
=======
    public String getDesignation_ar() {
        return designation_ar;
    }

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public void setDesignation_ar(String designation_ar) {
        this.designation_ar = designation_ar;
    }

<<<<<<< HEAD
=======
    public String getDesignation_fr() {
        return designation_fr;
    }

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public void setDesignation_fr(String designation_fr) {
        this.designation_fr = designation_fr;
    }

<<<<<<< HEAD
    public void setDesignation_eng(String designation_eng) {
        this.designation_eng = designation_eng;
    }

 


    @Override
    public String toString() {
        return "Group_user{" + "id_group=" + id_group + ", name=" + name + ", code=" + code + ", designation_ar=" + designation_ar + ", designation_fr=" + designation_fr + ", designation_eng=" + designation_eng +  '}';
    }
     
     
=======
    public String getDesignation_eng() {
        return designation_eng;
    }

    public void setDesignation_eng(String designation_eng) {
        this.designation_eng = designation_eng;
    }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
}