package com.csys.template.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

public class UtilisateurDTO {
  private Integer idUser;

  private String code;

  private String name;

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

