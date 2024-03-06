package com.csys.template.repository;

import com.csys.template.domain.Clinique;
import java.lang.Integer;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Clinique entity.
 */
@Repository
public interface CliniqueRepository extends JpaRepository<Clinique, Integer> {

    @Query("SELECT c FROM Clinique c WHERE c.name = ?1")
    Collection<Clinique> findCliniquesByName(String name);
}

