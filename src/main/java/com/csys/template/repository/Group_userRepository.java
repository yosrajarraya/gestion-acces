package com.csys.template.repository;

import com.csys.template.domain.Group_user;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Group_user entity.
 */
@Repository
public interface Group_userRepository extends JpaRepository<Group_user, Integer> {
}

