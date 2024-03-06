package com.csys.template.domain;

import javax.persistence.*;

@Entity
@Table(name = "Module", schema = "dbo")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_module")
    private Integer idModule;
    
    @Column(name = "code_module")
    private String codeModule;
    
    @Column(name = "designation_ar")
    private String designationAr;
    
    @Column(name = "designation_fr")
    private String designationFr;
    
    @Column(name = "designation_eng")
    private String designationEng;
    
    @Column(name = "active")
    private Boolean active;
    
    @Column(name = "version_database")
    private String versionDatabase;
    
    @Column(name = "urlWeb")
    private String urlWeb;

    // Getters and setters
    
    @Override
    public String toString() {
        return "Module{" +
                "idModule=" + idModule +
                ", codeModule='" + codeModule + '\'' +
                ", designationAr='" + designationAr + '\'' +
                ", designationFr='" + designationFr + '\'' +
                ", designationEng='" + designationEng + '\'' +
                ", active=" + active +
                ", versionDatabase='" + versionDatabase + '\'' +
                ", urlWeb='" + urlWeb + '\'' +
                '}';
    }

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
