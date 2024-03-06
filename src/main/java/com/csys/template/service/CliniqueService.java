package com.csys.template.service;

import com.csys.template.domain.Clinique;
import com.csys.template.dto.CliniqueDTO;
import com.csys.template.factory.CliniqueFactory;
import com.csys.template.repository.CliniqueRepository;
import java.lang.Integer;
import java.util.Collection;
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

   public Collection<CliniqueDTO> findCliniqueByName(String name) {
    log.debug("Request to get All Cliniques");
    Collection<Clinique> result= cliniqueRepository.findCliniquesByName(name);
    return CliniqueFactory.cliniqueToCliniqueDTOs(result);
   }
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
 public CliniqueDTO update(CliniqueDTO cliniqueDTO) {
    log.debug("Request to update Clinique: {}",cliniqueDTO);
    Optional<Clinique> cliniqueOptional = cliniqueRepository.findById(cliniqueDTO.getId_clinique());
    Clinique inBase = cliniqueOptional.orElseThrow(() -> new IllegalArgumentException("clinique.NotFound"));
    Clinique clinique = CliniqueFactory.cliniqueDTOToClinique(cliniqueDTO);
    clinique = cliniqueRepository.save(clinique);
    CliniqueDTO resultDTO = CliniqueFactory.cliniqueToCliniqueDTO(clinique);
    return resultDTO;
}

  /**
   * Get one cliniqueDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
@Transactional(readOnly = true)
public CliniqueDTO findOne(Integer id_clinique) {
    log.debug("Request to get Clinique: {}", id_clinique);
    Optional<Clinique> cliniqueOptional = cliniqueRepository.findById(id_clinique);
    Clinique clinique = cliniqueOptional.orElse(null);
    return clinique != null ? CliniqueFactory.cliniqueToCliniqueDTO(clinique) : null;
}


  /**
   * Get one clinique by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
@Transactional(readOnly = true)
public Clinique findClinique(Integer id_clinique) {
    log.debug("Request to get Clinique: {}", id_clinique);
    Optional<Clinique> cliniqueOptional = cliniqueRepository.findById(id_clinique);
    return cliniqueOptional.orElse(null);
}

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
  
   
   
}

