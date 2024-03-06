package com.csys.template.web.rest;

import com.csys.template.dto.Group_userDTO;
import com.csys.template.service.Group_userService;
import com.csys.template.util.RestPreconditions;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing Group_user.
 */
@RestController
@RequestMapping("/api")
public class Group_userResource {
  private static final String ENTITY_NAME = "group_user";

  private final Group_userService group_userService;

  private final Logger log = LoggerFactory.getLogger(Group_userService.class);

  public Group_userResource(Group_userService group_userService) {
    this.group_userService=group_userService;
  }

  /**
   * POST  /group_users : Create a new group_user.
   *
   * @param group_userDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new group_user, or with status 400 (Bad Request) if the group_user has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/group_users")
  public ResponseEntity<Group_userDTO> createGroup_user(@Valid @RequestBody Group_userDTO group_userDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Group_user : {}", group_userDTO);
    if ( group_userDTO.getId_group() != null) {
      bindingResult.addError( new FieldError("Group_userDTO","id_group","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Group_userDTO result = group_userService.save(group_userDTO);
    return ResponseEntity.created( new URI("/api/group_users/"+ result.getId_group())).body(result);
  }

  /**
   * PUT  /group_users : Updates an existing group_user.
   *
   * @param id
   * @param group_userDTO the group_user to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated group_user,
   * or with status 400 (Bad Request) if the group_user is not valid,
   * or with status 500 (Internal Server Error) if the group_user couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/group_users/{id}")
  public ResponseEntity<Group_userDTO> updateGroup_user(@PathVariable Integer id, @Valid @RequestBody Group_userDTO group_userDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Group_user: {}",id);
    group_userDTO.setId_group(id);
    Group_userDTO result =group_userService.update(group_userDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /group_users/{id} : get the "id" group_user.
   *
   * @param id the id of the group_user to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of group_user, or with status 404 (Not Found)
   */
  @GetMapping("/group_users/{id}")
  public ResponseEntity<Group_userDTO> getGroup_user(@PathVariable Integer id) {
    log.debug("Request to get Group_user: {}",id);
    Group_userDTO dto = group_userService.findOne(id);
    RestPreconditions.checkFound(dto, "group_user.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /group_users : get all the group_users.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of group_users in body
   */
  @GetMapping("/group_users")
  public Collection<Group_userDTO> getAllGroup_users() {
    log.debug("Request to get all  Group_users : {}");
    return group_userService.findAll();
  }

  /**
   * DELETE  /group_users/{id} : delete the "id" group_user.
   *
   * @param id the id of the group_user to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/group_users/{id}")
  public ResponseEntity<Void> deleteGroup_user(@PathVariable Integer id) {
    log.debug("Request to delete Group_user: {}",id);
    group_userService.delete(id);
    return ResponseEntity.ok().build();
  }
}

