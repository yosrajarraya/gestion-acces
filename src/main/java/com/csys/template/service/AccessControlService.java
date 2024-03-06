package com.csys.template.service;

import com.csys.template.domain.AccessControl;
import com.csys.template.dto.AccessControlDTO;
import com.csys.template.factory.AccessControlFactory;
import com.csys.template.repository.AccessControlRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing AccessControl.
 */
@Service
@Transactional
public class AccessControlService {
  private final Logger log = LoggerFactory.getLogger(AccessControlService.class);

  private final AccessControlRepository accesscontrolRepository;

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


  /**
   * Get one accesscontrolDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
@Transactional(readOnly = true)
public AccessControlDTO findOne(Integer id) {
    log.debug("Request to get AccessControl: {}",id);
    Optional<AccessControl> accessControlOptional = accesscontrolRepository.findById(id);
    AccessControl accessControl = accessControlOptional.orElse(null);
    return accessControl != null ? AccessControlFactory.accesscontrolToAccessControlDTO(accessControl) : null;
}

  /**
   * Get one accesscontrol by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
@Transactional(readOnly = true)
public AccessControl findAccessControl(Integer id) {
    log.debug("Request to get AccessControl: {}",id);
    Optional<AccessControl> accessControlOptional = accesscontrolRepository.findById(id);
    return accessControlOptional.orElse(null);
}

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
  public void delete(Integer id) {
    log.debug("Request to delete AccessControl: {}",id);
    accesscontrolRepository.deleteById(id);
  }
}

