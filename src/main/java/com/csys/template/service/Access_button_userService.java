package com.csys.template.service;

import com.csys.template.domain.Access_button_user;
import com.csys.template.dto.Access_button_userDTO;
import com.csys.template.factory.Access_button_userFactory;
import com.csys.template.repository.Access_button_userRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Access_button_user.
 */
@Service
@Transactional
public class Access_button_userService {
  private final Logger log = LoggerFactory.getLogger(Access_button_userService.class);

  private final Access_button_userRepository access_button_userRepository;

  public Access_button_userService(Access_button_userRepository access_button_userRepository) {
    this.access_button_userRepository=access_button_userRepository;
  }

  /**
   * Save a access_button_userDTO.
   *
   * @param access_button_userDTO
   * @return the persisted entity
   */
  public Access_button_userDTO save(Access_button_userDTO access_button_userDTO) {
    log.debug("Request to save Access_button_user: {}",access_button_userDTO);
    Access_button_user access_button_user = Access_button_userFactory.access_button_userDTOToAccess_button_user(access_button_userDTO);
    access_button_user = access_button_userRepository.save(access_button_user);
    Access_button_userDTO resultDTO = Access_button_userFactory.access_button_userToAccess_button_userDTO(access_button_user);
    return resultDTO;
  }

  /**
   * Update a access_button_userDTO.
   *
   * @param access_button_userDTO
   * @return the updated entity
   */
  public Access_button_userDTO update(Access_button_userDTO access_button_userDTO) {
    log.debug("Request to update Access_button_user: {}",access_button_userDTO);
    Optional<Access_button_user> inBase= access_button_userRepository.findById(access_button_userDTO.getId());
    Preconditions.checkArgument(inBase != null, "access_button_user.NotFound");
    Access_button_user access_button_user = Access_button_userFactory.access_button_userDTOToAccess_button_user(access_button_userDTO);
    access_button_user = access_button_userRepository.save(access_button_user);
    Access_button_userDTO resultDTO = Access_button_userFactory.access_button_userToAccess_button_userDTO(access_button_user);
    return resultDTO;
  }

  /**
   * Get one access_button_userDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public Access_button_userDTO findOne(Integer id) {
    log.debug("Request to get Access_button_user: {}",id);
    Optional<Access_button_user> access_button_user= access_button_userRepository.findById(id);
    Access_button_user access_button_user_op = access_button_user.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    Access_button_userDTO dto = Access_button_userFactory.access_button_userToAccess_button_userDTO(access_button_user_op);
    return dto;
  }

  /**
   * Get one access_button_user by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Access_button_user findAccess_button_user(Integer id) {
    log.debug("Request to get Access_button_user: {}",id);
    Optional<Access_button_user> access_button_user= access_button_userRepository.findById(id);
    return access_button_user.orElse(null);
  }

  /**
   * Get all the access_button_users.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Access_button_userDTO> findAll() {
    log.debug("Request to get All Access_button_users");
    Collection<Access_button_user> result= access_button_userRepository.findAll();
    return Access_button_userFactory.access_button_userToAccess_button_userDTOs(result);
  }

  /**
   * Delete access_button_user by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Access_button_user: {}",id);
    access_button_userRepository.deleteById(id);
  }
}

