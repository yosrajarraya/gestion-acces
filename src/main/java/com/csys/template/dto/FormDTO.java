package com.csys.template.dto;

import java.lang.Integer;
import java.lang.String;

public class FormDTO {
  private Integer idForm;

  private String name;

  private String codeForm;

  private String codeFormPrincipal;

  private Integer order;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private String logo;

  private Integer idMenu;

  public Integer getIdForm() {
    return idForm;
  }

  public void setIdForm(Integer idForm) {
    this.idForm = idForm;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCodeForm() {
    return codeForm;
  }

  public void setCodeForm(String codeForm) {
    this.codeForm = codeForm;
  }

  public String getCodeFormPrincipal() {
    return codeFormPrincipal;
  }

  public void setCodeFormPrincipal(String codeFormPrincipal) {
    this.codeFormPrincipal = codeFormPrincipal;
  }

  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
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

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Integer getIdMenu() {
    return idMenu;
  }

  public void setIdMenu(Integer idMenu) {
    this.idMenu = idMenu;
  }
}

