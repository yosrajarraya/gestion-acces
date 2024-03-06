package com.csys.template.domain;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "Utilisateur", schema = "dbo")
<<<<<<< HEAD
public class Utilisateur implements Serializable {
   @Id
    @GeneratedValue
    @Column(name = "id_user")
    private Integer idUser;
    
=======
public class Utilisateur implements Serializable  {
 @Id
@GeneratedValue
@Column(name = "id_user")
    private Integer id_user;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    @Column(name = "code")
    private String code;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "date_creation")
<<<<<<< HEAD
    private LocalDateTime date_creation;

=======
    private LocalDateTime dateCreation;
    
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    @Column(name = "password")
    private String password;
    
    @Column(name = "designation_ar")
<<<<<<< HEAD
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
=======
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
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
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

<<<<<<< HEAD
    public LocalDateTime getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(LocalDateTime date_creation) {
        this.date_creation = date_creation;
=======
    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
<<<<<<< HEAD
=======
       
  
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
   
}
