/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.*;

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