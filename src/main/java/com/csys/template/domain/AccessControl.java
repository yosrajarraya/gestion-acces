<<<<<<< HEAD
package com.csys.template.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Id;

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;

import javax.validation.Valid;


>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
@Entity
@Table(name = "Access_Control", schema = "dbo")
public class AccessControl implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
<<<<<<< HEAD
    private Long id;

   
    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Utilisateur user_id;

    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group_user groupId;

    @Column(name = "code")
=======
    private Integer id;   
   @Column(name = "code")
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    private String code;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "designation_ar")
    private String designation_ar;

    @Column(name = "designation_fr")
    private String designation_fr;

    @Column(name = "designation_eng")
    private String designation_eng;
<<<<<<< HEAD

    @Column(name = "description")
    private String description;

    @Column(name = "date_expiration")
    private LocalDateTime date_expiration;

    @Column(name = "date_creation")
    private LocalDateTime date_creation;

    @Column(name = "user_creation")
    private String user_creation;

    public AccessControl() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUser_id() {
        return user_id;
    }

    public void setUser_id(Utilisateur user_id) {
        this.user_id = user_id;
    }

    public Group_user getGroup_id() {
        return groupId;
    }

    public void setGroup_id(Group_user group_id) {
        this.groupId = group_id;
    }

    public String getCode() {
        return code;
    }
=======
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
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

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
<<<<<<< HEAD

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(LocalDateTime date_expiration) {
        this.date_expiration = date_expiration;
    }

    public LocalDateTime getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(LocalDateTime date_creation) {
        this.date_creation = date_creation;
    }

    public String getUser_creation() {
        return user_creation;
    }

    public void setUser_creation(String user_creation) {
        this.user_creation = user_creation;
    }

  

}

    

=======
  

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
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
