<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.*;
//jjjj
@Entity
@Table(name = "Menu", schema = "dbo")
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private Integer idMenu;
    
    @Column(name = "code_menu")
    private String codeMenu;
    
    @ManyToOne
    @JoinColumn(name = "code_menu_principal", referencedColumnName = "code_menu")
    private Menu codeMenuPrincipal;
     

    @Column(name = "orders")
    private Integer order;
    
    @Column(name = "designation_ar")
    private String designationAr;
    
    @Column(name = "designation_fr")
    private String designationFr;
    
    @Column(name = "designation_eng")
    private String designationEng;
    
    @Column(name = "logo")
    private String logo;
    
    @Column(name = "id_module")
    private Integer idModule;

    // Getters and setters
    
    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", codeMenu='" + codeMenu + '\'' +
                ", codeMenuPrincipal='" + codeMenuPrincipal + '\'' +
                ", order=" + order +
                ", designationAr='" + designationAr + '\'' +
                ", designationFr='" + designationFr + '\'' +
                ", designationEng='" + designationEng + '\'' +
                ", logo='" + logo + '\'' +
                ", idModule=" + idModule +
                '}';
    }

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
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Yosra
 */

@Entity
@Table(name = "Menu", schema = "dbo")
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private Integer idMenu;

    public Menu(Integer idMenu, String codeMenu, Menu codeMenuPrincipal, Integer order, String designationAr, String designationFr, String designationEng, String logo, Integer idModule) {
        this.idMenu = idMenu;
        this.codeMenu = codeMenu;
        this.codeMenuPrincipal = codeMenuPrincipal;
        this.order = order;
        this.designationAr = designationAr;
        this.designationFr = designationFr;
        this.designationEng = designationEng;
        this.logo = logo;
        this.idModule = idModule;
    }

    public Menu() {
    }

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
    
    @Column(name = "code_menu")
    private String codeMenu;
    
    @ManyToOne
    @JoinColumn(name = "code_menu_principal", referencedColumnName = "code_menu")
    private Menu codeMenuPrincipal;
     

    @Column(name = "orders")
    private Integer order;
    
    @Column(name = "designation_ar")
    private String designationAr;
    
    @Column(name = "designation_fr")
    private String designationFr;
    
    @Column(name = "designation_eng")
    private String designationEng;
    
    @Column(name = "logo")
    private String logo;
    
    @Column(name = "id_module")
    private Integer idModule;
}
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
