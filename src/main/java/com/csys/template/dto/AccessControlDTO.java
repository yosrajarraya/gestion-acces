package com.csys.template.dto;

import com.csys.template.domain.Group_user;
import com.csys.template.domain.Utilisateur;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class AccessControlDTO {
  private Integer id;

  private String code;

  private Boolean active;

  private String designation_ar;

  private String designation_fr;

  private String designation_eng;

  private Utilisateur user;

  private Group_user group;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

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

  public Utilisateur getUser() {
    return user;
  }

  public void setUser(Utilisateur user) {
    this.user = user;
  }

  public Group_user getGroup() {
    return group;
  }

  public void setGroup(Group_user group) {
    this.group = group;
  }
}

