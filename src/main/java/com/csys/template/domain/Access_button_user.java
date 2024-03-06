/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

/**
 *
 * @author Yosra
 */

import javax.persistence.*;

@Entity
@Table(name =  "Access_button_user", schema = "dbo")
public class Access_button_user {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    
    @Column(name = "id_button")
    private Integer id_button;


    @Column(name = "id_user")
    private Integer id_user;

  

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

    @Column(name = "num_delegate")
    private Integer numDelegate;

    // Getters and setters

    public Access_button_user() {
    }

    public Access_button_user(int id, Integer id_button, Integer id_user, String name, String code, Boolean active, String designationAr, String designationFr, String designationEng, Boolean visible, String control, Integer numDelegate) {
        this.id = id;
        this.id_button = id_button;
        this.id_user = id_user;
        this.name = name;
        this.code = code;
        this.active = active;
        this.designationAr = designationAr;
        this.designationFr = designationFr;
        this.designationEng = designationEng;
        this.visible = visible;
        this.control = control;
        this.numDelegate = numDelegate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getButton() {
        return id_button;
    }

    public void setButton(Integer button) {
        this.id_button = button;
    }

    public Integer getUser() {
        return id_user;
    }

    public void setUser(Integer user) {
        this.id_user = user;
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

    public Integer getNumDelegate() {
        return numDelegate;
    }

    public void setNumDelegate(Integer numDelegate) {
        this.numDelegate = numDelegate;
    }

  

}