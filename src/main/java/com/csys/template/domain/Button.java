/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import javax.persistence.*;

@Entity
@Table(name = "Button", schema = "dbo")
public class Button {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_button")
    private int idButton;

    @Column(name = "name")
    private String name;

    @Column(name = "code_button")
    private int codeButton;

    @Column(name = "code_button_principal")
    private Integer codeButtonPrincipal;

    @Column(name = "[order]")
    private int order;

    @Column(name = "designation_ar")
    private String designationAr;

    @Column(name = "designation_fr")
    private String designationFr;

    @Column(name = "designation_eng")
    private String designationEng;

    @Column(name = "logo")
    private String logo;

    @Column(name = "id_menu")
    private Integer idMenu;

  
    public Button() {
    }

    public Button(String name, int codeButton, Integer codeButtonPrincipal, int order, String designationAr, String designationFr, String designationEng, String logo, Integer idMenu) {
        this.name = name;
        this.codeButton = codeButton;
        this.codeButtonPrincipal = codeButtonPrincipal;
        this.order = order;
        this.designationAr = designationAr;
        this.designationFr = designationFr;
        this.designationEng = designationEng;
        this.logo = logo;
        this.idMenu = idMenu;
    }

    public int getIdButton() {
        return idButton;
    }

    public void setIdButton(int idButton) {
        this.idButton = idButton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeButton() {
        return codeButton;
    }

    public void setCodeButton(int codeButton) {
        this.codeButton = codeButton;
    }

    public Integer getCodeButtonPrincipal() {
        return codeButtonPrincipal;
    }

    public void setCodeButtonPrincipal(Integer codeButtonPrincipal) {
        this.codeButtonPrincipal = codeButtonPrincipal;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
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


