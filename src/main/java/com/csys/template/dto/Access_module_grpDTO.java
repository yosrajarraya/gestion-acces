package com.csys.template.dto;

import java.lang.Integer;
import java.lang.String;

public class Access_module_grpDTO {
  private Integer id;

  private Integer idModule;

  private Integer idGroupUser;

  private String code;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdModule() {
    return idModule;
  }

  public void setIdModule(Integer idModule) {
    this.idModule = idModule;
  }

  public Integer getIdGroupUser() {
    return idGroupUser;
  }

  public void setIdGroupUser(Integer idGroupUser) {
    this.idGroupUser = idGroupUser;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}

