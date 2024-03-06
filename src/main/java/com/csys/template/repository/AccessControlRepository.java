package com.csys.template.repository;

import com.csys.template.domain.AccessControl;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AccessControl entity.
 */
@Repository
public interface AccessControlRepository extends JpaRepository<AccessControl, Integer> {
}

