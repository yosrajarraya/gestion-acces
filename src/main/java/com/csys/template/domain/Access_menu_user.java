/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "access_menu_user", schema = "dbo")
public class Access_menu_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "id_menu")
    private Integer idMenu;
    
    @Column(name = "id_user")
    private Integer idUser;
    
//    @ManyToOne
//    @JoinColumn(name = "module", referencedColumnName = "id_module")
//    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
//    private Menu module;
    
    @Column(name = "visible")
    private Boolean visible;
    
    @Column(name = "num_delegate")
    private Integer numDelegate;

    // Getters and setters
    
    @Override
    public String toString() {
        return "AccessMenuUser{" +
                "id=" + id +
                ", idMenu=" + idMenu +
                ", idUser=" + idUser +
//                ", module='" + module + '\'' +
                ", visible=" + visible +
                ", numDelegate=" + numDelegate +
                '}';
    }

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

//    public Menu getModule() {
//        return module;
//    }
//
//    public void setModule(Menu module) {
//        this.module = module;
//    }

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