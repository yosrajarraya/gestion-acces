package com.csys.template.repository;

import com.csys.template.domain.AccessControl;
<<<<<<< HEAD
import com.csys.template.domain.Utilisateur;
import java.lang.Long;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AccessControl entity.
 */
@Repository
<<<<<<< HEAD
public interface AccessControlRepository extends JpaRepository<AccessControl, Long> {

   
}




=======
public interface AccessControlRepository extends JpaRepository<AccessControl, Integer> {
}

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
