package com.csys.template.service;

import com.csys.template.domain.Access_module_grp;
import com.csys.template.dto.Access_module_grpDTO;
import com.csys.template.factory.Access_module_grpFactory;
import com.csys.template.repository.Access_module_grpRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Access_module_grp.
 */
@Service
@Transactional
public class Access_module_grpService {
  private final Logger log = LoggerFactory.getLogger(Access_module_grpService.class);

  private final Access_module_grpRepository access_module_grpRepository;

  public Access_module_grpService(Access_module_grpRepository access_module_grpRepository) {
    this.access_module_grpRepository=access_module_grpRepository;
  }

  /**
   * Save a access_module_grpDTO.
   *
   * @param access_module_grpDTO
   * @return the persisted entity
   */
  public Access_module_grpDTO save(Access_module_grpDTO access_module_grpDTO) {
    log.debug("Request to save Access_module_grp: {}",access_module_grpDTO);
    Access_module_grp access_module_grp = Access_module_grpFactory.access_module_grpDTOToAccess_module_grp(access_module_grpDTO);
    access_module_grp = access_module_grpRepository.save(access_module_grp);
    Access_module_grpDTO resultDTO = Access_module_grpFactory.access_module_grpToAccess_module_grpDTO(access_module_grp);
    return resultDTO;
  }

  /**
   * Update a access_module_grpDTO.
   *
   * @param access_module_grpDTO
   * @return the updated entity
   */
  public Access_module_grpDTO update(Access_module_grpDTO access_module_grpDTO) {
    log.debug("Request to update Access_module_grp: {}",access_module_grpDTO);
      Optional<Access_module_grp> inBase= access_module_grpRepository.findById(access_module_grpDTO.getId());
    Preconditions.checkArgument(inBase != null, "access_module_grp.NotFound");
    Access_module_grp access_module_grp = Access_module_grpFactory.access_module_grpDTOToAccess_module_grp(access_module_grpDTO);
    access_module_grp = access_module_grpRepository.save(access_module_grp);
    Access_module_grpDTO resultDTO = Access_module_grpFactory.access_module_grpToAccess_module_grpDTO(access_module_grp);
    return resultDTO;
  }

  /**
   * Get one access_module_grpDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */

  @Transactional(
      readOnly = true
  )
  public Access_module_grpDTO findOne(Integer id) {
    log.debug("Request to get Access_module_grp: {}",id);
    Optional<Access_module_grp> access_module_grpOptional= access_module_grpRepository.findById(id);
    Access_module_grp access_module_grp = access_module_grpOptional.orElseThrow(() -> new IllegalArgumentException("Access module grp not found"));
    Access_module_grpDTO dto = Access_module_grpFactory.access_module_grpToAccess_module_grpDTO(access_module_grp);
    return dto;
  }

  /**
   * Get one access_module_grp by id.
   *
   * @param id the id of the entity
   * @return the entity
   */

  @Transactional(
      readOnly = true
  )
  public Access_module_grp findAccess_module_grp(Integer id) {
    log.debug("Request to get Access_module_grp: {}",id);
      Optional<Access_module_grp> access_module_grpOptional= access_module_grpRepository.findById(id);
    return access_module_grpOptional.orElse(null);
  }

  /**
   * Get all the access_module_grps.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Access_module_grpDTO> findAll() {
    log.debug("Request to get All Access_module_grps");
    Collection<Access_module_grp> result= access_module_grpRepository.findAll();
    return Access_module_grpFactory.access_module_grpToAccess_module_grpDTOs(result);
  }

  /**
   * Delete access_module_grp by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Access_module_grp: {}",id);
    access_module_grpRepository.deleteById(id);
  }
}

