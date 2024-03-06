package com.csys.template.repository;

import com.csys.template.domain.AccessControl;
import com.csys.template.domain.Utilisateur;
import java.lang.Long;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AccessControl entity.
 */
@Repository
public interface AccessControlRepository extends JpaRepository<AccessControl, Long> {

   
}




