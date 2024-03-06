package com.csys.template.service;

import com.csys.template.domain.Utilisateur;
import com.csys.template.dto.UtilisateurDTO;
import com.csys.template.factory.UtilisateurFactory;
import com.csys.template.repository.UtilisateurRepository;
<<<<<<< HEAD
=======
import com.google.common.base.Preconditions;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Utilisateur.
 */
@Service
@Transactional
public class UtilisateurService {
  private final Logger log = LoggerFactory.getLogger(UtilisateurService.class);

  private final UtilisateurRepository utilisateurRepository;

  public UtilisateurService(UtilisateurRepository utilisateurRepository) {
    this.utilisateurRepository=utilisateurRepository;
  }

  /**
   * Save a utilisateurDTO.
   *
   * @param utilisateurDTO
   * @return the persisted entity
   */
  public UtilisateurDTO save(UtilisateurDTO utilisateurDTO) {
    log.debug("Request to save Utilisateur: {}",utilisateurDTO);
    Utilisateur utilisateur = UtilisateurFactory.utilisateurDTOToUtilisateur(utilisateurDTO);
    utilisateur = utilisateurRepository.save(utilisateur);
    UtilisateurDTO resultDTO = UtilisateurFactory.utilisateurToUtilisateurDTO(utilisateur);
    return resultDTO;
  }

  /**
   * Update a utilisateurDTO.
   *
   * @param utilisateurDTO
   * @return the updated entity
   */
<<<<<<< HEAD
@Transactional
public UtilisateurDTO update(UtilisateurDTO utilisateurDTO) {
    log.debug("Request to update Utilisateur: {}",utilisateurDTO);
    Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(utilisateurDTO.getIdUser());
    Utilisateur inBase = utilisateurOptional.orElseThrow(() -> new IllegalArgumentException("utilisateur.NotFound"));
=======
  public UtilisateurDTO update(UtilisateurDTO utilisateurDTO) {
    log.debug("Request to update Utilisateur: {}",utilisateurDTO);
      Optional<Utilisateur> inBase= utilisateurRepository.findById(utilisateurDTO.getId_user());
    Preconditions.checkArgument(inBase != null, "utilisateur.NotFound");
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    Utilisateur utilisateur = UtilisateurFactory.utilisateurDTOToUtilisateur(utilisateurDTO);
    utilisateur = utilisateurRepository.save(utilisateur);
    UtilisateurDTO resultDTO = UtilisateurFactory.utilisateurToUtilisateurDTO(utilisateur);
    return resultDTO;
<<<<<<< HEAD
}

=======
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one utilisateurDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
<<<<<<< HEAD
@Transactional(readOnly = true)
public UtilisateurDTO findOne(Integer id) {
    log.debug("Request to get Utilisateur: {}",id);
    Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(id);
    Utilisateur utilisateur = utilisateurOptional.orElse(null);
    return utilisateur != null ? UtilisateurFactory.utilisateurToUtilisateurDTO(utilisateur) : null;
}

=======
  
 
  @Transactional(
      readOnly = true
  )
  public UtilisateurDTO findOne(Integer id) {
    log.debug("Request to get Utilisateur: {}",id);
      Optional<Utilisateur> utilisateurOptional= utilisateurRepository.findById(id);
      Utilisateur utilisateur = utilisateurOptional.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    UtilisateurDTO dto = UtilisateurFactory.utilisateurToUtilisateurDTO(utilisateur);
    return dto;
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one utilisateur by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
<<<<<<< HEAD
  @Transactional(readOnly = true)
public Utilisateur findUtilisateur(Integer id) {
    log.debug("Request to get Utilisateur: {}", id);
    Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(id);
    return utilisateurOptional.orElse(null);
}

=======
  @Transactional(
      readOnly = true
  )
  public Utilisateur findUtilisateur(Integer id) {
    log.debug("Request to get Utilisateur: {}",id);
      Optional<Utilisateur> utilisateurOptional= utilisateurRepository.findById(id);
    return utilisateurOptional.orElse(null);
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
  /**
   * Get all the utilisateurs.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<UtilisateurDTO> findAll() {
    log.debug("Request to get All Utilisateurs");
    Collection<Utilisateur> result= utilisateurRepository.findAll();
    return UtilisateurFactory.utilisateurToUtilisateurDTOs(result);
  }

  /**
   * Delete utilisateur by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Utilisateur: {}",id);
    utilisateurRepository.deleteById(id);
  }
}

