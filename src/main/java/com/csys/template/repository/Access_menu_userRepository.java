package com.csys.template.repository;

import com.csys.template.domain.Access_menu_user;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Access_menu_user entity.
 */
@Repository
public interface Access_menu_userRepository extends JpaRepository<Access_menu_user, Integer> {
}

