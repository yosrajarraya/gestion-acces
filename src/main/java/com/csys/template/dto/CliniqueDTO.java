package com.csys.template.dto;

import java.lang.Integer;
import java.lang.String;

public class CliniqueDTO {
  private Integer id_clinique;

  private String name;

  private Integer id_user;

  public Integer getId_clinique() {
    return id_clinique;
  }

  public void setId_clinique(Integer id_clinique) {
    this.id_clinique = id_clinique;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId_user() {
    return id_user;
  }

  public void setId_user(Integer id_user) {
    this.id_user = id_user;
  }
}

