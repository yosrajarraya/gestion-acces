package com.csys.template.web.rest;

import com.csys.template.dto.Access_button_userDTO;
import com.csys.template.service.Access_button_userService;
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
 * REST controller for managing Access_button_user.
 */
@RestController
@RequestMapping("/api")
public class Access_button_userResource {
  private static final String ENTITY_NAME = "access_button_user";

  private final Access_button_userService access_button_userService;

  private final Logger log = LoggerFactory.getLogger(Access_button_userService.class);

  public Access_button_userResource(Access_button_userService access_button_userService) {
    this.access_button_userService=access_button_userService;
  }

  /**
   * POST  /access_button_users : Create a new access_button_user.
   *
   * @param access_button_userDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new access_button_user, or with status 400 (Bad Request) if the access_button_user has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/access_button_users")
  public ResponseEntity<Access_button_userDTO> createAccess_button_user(@Valid @RequestBody Access_button_userDTO access_button_userDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Access_button_user : {}", access_button_userDTO);
    if ( access_button_userDTO.getId() != null) {
      bindingResult.addError( new FieldError("Access_button_userDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Access_button_userDTO result = access_button_userService.save(access_button_userDTO);
    return ResponseEntity.created( new URI("/api/access_button_users/"+ result.getId())).body(result);
  }

  /**
   * PUT  /access_button_users : Updates an existing access_button_user.
   *
   * @param id
   * @param access_button_userDTO the access_button_user to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated access_button_user,
   * or with status 400 (Bad Request) if the access_button_user is not valid,
   * or with status 500 (Internal Server Error) if the access_button_user couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/access_button_users/{id}")
  public ResponseEntity<Access_button_userDTO> updateAccess_button_user(@PathVariable Integer id, @Valid @RequestBody Access_button_userDTO access_button_userDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Access_button_user: {}",id);
    access_button_userDTO.setId(id);
    Access_button_userDTO result =access_button_userService.update(access_button_userDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /access_button_users/{id} : get the "id" access_button_user.
   *
   * @param id the id of the access_button_user to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of access_button_user, or with status 404 (Not Found)
   */
  @GetMapping("/access_button_users/{id}")
  public ResponseEntity<Access_button_userDTO> getAccess_button_user(@PathVariable Integer id) {
    log.debug("Request to get Access_button_user: {}",id);
    Access_button_userDTO dto = access_button_userService.findOne(id);
    RestPreconditions.checkFound(dto, "access_button_user.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /access_button_users : get all the access_button_users.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of access_button_users in body
   */
  @GetMapping("/access_button_users")
  public Collection<Access_button_userDTO> getAllAccess_button_users() {
    log.debug("Request to get all  Access_button_users : {}");
    return access_button_userService.findAll();
  }

  /**
   * DELETE  /access_button_users/{id} : delete the "id" access_button_user.
   *
   * @param id the id of the access_button_user to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/access_button_users/{id}")
  public ResponseEntity<Void> deleteAccess_button_user(@PathVariable Integer id) {
    log.debug("Request to delete Access_button_user: {}",id);
    access_button_userService.delete(id);
    return ResponseEntity.ok().build();
  }
}

