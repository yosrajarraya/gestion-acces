package com.csys.template.repository;

import com.csys.template.domain.Access_module_user;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Access_module_user entity.
 */
@Repository
public interface Access_module_userRepository extends JpaRepository<Access_module_user, Integer> {
}

