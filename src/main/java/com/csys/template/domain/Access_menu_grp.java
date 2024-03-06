/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;

import javax.persistence.*;

@Entity
@Table(name = "access_menu_grp", schema = "dbo")
public class Access_menu_grp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "id_menu")
    private Integer idMenu;
    
    @Column(name = "id_group_user")
    private Integer idGroupUser;
    
<<<<<<< HEAD
  
=======
    @Column(name = "module")
    private String module;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    
    @Column(name = "visible")
    private Boolean visible;

    // Getters and setters
    
    @Override
    public String toString() {
        return "AccessMenuGroup{" +
                "id=" + id +
                ", idMenu=" + idMenu +
                ", idGroupUser=" + idGroupUser +
<<<<<<< HEAD
//                ", module='" + module + '\'' +
=======
                ", module='" + module + '\'' +
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
                ", visible=" + visible +
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

    public Integer getIdGroupUser() {
        return idGroupUser;
    }

    public void setIdGroupUser(Integer idGroupUser) {
        this.idGroupUser = idGroupUser;
    }

<<<<<<< HEAD
//    public String getModule() {
//        return module;
//    }
//
//    public void setModule(String module) {
//        this.module = module;
//    }
=======
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}