package com.csys.template.dto;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;

public class Group_userDTO {
  private Integer id_group;

  private String name;

  private String code;

  private String designation_ar;

  private String designation_fr;

  private String designation_eng;

  private Boolean active;

  private LocalDateTime userCreation;

  private LocalDateTime dateCreation;

  public Integer getId_group() {
    return id_group;
  }

  public void setId_group(Integer id_group) {
    this.id_group = id_group;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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
}

