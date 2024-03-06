package com.csys.template.service;

import com.csys.template.domain.Access_module_user;
import com.csys.template.dto.Access_module_userDTO;
import com.csys.template.factory.Access_module_userFactory;
import com.csys.template.repository.Access_module_userRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Access_module_user.
 */
@Service
@Transactional
public class Access_module_userService {
  private final Logger log = LoggerFactory.getLogger(Access_module_userService.class);

  private final Access_module_userRepository access_module_userRepository;

  public Access_module_userService(Access_module_userRepository access_module_userRepository) {
    this.access_module_userRepository=access_module_userRepository;
  }

  /**
   * Save a access_module_userDTO.
   *
   * @param access_module_userDTO
   * @return the persisted entity
   */
  public Access_module_userDTO save(Access_module_userDTO access_module_userDTO) {
    log.debug("Request to save Access_module_user: {}",access_module_userDTO);
    Access_module_user access_module_user = Access_module_userFactory.access_module_userDTOToAccess_module_user(access_module_userDTO);
    access_module_user = access_module_userRepository.save(access_module_user);
    Access_module_userDTO resultDTO = Access_module_userFactory.access_module_userToAccess_module_userDTO(access_module_user);
    return resultDTO;
  }

  /**
   * Update a access_module_userDTO.
   *
   * @param access_module_userDTO
   * @return the updated entity
   */
  public Access_module_userDTO update(Access_module_userDTO access_module_userDTO) {
    log.debug("Request to update Access_module_user: {}",access_module_userDTO);
      Optional<Access_module_user> inBase= access_module_userRepository.findById(access_module_userDTO.getId());
    Preconditions.checkArgument(inBase != null, "access_module_user.NotFound");
    Access_module_user access_module_user = Access_module_userFactory.access_module_userDTOToAccess_module_user(access_module_userDTO);
    access_module_user = access_module_userRepository.save(access_module_user);
    Access_module_userDTO resultDTO = Access_module_userFactory.access_module_userToAccess_module_userDTO(access_module_user);
    return resultDTO;
  }

  /**
   * Get one access_module_userDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(readOnly = true)
  public Access_module_userDTO findOne(Integer id) {
    log.debug("Request to get Access_module_user: {}",id);
      Optional<Access_module_user> access_module_userOptional= access_module_userRepository.findById(id);
       Access_module_user access_module_user = access_module_userOptional.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    Access_module_userDTO dto = Access_module_userFactory.access_module_userToAccess_module_userDTO(access_module_user);
    return dto;
  }

  /**
   * Get one access_module_user by id.
   *
   * @param id the id of the entity
   * @return the entity
   */

  @Transactional(
      readOnly = true
  )
  public Access_module_user findAccess_module_user(Integer id) {
    log.debug("Request to get Access_module_user: {}",id);
      Optional<Access_module_user> access_module_userOptional= access_module_userRepository.findById(id);
    return access_module_userOptional.orElse(null);
  }

  /**
   * Get all the access_module_users.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Access_module_userDTO> findAll() {
    log.debug("Request to get All Access_module_users");
    Collection<Access_module_user> result= access_module_userRepository.findAll();
    return Access_module_userFactory.access_module_userToAccess_module_userDTOs(result);
  }

  /**
   * Delete access_module_user by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Access_module_user: {}",id);
    access_module_userRepository.deleteById(id);
  }
}

