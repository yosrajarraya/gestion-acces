package com.csys.template.repository;

import com.csys.template.domain.Access_button_grp;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Access_button_grp entity.
 */
@Repository
public interface Access_button_grpRepository extends JpaRepository<Access_button_grp, Integer> {
}

