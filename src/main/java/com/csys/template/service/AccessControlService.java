package com.csys.template.service;

import com.csys.template.domain.AccessControl;
<<<<<<< HEAD
import com.csys.template.domain.Utilisateur;
=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import com.csys.template.dto.AccessControlDTO;
import com.csys.template.factory.AccessControlFactory;
import com.csys.template.repository.AccessControlRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
=======
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing AccessControl.
 */
@Service
@Transactional
public class AccessControlService {
  private final Logger log = LoggerFactory.getLogger(AccessControlService.class);
<<<<<<< HEAD
  
@Autowired
private final AccessControlRepository accesscontrolRepository;

@Autowired
=======

  private final AccessControlRepository accesscontrolRepository;

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
  public AccessControlService(AccessControlRepository accesscontrolRepository) {
    this.accesscontrolRepository=accesscontrolRepository;
  }

  /**
   * Save a accesscontrolDTO.
   *
   * @param accesscontrolDTO
   * @return the persisted entity
   */
  public AccessControlDTO save(AccessControlDTO accesscontrolDTO) {
    log.debug("Request to save AccessControl: {}",accesscontrolDTO);
    AccessControl accesscontrol = AccessControlFactory.accesscontrolDTOToAccessControl(accesscontrolDTO);
    accesscontrol = accesscontrolRepository.save(accesscontrol);
    AccessControlDTO resultDTO = AccessControlFactory.accesscontrolToAccessControlDTO(accesscontrol);
    return resultDTO;
  }

  /**
   * Update a accesscontrolDTO.
   *
   * @param accesscontrolDTO
   * @return the updated entity
   */
<<<<<<< HEAD
  public AccessControlDTO update(AccessControlDTO accesscontrolDTO) {
    log.debug("Request to update AccessControl: {}",accesscontrolDTO);
      Optional<AccessControl> inBase= accesscontrolRepository.findById(accesscontrolDTO.getId());
    Preconditions.checkArgument(inBase != null, "accesscontrol.NotFound");
    AccessControl accesscontrol = AccessControlFactory.accesscontrolDTOToAccessControl(accesscontrolDTO);
    accesscontrol = accesscontrolRepository.save(accesscontrol);
    AccessControlDTO resultDTO = AccessControlFactory.accesscontrolToAccessControlDTO(accesscontrol);
    return resultDTO;
  }
=======
 @Transactional
public AccessControlDTO update(AccessControlDTO accessControlDTO) {
    log.debug("Request to update AccessControl: {}",accessControlDTO);
    Optional<AccessControl> accessControlOptional = accesscontrolRepository.findById(accessControlDTO.getId());
    AccessControl inBase = accessControlOptional.orElseThrow(() -> new IllegalArgumentException("accessControl.NotFound"));
    AccessControl accessControl = AccessControlFactory.accesscontrolDTOToAccessControl(accessControlDTO);
    accessControl = accesscontrolRepository.save(accessControl);
    AccessControlDTO resultDTO = AccessControlFactory.accesscontrolToAccessControlDTO(accessControl);
    return resultDTO;
}

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one accesscontrolDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
<<<<<<< HEAD
  @Transactional(
      readOnly = true
  )
  public AccessControlDTO findOne(Long id) {
    log.debug("Request to get AccessControl: {}",id);
      Optional<AccessControl> accesscontrols= accesscontrolRepository.findById(id);
     AccessControl accesscontrol = accesscontrols.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    AccessControlDTO dto = AccessControlFactory.accesscontrolToAccessControlDTO(accesscontrol);
    return dto;
  }
=======
@Transactional(readOnly = true)
public AccessControlDTO findOne(Integer id) {
    log.debug("Request to get AccessControl: {}",id);
    Optional<AccessControl> accessControlOptional = accesscontrolRepository.findById(id);
    AccessControl accessControl = accessControlOptional.orElse(null);
    return accessControl != null ? AccessControlFactory.accesscontrolToAccessControlDTO(accessControl) : null;
}
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one accesscontrol by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
<<<<<<< HEAD
  @Transactional(
      readOnly = true
  )
  public AccessControl findAccessControl(Long id) {
    log.debug("Request to get AccessControl: {}",id);
      Optional<AccessControl> accesscontrol= accesscontrolRepository.findById(id);
    return accesscontrol.orElse(null);
  }
=======
@Transactional(readOnly = true)
public AccessControl findAccessControl(Integer id) {
    log.debug("Request to get AccessControl: {}",id);
    Optional<AccessControl> accessControlOptional = accesscontrolRepository.findById(id);
    return accessControlOptional.orElse(null);
}
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get all the accesscontrols.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<AccessControlDTO> findAll() {
    log.debug("Request to get All AccessControls");
    Collection<AccessControl> result= accesscontrolRepository.findAll();
    return AccessControlFactory.accesscontrolToAccessControlDTOs(result);
  }

  /**
   * Delete accesscontrol by id.
   *
   * @param id the id of the entity
   */
<<<<<<< HEAD
  public void delete(Long id) {
    log.debug("Request to delete AccessControl: {}",id);
    accesscontrolRepository.deleteById(id);
  }
  

}
=======
  public void delete(Integer id) {
    log.debug("Request to delete AccessControl: {}",id);
    accesscontrolRepository.deleteById(id);
  }
}

>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
