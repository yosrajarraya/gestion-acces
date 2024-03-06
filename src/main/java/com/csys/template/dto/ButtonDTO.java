package com.csys.template.dto;

import java.lang.Integer;
import java.lang.String;

public class ButtonDTO {
  private Integer idButton;

  private String name;

  private Integer codeButton;

  private Integer codeButtonPrincipal;

  private Integer order;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private String logo;

  private Integer idMenu;

  public Integer getIdButton() {
    return idButton;
  }

  public void setIdButton(Integer idButton) {
    this.idButton = idButton;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getCodeButton() {
    return codeButton;
  }

  public void setCodeButton(Integer codeButton) {
    this.codeButton = codeButton;
  }

  public Integer getCodeButtonPrincipal() {
    return codeButtonPrincipal;
  }

  public void setCodeButtonPrincipal(Integer codeButtonPrincipal) {
    this.codeButtonPrincipal = codeButtonPrincipal;
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

