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
@Table(name = "access_module_user", schema = "dbo")
public class Access_module_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "id_module")
    private Integer idModule;
    
    @Column(name = "id_user")
    private Integer idUser;
    
    @Column(name = "code")
    private String code;

    // Getters and setters
    
    @Override
    public String toString() {
        return "AccessModuleUser{" +
                "id=" + id +
                ", idModule=" + idModule +
                ", idUser=" + idUser +
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

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}