/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;


import javax.persistence.*;

@Entity
@Table(name = "access_module_grp", schema = "dbo")
public class Access_module_grp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "id_module")
    private Integer idModule;
    
    @Column(name = "id_group_user")
    private Integer idGroupUser;
    
    @Column(name = "code")
    private String code;

    // Getters and setters
    
    @Override
    public String toString() {
        return "AccessModuleGroup{" +
                "id=" + id +
                ", idModule=" + idModule +
                ", idGroupUser=" + idGroupUser +
                ", code='" + code + '\'' +
                '}';
    }

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