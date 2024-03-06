package com.csys.template.dto;

import com.csys.template.domain.Menu;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class Access_menu_userDTO {
  private Integer id;

  private Integer idMenu;

  private Integer idUser;

//  private Menu module;

  private Boolean visible;

  private Integer numDelegate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdMenu() {
    return idMenu;
  }

  public void setIdMenu(Integer idMenu) {
    this.idMenu = idMenu;
  }

  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

//  public Menu getModule() {
//    return module;
//  }
//
//  public void setModule(Menu module) {
//    this.module = module;
//  }

  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public Integer getNumDelegate() {
    return numDelegate;
  }

  public void setNumDelegate(Integer numDelegate) {
    this.numDelegate = numDelegate;
  }
}

