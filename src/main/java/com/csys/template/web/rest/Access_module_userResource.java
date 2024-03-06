package com.csys.template.web.rest;

import com.csys.template.dto.Access_module_userDTO;
import com.csys.template.service.Access_module_userService;
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
 * REST controller for managing Access_module_user.
 */
@RestController
@RequestMapping("/api")
public class Access_module_userResource {
  private static final String ENTITY_NAME = "access_module_user";

  private final Access_module_userService access_module_userService;

  private final Logger log = LoggerFactory.getLogger(Access_module_userService.class);

  public Access_module_userResource(Access_module_userService access_module_userService) {
    this.access_module_userService=access_module_userService;
  }

  /**
   * POST  /access_module_users : Create a new access_module_user.
   *
   * @param access_module_userDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new access_module_user, or with status 400 (Bad Request) if the access_module_user has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/access_module_users")
  public ResponseEntity<Access_module_userDTO> createAccess_module_user(@Valid @RequestBody Access_module_userDTO access_module_userDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Access_module_user : {}", access_module_userDTO);
    if ( access_module_userDTO.getId() != null) {
      bindingResult.addError( new FieldError("Access_module_userDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Access_module_userDTO result = access_module_userService.save(access_module_userDTO);
    return ResponseEntity.created( new URI("/api/access_module_users/"+ result.getId())).body(result);
  }

  /**
   * PUT  /access_module_users : Updates an existing access_module_user.
   *
   * @param id
   * @param access_module_userDTO the access_module_user to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated access_module_user,
   * or with status 400 (Bad Request) if the access_module_user is not valid,
   * or with status 500 (Internal Server Error) if the access_module_user couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/access_module_users/{id}")
  public ResponseEntity<Access_module_userDTO> updateAccess_module_user(@PathVariable Integer id, @Valid @RequestBody Access_module_userDTO access_module_userDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Access_module_user: {}",id);
    access_module_userDTO.setId(id);
    Access_module_userDTO result =access_module_userService.update(access_module_userDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /access_module_users/{id} : get the "id" access_module_user.
   *
   * @param id the id of the access_module_user to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of access_module_user, or with status 404 (Not Found)
   */
  @GetMapping("/access_module_users/{id}")
  public ResponseEntity<Access_module_userDTO> getAccess_module_user(@PathVariable Integer id) {
    log.debug("Request to get Access_module_user: {}",id);
    Access_module_userDTO dto = access_module_userService.findOne(id);
    RestPreconditions.checkFound(dto, "access_module_user.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /access_module_users : get all the access_module_users.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of access_module_users in body
   */
  @GetMapping("/access_module_users")
  public Collection<Access_module_userDTO> getAllAccess_module_users() {
    log.debug("Request to get all  Access_module_users : {}");
    return access_module_userService.findAll();
  }

  /**
   * DELETE  /access_module_users/{id} : delete the "id" access_module_user.
   *
   * @param id the id of the access_module_user to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/access_module_users/{id}")
  public ResponseEntity<Void> deleteAccess_module_user(@PathVariable Integer id) {
    log.debug("Request to delete Access_module_user: {}",id);
    access_module_userService.delete(id);
    return ResponseEntity.ok().build();
  }
}

