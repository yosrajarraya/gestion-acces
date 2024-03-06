<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csys.template.domain;
import javax.persistence.*;

@Entity
@Table(name = "clinique", schema = "dbo")
public class Clinique {
    @Id
    @GeneratedValue
   @Column(name = "id_clinique")
    private Integer id_clinique;
    
    
    @Column(name = "id_user")
    private Integer id_user;
    
   
    
    @Column(name = "name")
    private String name;

    public Clinique() {
    }

    public Integer getId_clinique() {
        return id_clinique;
    }

    public void setId_clinique(Integer id_clinique) {
        this.id_clinique = id_clinique;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

=======
package com.csys.template.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Clinique" , schema="dbo")
public class Clinique  {

    @Id
    @GeneratedValue
    @Column(name = "id_clinique")
    private int id_clinique;

    @Column(name = "name")
    private String name;
    
    
    @Column(name ="id_user")
    private Integer id_user;
    
    public Clinique() {
    }

    public int getId_clinique() {
        return id_clinique;
    }

    public void setId_clinique(int id_clinique) {
        this.id_clinique = id_clinique;
    }

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
  
 
    public Clinique(Integer id_clinique, Integer id_user, String name) {
        this.id_clinique = id_clinique;
        this.id_user = id_user;
        this.name = name;
    }

}
=======
    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }


}
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
