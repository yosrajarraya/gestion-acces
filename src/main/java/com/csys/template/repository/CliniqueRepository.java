package com.csys.template.repository;

import com.csys.template.domain.Clinique;
import java.lang.Integer;
import java.util.Collection;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Clinique entity.
 */
@Repository
public interface CliniqueRepository extends JpaRepository<Clinique, Integer> {
<<<<<<< HEAD

    @Query("SELECT c FROM Clinique c WHERE c.name = ?1")
    Collection<Clinique> findCliniquesByName(String name);
=======
@Query("SELECT c FROM Clinique c WHERE c.name = ?1")
    public Collection<Clinique> findByCliniqueName(String name);
    
    
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
}

