/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;


import javax.persistence.*;

@Entity
@Table(name = "access_form_grp", schema = "dbo")
public class Access_button_grp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "id_form")
    private Integer idForm;
    
    @Column(name = "id_group")
    private Integer idGroup;
    
    @Column(name = "id_module")
    private Integer idModule;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "active")
    private Boolean active;
    
    @Column(name = "designation_ar")
    private String designationAr;
    
    @Column(name = "designation_fr")
    private String designationFr;
    
    @Column(name = "designation_eng")
    private String designationEng;
    
    @Column(name = "visible")
    private Boolean visible;
    
    @Column(name = "control")
    private String control;

    // Getters and setters
    
    @Override
    public String toString() {
        return "AccessFormGroup{" +
                "id=" + id +
                ", idForm=" + idForm +
                ", idGroup=" + idGroup +
                ", idModule=" + idModule +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", active=" + active +
                ", designationAr='" + designationAr + '\'' +
                ", designationFr='" + designationFr + '\'' +
                ", designationEng='" + designationEng + '\'' +
                ", visible=" + visible +
                ", control='" + control + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdForm() {
        return idForm;
    }

    public void setIdForm(Integer idForm) {
        this.idForm = idForm;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
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
