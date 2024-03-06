package com.csys.template.service;

import com.csys.template.domain.Access_menu_grp;
import com.csys.template.dto.Access_menu_grpDTO;
import com.csys.template.factory.Access_menu_grpFactory;
import com.csys.template.repository.Access_menu_grpRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Access_menu_grp.
 */
@Service
@Transactional
public class Access_menu_grpService {
  private final Logger log = LoggerFactory.getLogger(Access_menu_grpService.class);

  private final Access_menu_grpRepository access_menu_grpRepository;

  public Access_menu_grpService(Access_menu_grpRepository access_menu_grpRepository) {
    this.access_menu_grpRepository=access_menu_grpRepository;
  }

  /**
   * Save a access_menu_grpDTO.
   *
   * @param access_menu_grpDTO
   * @return the persisted entity
   */
  public Access_menu_grpDTO save(Access_menu_grpDTO access_menu_grpDTO) {
    log.debug("Request to save Access_menu_grp: {}",access_menu_grpDTO);
    Access_menu_grp access_menu_grp = Access_menu_grpFactory.access_menu_grpDTOToAccess_menu_grp(access_menu_grpDTO);
    access_menu_grp = access_menu_grpRepository.save(access_menu_grp);
    Access_menu_grpDTO resultDTO = Access_menu_grpFactory.access_menu_grpToAccess_menu_grpDTO(access_menu_grp);
    return resultDTO;
  }

  /**
   * Update a access_menu_grpDTO.
   *
   * @param access_menu_grpDTO
   * @return the updated entity
   */
  public Access_menu_grpDTO update(Access_menu_grpDTO access_menu_grpDTO) {
    log.debug("Request to update Access_menu_grp: {}",access_menu_grpDTO);
      Optional<Access_menu_grp> inBase= access_menu_grpRepository.findById(access_menu_grpDTO.getId());
    Preconditions.checkArgument(inBase != null, "access_menu_grp.NotFound");
    Access_menu_grp access_menu_grp = Access_menu_grpFactory.access_menu_grpDTOToAccess_menu_grp(access_menu_grpDTO);
    access_menu_grp = access_menu_grpRepository.save(access_menu_grp);
    Access_menu_grpDTO resultDTO = Access_menu_grpFactory.access_menu_grpToAccess_menu_grpDTO(access_menu_grp);
    return resultDTO;
  }

  /**
   * Get one access_menu_grpDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public Access_menu_grpDTO findOne(Integer id) {
    log.debug("Request to get Access_menu_grp: {}",id);
      Optional<Access_menu_grp> access_menu_grp= access_menu_grpRepository.findById(id);
       Access_menu_grp access_menu_grp_op = access_menu_grp.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    Access_menu_grpDTO dto = Access_menu_grpFactory.access_menu_grpToAccess_menu_grpDTO(access_menu_grp_op);
    return dto;
  }

  /**
   * Get one access_menu_grp by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Access_menu_grp findAccess_menu_grp(Integer id) {
    log.debug("Request to get Access_menu_grp: {}",id);
      Optional<Access_menu_grp> access_menu_grp= access_menu_grpRepository.findById(id);
    return access_menu_grp.orElse(null);
  }

  /**
   * Get all the access_menu_grps.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Access_menu_grpDTO> findAll() {
    log.debug("Request to get All Access_menu_grps");
    Collection<Access_menu_grp> result= access_menu_grpRepository.findAll();
    return Access_menu_grpFactory.access_menu_grpToAccess_menu_grpDTOs(result);
  }

  /**
   * Delete access_menu_grp by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Access_menu_grp: {}",id);
    access_menu_grpRepository.deleteById(id);
  }
}

