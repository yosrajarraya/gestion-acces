package com.csys.template.web.rest;

import com.csys.template.dto.Access_menu_userDTO;
import com.csys.template.service.Access_menu_userService;
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
 * REST controller for managing Access_menu_user.
 */
@RestController
@RequestMapping("/api")
public class Access_menu_userResource {
  private static final String ENTITY_NAME = "access_menu_user";

  private final Access_menu_userService access_menu_userService;

  private final Logger log = LoggerFactory.getLogger(Access_menu_userService.class);

  public Access_menu_userResource(Access_menu_userService access_menu_userService) {
    this.access_menu_userService=access_menu_userService;
  }

  /**
   * POST  /access_menu_users : Create a new access_menu_user.
   *
   * @param access_menu_userDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new access_menu_user, or with status 400 (Bad Request) if the access_menu_user has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/access_menu_users")
  public ResponseEntity<Access_menu_userDTO> createAccess_menu_user(@Valid @RequestBody Access_menu_userDTO access_menu_userDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Access_menu_user : {}", access_menu_userDTO);
    if ( access_menu_userDTO.getId() != null) {
      bindingResult.addError( new FieldError("Access_menu_userDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Access_menu_userDTO result = access_menu_userService.save(access_menu_userDTO);
    return ResponseEntity.created( new URI("/api/access_menu_users/"+ result.getId())).body(result);
  }

  /**
   * PUT  /access_menu_users : Updates an existing access_menu_user.
   *
   * @param id
   * @param access_menu_userDTO the access_menu_user to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated access_menu_user,
   * or with status 400 (Bad Request) if the access_menu_user is not valid,
   * or with status 500 (Internal Server Error) if the access_menu_user couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/access_menu_users/{id}")
  public ResponseEntity<Access_menu_userDTO> updateAccess_menu_user(@PathVariable Integer id, @Valid @RequestBody Access_menu_userDTO access_menu_userDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Access_menu_user: {}",id);
    access_menu_userDTO.setId(id);
    Access_menu_userDTO result =access_menu_userService.update(access_menu_userDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /access_menu_users/{id} : get the "id" access_menu_user.
   *
   * @param id the id of the access_menu_user to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of access_menu_user, or with status 404 (Not Found)
   */
  @GetMapping("/access_menu_users/{id}")
  public ResponseEntity<Access_menu_userDTO> getAccess_menu_user(@PathVariable Integer id) {
    log.debug("Request to get Access_menu_user: {}",id);
    Access_menu_userDTO dto = access_menu_userService.findOne(id);
    RestPreconditions.checkFound(dto, "access_menu_user.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /access_menu_users : get all the access_menu_users.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of access_menu_users in body
   */
  @GetMapping("/access_menu_users")
  public Collection<Access_menu_userDTO> getAllAccess_menu_users() {
    log.debug("Request to get all  Access_menu_users : {}");
    return access_menu_userService.findAll();
  }

  /**
   * DELETE  /access_menu_users/{id} : delete the "id" access_menu_user.
   *
   * @param id the id of the access_menu_user to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/access_menu_users/{id}")
  public ResponseEntity<Void> deleteAccess_menu_user(@PathVariable Integer id) {
    log.debug("Request to delete Access_menu_user: {}",id);
    access_menu_userService.delete(id);
    return ResponseEntity.ok().build();
  }
}

