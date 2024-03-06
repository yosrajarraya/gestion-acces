package com.csys.template.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;
=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

public class UtilisateurDTO {
<<<<<<< HEAD
  private Integer idUser;
=======
  private Integer id_user;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  private String code;

  private String name;

<<<<<<< HEAD
  private LocalDateTime date_creation;

  private String password;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private String userCreation;

  private Boolean active;

   @JsonProperty("id_user")
    public Integer getIdUser() {
        return idUser;
    }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
=======
  private LocalDateTime dateCreation;

  private String password;

  private String designation_ar;

  private String designation_fr;

  private String designation_eng;

  private String user_creation;

  private Boolean active;

  public Integer getId_user() {
    return id_user;
  }

  public void setId_user(Integer id_user) {
    this.id_user = id_user;
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
}

