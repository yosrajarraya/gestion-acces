package com.csys.template.service;

import com.csys.template.domain.Access_button_grp;
import com.csys.template.dto.Access_button_grpDTO;
import com.csys.template.factory.Access_button_grpFactory;
import com.csys.template.repository.Access_button_grpRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Access_button_grp.
 */
@Service
@Transactional
public class Access_button_grpService {
  private final Logger log = LoggerFactory.getLogger(Access_button_grpService.class);

  private final Access_button_grpRepository access_button_grpRepository;

  public Access_button_grpService(Access_button_grpRepository access_button_grpRepository) {
    this.access_button_grpRepository=access_button_grpRepository;
  }

  /**
   * Save a access_button_grpDTO.
   *
   * @param access_button_grpDTO
   * @return the persisted entity
   */
  public Access_button_grpDTO save(Access_button_grpDTO access_button_grpDTO) {
    log.debug("Request to save Access_button_grp: {}",access_button_grpDTO);
    Access_button_grp access_button_grp = Access_button_grpFactory.access_button_grpDTOToAccess_button_grp(access_button_grpDTO);
    access_button_grp = access_button_grpRepository.save(access_button_grp);
    Access_button_grpDTO resultDTO = Access_button_grpFactory.access_button_grpToAccess_button_grpDTO(access_button_grp);
    return resultDTO;
  }

  /**
   * Update a access_button_grpDTO.
   *
   * @param access_button_grpDTO
   * @return the updated entity
   */
  public Access_button_grpDTO update(Access_button_grpDTO access_button_grpDTO) {
    log.debug("Request to update Access_button_grp: {}",access_button_grpDTO);
      Optional<Access_button_grp> inBase= access_button_grpRepository.findById(access_button_grpDTO.getId());
    Preconditions.checkArgument(inBase != null, "access_button_grp.NotFound");
    Access_button_grp access_button_grp = Access_button_grpFactory.access_button_grpDTOToAccess_button_grp(access_button_grpDTO);
    access_button_grp = access_button_grpRepository.save(access_button_grp);
    Access_button_grpDTO resultDTO = Access_button_grpFactory.access_button_grpToAccess_button_grpDTO(access_button_grp);
    return resultDTO;
  }

  /**
   * Get one access_button_grpDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */


  @Transactional(
      readOnly = true
  )
  public Access_button_grpDTO findOne(Integer id) {
    log.debug("Request to get Access_button_grp: {}",id);
      Optional<Access_button_grp> access_button_grpOptional= access_button_grpRepository.findById(id);
              Access_button_grp access_button_grp = access_button_grpOptional.orElseThrow(() -> new IllegalArgumentException("Module not found"));
    Access_button_grpDTO dto = Access_button_grpFactory.access_button_grpToAccess_button_grpDTO(access_button_grp);
    return dto;
  }

  /**
   * Get one access_button_grp by id.
   *
   * @param id the id of the entity
   * @return the entity
   */

  @Transactional(
      readOnly = true
  )
  public Access_button_grp findAccess_button_grp(Integer id) {
    log.debug("Request to get Access_button_grp: {}",id);
      Optional<Access_button_grp> access_button_grpOptional= access_button_grpRepository.findById(id);
    return access_button_grpOptional.orElse(null);
  }

  /**
   * Get all the access_button_grps.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Access_button_grpDTO> findAll() {
    log.debug("Request to get All Access_button_grps");
    Collection<Access_button_grp> result= access_button_grpRepository.findAll();
    return Access_button_grpFactory.access_button_grpToAccess_button_grpDTOs(result);
  }

  /**
   * Delete access_button_grp by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Access_button_grp: {}",id);
    access_button_grpRepository.deleteById(id);
  }
}

