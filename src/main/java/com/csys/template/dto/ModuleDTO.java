package com.csys.template.dto;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class ModuleDTO {
  private Integer idModule;

  private String codeModule;

  private String designationAr;

  private String designationFr;

  private String designationEng;

  private Boolean active;

  private String versionDatabase;

  private String urlWeb;

  public Integer getIdModule() {
    return idModule;
  }

  public void setIdModule(Integer idModule) {
    this.idModule = idModule;
  }

  public String getCodeModule() {
    return codeModule;
  }

  public void setCodeModule(String codeModule) {
    this.codeModule = codeModule;
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

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public String getVersionDatabase() {
    return versionDatabase;
  }

  public void setVersionDatabase(String versionDatabase) {
    this.versionDatabase = versionDatabase;
  }

  public String getUrlWeb() {
    return urlWeb;
  }

  public void setUrlWeb(String urlWeb) {
    this.urlWeb = urlWeb;
  }
}

