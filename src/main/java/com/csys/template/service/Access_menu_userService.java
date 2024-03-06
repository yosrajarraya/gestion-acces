package com.csys.template.service;

import com.csys.template.domain.Access_menu_user;
import com.csys.template.dto.Access_menu_userDTO;
import com.csys.template.factory.Access_menu_userFactory;
import com.csys.template.repository.Access_menu_userRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Access_menu_user.
 */
@Service
@Transactional
public class Access_menu_userService {
  private final Logger log = LoggerFactory.getLogger(Access_menu_userService.class);

  private final Access_menu_userRepository access_menu_userRepository;

  public Access_menu_userService(Access_menu_userRepository access_menu_userRepository) {
    this.access_menu_userRepository=access_menu_userRepository;
  }

  /**
   * Save a access_menu_userDTO.
   *
   * @param access_menu_userDTO
   * @return the persisted entity
   */
  public Access_menu_userDTO save(Access_menu_userDTO access_menu_userDTO) {
    log.debug("Request to save Access_menu_user: {}",access_menu_userDTO);
    Access_menu_user access_menu_user = Access_menu_userFactory.access_menu_userDTOToAccess_menu_user(access_menu_userDTO);
    access_menu_user = access_menu_userRepository.save(access_menu_user);
    Access_menu_userDTO resultDTO = Access_menu_userFactory.access_menu_userToAccess_menu_userDTO(access_menu_user);
    return resultDTO;
  }

  /**
   * Update a access_menu_userDTO.
   *
   * @param access_menu_userDTO
   * @return the updated entity
   */
  public Access_menu_userDTO update(Access_menu_userDTO access_menu_userDTO) {
    log.debug("Request to update Access_menu_user: {}",access_menu_userDTO);
      Optional<Access_menu_user> inBase= access_menu_userRepository.findById(access_menu_userDTO.getId());
    Preconditions.checkArgument(inBase != null, "access_menu_user.NotFound");
    Access_menu_user access_menu_user = Access_menu_userFactory.access_menu_userDTOToAccess_menu_user(access_menu_userDTO);
    access_menu_user = access_menu_userRepository.save(access_menu_user);
    Access_menu_userDTO resultDTO = Access_menu_userFactory.access_menu_userToAccess_menu_userDTO(access_menu_user);
    return resultDTO;
  }

  /**
   * Get one access_menu_userDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public Access_menu_userDTO findOne(Integer id) {
    log.debug("Request to get Access_menu_user: {}",id);
      Optional<Access_menu_user> access_menu_user= access_menu_userRepository.findById(id);
      Access_menu_user access_menu_user_op = access_menu_user.orElseThrow(() -> new IllegalArgumentException("Form not found"));
    Access_menu_userDTO dto = Access_menu_userFactory.access_menu_userToAccess_menu_userDTO(access_menu_user_op);
    return dto;
  }

  /**
   * Get one access_menu_user by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Access_menu_user findAccess_menu_user(Integer id) {
    log.debug("Request to get Access_menu_user: {}",id);
      Optional<Access_menu_user> access_menu_user= access_menu_userRepository.findById(id);
    return access_menu_user.orElse(null);
  }
    
  /**
   * Get all the access_menu_users.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Access_menu_userDTO> findAll() {
    log.debug("Request to get All Access_menu_users");
    Collection<Access_menu_user> result= access_menu_userRepository.findAll();
    return Access_menu_userFactory.access_menu_userToAccess_menu_userDTOs(result);
  }

  /**
   * Delete access_menu_user by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Access_menu_user: {}",id);
    access_menu_userRepository.deleteById(id);
  }
}

