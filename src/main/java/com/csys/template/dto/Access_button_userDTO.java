package com.csys.template.dto;

import com.csys.template.domain.Button;
import com.csys.template.domain.Module;
import com.csys.template.domain.Utilisateur;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class Access_button_userDTO {
  private Integer id;

  private Integer id_button;

  private Integer id_user;


  private String name;

  private String code;

  private Boolean active;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private Boolean visible;

  private String control;

  private Integer numDelegate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getButton() {
    return id_button;
  }

  public void setButton(Integer button) {
    this.id_button = button;
  }

  public Integer getUser() {
    return id_user;
  }

  public void setUser(Integer user) {
    this.id_user = user;
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

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
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

  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public String getControl() {
    return control;
  }

  public void setControl(String control) {
    this.control = control;
  }

  public Integer getNumDelegate() {
    return numDelegate;
  }

  public void setNumDelegate(Integer numDelegate) {
    this.numDelegate = numDelegate;
  }
}

