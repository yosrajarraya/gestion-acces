package com.csys.template.web.rest;

import com.csys.template.dto.AccessControlDTO;
import com.csys.template.service.AccessControlService;
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
 * REST controller for managing AccessControl.
 */
@RestController
@RequestMapping("/api")
public class AccessControlResource {
  private static final String ENTITY_NAME = "accesscontrol";

  private final AccessControlService accesscontrolService;

  private final Logger log = LoggerFactory.getLogger(AccessControlService.class);

  public AccessControlResource(AccessControlService accesscontrolService) {
    this.accesscontrolService=accesscontrolService;
  }

  /**
   * POST  /accesscontrols : Create a new accesscontrol.
   *
   * @param accesscontrolDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new accesscontrol, or with status 400 (Bad Request) if the accesscontrol has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/accesscontrols")
  public ResponseEntity<AccessControlDTO> createAccessControl(@Valid @RequestBody AccessControlDTO accesscontrolDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save AccessControl : {}", accesscontrolDTO);
    if ( accesscontrolDTO.getId() != null) {
      bindingResult.addError( new FieldError("AccessControlDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    AccessControlDTO result = accesscontrolService.save(accesscontrolDTO);
    return ResponseEntity.created( new URI("/api/accesscontrols/"+ result.getId())).body(result);
  }

  /**
   * PUT  /accesscontrols : Updates an existing accesscontrol.
   *
   * @param id
   * @param accesscontrolDTO the accesscontrol to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated accesscontrol,
   * or with status 400 (Bad Request) if the accesscontrol is not valid,
   * or with status 500 (Internal Server Error) if the accesscontrol couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/accesscontrols/{id}")
  public ResponseEntity<AccessControlDTO> updateAccessControl(@PathVariable Integer id, @Valid @RequestBody AccessControlDTO accesscontrolDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update AccessControl: {}",id);
    accesscontrolDTO.setId(id);
    AccessControlDTO result =accesscontrolService.update(accesscontrolDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /accesscontrols/{id} : get the "id" accesscontrol.
   *
   * @param id the id of the accesscontrol to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of accesscontrol, or with status 404 (Not Found)
   */
  @GetMapping("/accesscontrols/{id}")
  public ResponseEntity<AccessControlDTO> getAccessControl(@PathVariable Integer id) {
    log.debug("Request to get AccessControl: {}",id);
    AccessControlDTO dto = accesscontrolService.findOne(id);
    RestPreconditions.checkFound(dto, "accesscontrol.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /accesscontrols : get all the accesscontrols.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of accesscontrols in body
   */
  @GetMapping("/accesscontrols")
  public Collection<AccessControlDTO> getAllAccessControls() {
    log.debug("Request to get all  AccessControls : {}");
    return accesscontrolService.findAll();
  }

  /**
   * DELETE  /accesscontrols/{id} : delete the "id" accesscontrol.
   *
   * @param id the id of the accesscontrol to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/accesscontrols/{id}")
  public ResponseEntity<Void> deleteAccessControl(@PathVariable Integer id) {
    log.debug("Request to delete AccessControl: {}",id);
    accesscontrolService.delete(id);
    return ResponseEntity.ok().build();
  }
}

