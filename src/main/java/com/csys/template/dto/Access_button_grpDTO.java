package com.csys.template.dto;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class Access_button_grpDTO {
  private Integer id;

  private Integer idButton;

  private Integer idGroup;

  private String name;

  private String code;

  private Boolean active;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private Boolean visible;

  private String control;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdButton() {
    return idButton;
  }

  public void setIdButton(Integer idButton) {
    this.idButton = idButton;
  }

  public Integer getIdGroup() {
    return idGroup;
  }

  public void setIdGroup(Integer idGroup) {
    this.idGroup = idGroup;
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
}

