package com.csys.template.service;

import com.csys.template.domain.Group_user;
import com.csys.template.dto.Group_userDTO;
import com.csys.template.factory.Group_userFactory;
import com.csys.template.repository.Group_userRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Group_user.
 */
@Service
@Transactional
public class Group_userService {
  private final Logger log = LoggerFactory.getLogger(Group_userService.class);

  private final Group_userRepository group_userRepository;

  public Group_userService(Group_userRepository group_userRepository) {
    this.group_userRepository=group_userRepository;
  }

  /**
   * Save a group_userDTO.
   *
   * @param group_userDTO
   * @return the persisted entity
   */
  public Group_userDTO save(Group_userDTO group_userDTO) {
    log.debug("Request to save Group_user: {}",group_userDTO);
    Group_user group_user = Group_userFactory.group_userDTOToGroup_user(group_userDTO);
    group_user = group_userRepository.save(group_user);
    Group_userDTO resultDTO = Group_userFactory.group_userToGroup_userDTO(group_user);
    return resultDTO;
  }

  /**
   * Update a group_userDTO.
   *
   * @param group_userDTO
   * @return the updated entity
   */
  public Group_userDTO update(Group_userDTO group_userDTO) {
    log.debug("Request to update Group_user: {}",group_userDTO);
      Optional<Group_user> inBase= group_userRepository.findById(group_userDTO.getId_group());
    Preconditions.checkArgument(inBase != null, "group_user.NotFound");
    Group_user group_user = Group_userFactory.group_userDTOToGroup_user(group_userDTO);
    group_user = group_userRepository.save(group_user);
    Group_userDTO resultDTO = Group_userFactory.group_userToGroup_userDTO(group_user);
    return resultDTO;
  }

  /**
   * Get one group_userDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  
  
  @Transactional(
      readOnly = true
  )
  public Group_userDTO findOne(Integer id) {
    log.debug("Request to get Group_user: {}",id);
      Optional<Group_user> group_userOptional= group_userRepository.findById(id);
      Group_user group_user = group_userOptional.orElseThrow(() -> new IllegalArgumentException("Group user not found"));
    Group_userDTO dto = Group_userFactory.group_userToGroup_userDTO(group_user);
    return dto;
  }

  /**
   * Get one group_user by id.
   *
   * @param id the id of the entity
   * @return the entity
   */

  @Transactional(
      readOnly = true
  )
  public Group_user findGroup_user(Integer id) {
    log.debug("Request to get Group_user: {}",id);
      Optional<Group_user> group_userOptional= group_userRepository.findById(id);
    return group_userOptional.orElse(null);
  }

  /**
   * Get all the group_users.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<Group_userDTO> findAll() {
    log.debug("Request to get All Group_users");
    Collection<Group_user> result= group_userRepository.findAll();
    return Group_userFactory.group_userToGroup_userDTOs(result);
  }

  /**
   * Delete group_user by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Group_user: {}",id);
    group_userRepository.deleteById(id);
  }
}

