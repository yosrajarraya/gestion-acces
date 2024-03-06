package com.csys.template.web.rest;

import com.csys.template.dto.Access_module_grpDTO;
import com.csys.template.service.Access_module_grpService;
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
 * REST controller for managing Access_module_grp.
 */
@RestController
@RequestMapping("/api")
public class Access_module_grpResource {
  private static final String ENTITY_NAME = "access_module_grp";

  private final Access_module_grpService access_module_grpService;

  private final Logger log = LoggerFactory.getLogger(Access_module_grpService.class);

  public Access_module_grpResource(Access_module_grpService access_module_grpService) {
    this.access_module_grpService=access_module_grpService;
  }

  /**
   * POST  /access_module_grps : Create a new access_module_grp.
   *
   * @param access_module_grpDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new access_module_grp, or with status 400 (Bad Request) if the access_module_grp has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/access_module_grps")
  public ResponseEntity<Access_module_grpDTO> createAccess_module_grp(@Valid @RequestBody Access_module_grpDTO access_module_grpDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Access_module_grp : {}", access_module_grpDTO);
    if ( access_module_grpDTO.getId() != null) {
      bindingResult.addError( new FieldError("Access_module_grpDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Access_module_grpDTO result = access_module_grpService.save(access_module_grpDTO);
    return ResponseEntity.created( new URI("/api/access_module_grps/"+ result.getId())).body(result);
  }

  /**
   * PUT  /access_module_grps : Updates an existing access_module_grp.
   *
   * @param id
   * @param access_module_grpDTO the access_module_grp to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated access_module_grp,
   * or with status 400 (Bad Request) if the access_module_grp is not valid,
   * or with status 500 (Internal Server Error) if the access_module_grp couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/access_module_grps/{id}")
  public ResponseEntity<Access_module_grpDTO> updateAccess_module_grp(@PathVariable Integer id, @Valid @RequestBody Access_module_grpDTO access_module_grpDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Access_module_grp: {}",id);
    access_module_grpDTO.setId(id);
    Access_module_grpDTO result =access_module_grpService.update(access_module_grpDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /access_module_grps/{id} : get the "id" access_module_grp.
   *
   * @param id the id of the access_module_grp to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of access_module_grp, or with status 404 (Not Found)
   */
  @GetMapping("/access_module_grps/{id}")
  public ResponseEntity<Access_module_grpDTO> getAccess_module_grp(@PathVariable Integer id) {
    log.debug("Request to get Access_module_grp: {}",id);
    Access_module_grpDTO dto = access_module_grpService.findOne(id);
    RestPreconditions.checkFound(dto, "access_module_grp.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /access_module_grps : get all the access_module_grps.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of access_module_grps in body
   */
  @GetMapping("/access_module_grps")
  public Collection<Access_module_grpDTO> getAllAccess_module_grps() {
    log.debug("Request to get all  Access_module_grps : {}");
    return access_module_grpService.findAll();
  }

  /**
   * DELETE  /access_module_grps/{id} : delete the "id" access_module_grp.
   *
   * @param id the id of the access_module_grp to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/access_module_grps/{id}")
  public ResponseEntity<Void> deleteAccess_module_grp(@PathVariable Integer id) {
    log.debug("Request to delete Access_module_grp: {}",id);
    access_module_grpService.delete(id);
    return ResponseEntity.ok().build();
  }
}

