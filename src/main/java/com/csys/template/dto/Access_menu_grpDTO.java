package com.csys.template.dto;

import java.lang.Boolean;
import java.lang.Integer;

public class Access_menu_grpDTO {
  private Integer id;

  private Integer idMenu;

  private Integer idGroupUser;

  private Boolean visible;

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

  public Integer getIdGroupUser() {
    return idGroupUser;
  }

  public void setIdGroupUser(Integer idGroupUser) {
    this.idGroupUser = idGroupUser;
  }

  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }
}

