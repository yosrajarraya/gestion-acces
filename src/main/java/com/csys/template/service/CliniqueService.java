package com.csys.template.service;

import com.csys.template.domain.Clinique;
import com.csys.template.dto.CliniqueDTO;
import com.csys.template.factory.CliniqueFactory;
import com.csys.template.repository.CliniqueRepository;
<<<<<<< HEAD
import java.lang.Integer;
import java.util.Collection;
=======
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.List;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Clinique.
 */
@Service
@Transactional
public class CliniqueService {
  private final Logger log = LoggerFactory.getLogger(CliniqueService.class);

  private final CliniqueRepository cliniqueRepository;

  public CliniqueService(CliniqueRepository cliniqueRepository) {
    this.cliniqueRepository=cliniqueRepository;
  }

<<<<<<< HEAD
   public Collection<CliniqueDTO> findCliniqueByName(String name) {
    log.debug("Request to get All Cliniques");
    Collection<Clinique> result= cliniqueRepository.findCliniquesByName(name);
    return CliniqueFactory.cliniqueToCliniqueDTOs(result);
   }
=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
  /**
   * Save a cliniqueDTO.
   *
   * @param cliniqueDTO
   * @return the persisted entity
   */
  public CliniqueDTO save(CliniqueDTO cliniqueDTO) {
    log.debug("Request to save Clinique: {}",cliniqueDTO);
    Clinique clinique = CliniqueFactory.cliniqueDTOToClinique(cliniqueDTO);
    clinique = cliniqueRepository.save(clinique);
    CliniqueDTO resultDTO = CliniqueFactory.cliniqueToCliniqueDTO(clinique);
    return resultDTO;
  }

  /**
   * Update a cliniqueDTO.
   *
   * @param cliniqueDTO
   * @return the updated entity
   */
<<<<<<< HEAD
 public CliniqueDTO update(CliniqueDTO cliniqueDTO) {
    log.debug("Request to update Clinique: {}",cliniqueDTO);
    Optional<Clinique> cliniqueOptional = cliniqueRepository.findById(cliniqueDTO.getId_clinique());
    Clinique inBase = cliniqueOptional.orElseThrow(() -> new IllegalArgumentException("clinique.NotFound"));
=======
  public CliniqueDTO update(CliniqueDTO cliniqueDTO) {
    log.debug("Request to update Clinique: {}",cliniqueDTO);
      Optional<Clinique> inBase= cliniqueRepository.findById(cliniqueDTO.getId_clinique());
    Preconditions.checkArgument(inBase != null, "clinique.NotFound");
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    Clinique clinique = CliniqueFactory.cliniqueDTOToClinique(cliniqueDTO);
    clinique = cliniqueRepository.save(clinique);
    CliniqueDTO resultDTO = CliniqueFactory.cliniqueToCliniqueDTO(clinique);
    return resultDTO;
<<<<<<< HEAD
}
=======
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one cliniqueDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
<<<<<<< HEAD
@Transactional(readOnly = true)
public CliniqueDTO findOne(Integer id_clinique) {
    log.debug("Request to get Clinique: {}", id_clinique);
    Optional<Clinique> cliniqueOptional = cliniqueRepository.findById(id_clinique);
    Clinique clinique = cliniqueOptional.orElse(null);
    return clinique != null ? CliniqueFactory.cliniqueToCliniqueDTO(clinique) : null;
}

=======
 

  @Transactional(
      readOnly = true
  )
  public CliniqueDTO findOne(Integer id) {
    log.debug("Request to get Clinique: {}",id);
      Optional<Clinique> cliniqueOptional= cliniqueRepository.findById(id);
       Clinique clinique = cliniqueOptional.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    CliniqueDTO dto = CliniqueFactory.cliniqueToCliniqueDTO(clinique);
    return dto;
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one clinique by id.
   *
   * @param id the id of the entity
   * @return the entity
<<<<<<< HEAD
   */
@Transactional(readOnly = true)
public Clinique findClinique(Integer id_clinique) {
    log.debug("Request to get Clinique: {}", id_clinique);
    Optional<Clinique> cliniqueOptional = cliniqueRepository.findById(id_clinique);
    return cliniqueOptional.orElse(null);
}
=======
*/
  @Transactional(
      readOnly = true
  )
  public Clinique findClinique(Integer id) {
    log.debug("Request to get Clinique: {}",id);
    Optional<Clinique> cliniqueOptional= cliniqueRepository.findById(id);
    return cliniqueOptional.orElse(null);
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get all the cliniques.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<CliniqueDTO> findAll() {
    log.debug("Request to get All Cliniques");
    Collection<Clinique> result= cliniqueRepository.findAll();
    return CliniqueFactory.cliniqueToCliniqueDTOs(result);
  }

  /**
   * Delete clinique by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Clinique: {}",id);
    cliniqueRepository.deleteById(id);
  }
  
<<<<<<< HEAD
   
   
=======
     @Transactional(readOnly = true)
    public Collection<CliniqueDTO> findByCliniqueName(String name) {
        log.debug("Request to find users by clinique name: {}", name);
        Collection<Clinique> cliniques = cliniqueRepository.findByCliniqueName(name);
        return CliniqueFactory.cliniqueToCliniqueDTOs(cliniques);
    }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
}

