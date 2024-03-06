package com.csys.template.dto;

import com.csys.template.domain.Menu;
import java.lang.Integer;
import java.lang.String;

public class MenuDTO {
  private Integer idMenu;

  private String codeMenu;

  private Menu codeMenuPrincipal;

  private Integer order;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private String logo;

  private Integer idModule;

  public Integer getIdMenu() {
    return idMenu;
  }

  public void setIdMenu(Integer idMenu) {
    this.idMenu = idMenu;
  }

  public String getCodeMenu() {
    return codeMenu;
  }

  public void setCodeMenu(String codeMenu) {
    this.codeMenu = codeMenu;
  }

  public Menu getCodeMenuPrincipal() {
    return codeMenuPrincipal;
  }

  public void setCodeMenuPrincipal(Menu codeMenuPrincipal) {
    this.codeMenuPrincipal = codeMenuPrincipal;
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

  public Integer getIdModule() {
    return idModule;
  }

  public void setIdModule(Integer idModule) {
    this.idModule = idModule;
  }
}

