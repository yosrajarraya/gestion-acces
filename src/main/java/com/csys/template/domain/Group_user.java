package com.csys.template.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "Group_user", schema = "dbo") 
public class Group_user implements Serializable {
    
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private Integer id_group;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "designation_ar")
    private String designation_ar;

    @Column(name = "designation_fr")
    private String designation_fr;

    @Column(name = "designation_eng")
    private String designation_eng;

    public Group_user(Integer id_group, String name, String code, String designation_ar, String designation_fr, String designation_eng) {
        this.id_group = id_group;
        this.name = name;
        this.code = code;
        this.designation_ar = designation_ar;
        this.designation_fr = designation_fr;
        this.designation_eng = designation_eng;
    }

    public Group_user() {
    }

    public Integer getId_group() {
        return id_group;
    }

    public void setId_group(Integer id_group) {
        this.id_group = id_group;
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

    public String getDesignation_ar() {
        return designation_ar;
    }

    public void setDesignation_ar(String designation_ar) {
        this.designation_ar = designation_ar;
    }

    public String getDesignation_fr() {
        return designation_fr;
    }

    public void setDesignation_fr(String designation_fr) {
        this.designation_fr = designation_fr;
    }

    public String getDesignation_eng() {
        return designation_eng;
    }

    public void setDesignation_eng(String designation_eng) {
        this.designation_eng = designation_eng;
    }
}