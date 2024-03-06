package com.csys.template.dto;

import com.csys.template.domain.Group_user;
import com.csys.template.domain.Utilisateur;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDateTime;

public class AccessControlDTO {
  private Long id;

  private Utilisateur user_id;

  private Group_user groupId;

  private String code;

  private Boolean active;

  private String designation_ar;

  private String designation_fr;

  private String designation_eng;

  private String description;

  private LocalDateTime date_expiration;

  private LocalDateTime date_creation;

  private String user_creation;

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

