package com.csys.template.web.rest;

import com.csys.template.dto.Access_button_grpDTO;
import com.csys.template.service.Access_button_grpService;
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
 * REST controller for managing Access_button_grp.
 */
@RestController
@RequestMapping("/api")
public class Access_button_grpResource {
  private static final String ENTITY_NAME = "access_button_grp";

  private final Access_button_grpService access_button_grpService;

  private final Logger log = LoggerFactory.getLogger(Access_button_grpService.class);

  public Access_button_grpResource(Access_button_grpService access_button_grpService) {
    this.access_button_grpService=access_button_grpService;
  }

  /**
   * POST  /access_button_grps : Create a new access_button_grp.
   *
   * @param access_button_grpDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new access_button_grp, or with status 400 (Bad Request) if the access_button_grp has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/access_button_grps")
  public ResponseEntity<Access_button_grpDTO> createAccess_button_grp(@Valid @RequestBody Access_button_grpDTO access_button_grpDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Access_button_grp : {}", access_button_grpDTO);
    if ( access_button_grpDTO.getId() != null) {
      bindingResult.addError( new FieldError("Access_button_grpDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Access_button_grpDTO result = access_button_grpService.save(access_button_grpDTO);
    return ResponseEntity.created( new URI("/api/access_button_grps/"+ result.getId())).body(result);
  }

  /**
   * PUT  /access_button_grps : Updates an existing access_button_grp.
   *
   * @param id
   * @param access_button_grpDTO the access_button_grp to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated access_button_grp,
   * or with status 400 (Bad Request) if the access_button_grp is not valid,
   * or with status 500 (Internal Server Error) if the access_button_grp couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/access_button_grps/{id}")
  public ResponseEntity<Access_button_grpDTO> updateAccess_button_grp(@PathVariable Integer id, @Valid @RequestBody Access_button_grpDTO access_button_grpDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Access_button_grp: {}",id);
    access_button_grpDTO.setId(id);
    Access_button_grpDTO result =access_button_grpService.update(access_button_grpDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /access_button_grps/{id} : get the "id" access_button_grp.
   *
   * @param id the id of the access_button_grp to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of access_button_grp, or with status 404 (Not Found)
   */
  @GetMapping("/access_button_grps/{id}")
  public ResponseEntity<Access_button_grpDTO> getAccess_button_grp(@PathVariable Integer id) {
    log.debug("Request to get Access_button_grp: {}",id);
    Access_button_grpDTO dto = access_button_grpService.findOne(id);
    RestPreconditions.checkFound(dto, "access_button_grp.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /access_button_grps : get all the access_button_grps.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of access_button_grps in body
   */
  @GetMapping("/access_button_grps")
  public Collection<Access_button_grpDTO> getAllAccess_button_grps() {
    log.debug("Request to get all  Access_button_grps : {}");
    return access_button_grpService.findAll();
  }

  /**
   * DELETE  /access_button_grps/{id} : delete the "id" access_button_grp.
   *
   * @param id the id of the access_button_grp to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/access_button_grps/{id}")
  public ResponseEntity<Void> deleteAccess_button_grp(@PathVariable Integer id) {
    log.debug("Request to delete Access_button_grp: {}",id);
    access_button_grpService.delete(id);
    return ResponseEntity.ok().build();
  }
}

