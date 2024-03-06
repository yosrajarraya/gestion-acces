package com.csys.template.web.rest;

import com.csys.template.dto.Access_menu_grpDTO;
import com.csys.template.service.Access_menu_grpService;
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
 * REST controller for managing Access_menu_grp.
 */
@RestController
@RequestMapping("/api")
public class Access_menu_grpResource {
  private static final String ENTITY_NAME = "access_menu_grp";

  private final Access_menu_grpService access_menu_grpService;

  private final Logger log = LoggerFactory.getLogger(Access_menu_grpService.class);

  public Access_menu_grpResource(Access_menu_grpService access_menu_grpService) {
    this.access_menu_grpService=access_menu_grpService;
  }

  /**
   * POST  /access_menu_grps : Create a new access_menu_grp.
   *
   * @param access_menu_grpDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new access_menu_grp, or with status 400 (Bad Request) if the access_menu_grp has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/access_menu_grps")
  public ResponseEntity<Access_menu_grpDTO> createAccess_menu_grp(@Valid @RequestBody Access_menu_grpDTO access_menu_grpDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Access_menu_grp : {}", access_menu_grpDTO);
    if ( access_menu_grpDTO.getId() != null) {
      bindingResult.addError( new FieldError("Access_menu_grpDTO","id","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    Access_menu_grpDTO result = access_menu_grpService.save(access_menu_grpDTO);
    return ResponseEntity.created( new URI("/api/access_menu_grps/"+ result.getId())).body(result);
  }

  /**
   * PUT  /access_menu_grps : Updates an existing access_menu_grp.
   *
   * @param id
   * @param access_menu_grpDTO the access_menu_grp to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated access_menu_grp,
   * or with status 400 (Bad Request) if the access_menu_grp is not valid,
   * or with status 500 (Internal Server Error) if the access_menu_grp couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/access_menu_grps/{id}")
  public ResponseEntity<Access_menu_grpDTO> updateAccess_menu_grp(@PathVariable Integer id, @Valid @RequestBody Access_menu_grpDTO access_menu_grpDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Access_menu_grp: {}",id);
    access_menu_grpDTO.setId(id);
    Access_menu_grpDTO result =access_menu_grpService.update(access_menu_grpDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /access_menu_grps/{id} : get the "id" access_menu_grp.
   *
   * @param id the id of the access_menu_grp to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of access_menu_grp, or with status 404 (Not Found)
   */
  @GetMapping("/access_menu_grps/{id}")
  public ResponseEntity<Access_menu_grpDTO> getAccess_menu_grp(@PathVariable Integer id) {
    log.debug("Request to get Access_menu_grp: {}",id);
    Access_menu_grpDTO dto = access_menu_grpService.findOne(id);
    RestPreconditions.checkFound(dto, "access_menu_grp.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /access_menu_grps : get all the access_menu_grps.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of access_menu_grps in body
   */
  @GetMapping("/access_menu_grps")
  public Collection<Access_menu_grpDTO> getAllAccess_menu_grps() {
    log.debug("Request to get all  Access_menu_grps : {}");
    return access_menu_grpService.findAll();
  }

  /**
   * DELETE  /access_menu_grps/{id} : delete the "id" access_menu_grp.
   *
   * @param id the id of the access_menu_grp to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/access_menu_grps/{id}")
  public ResponseEntity<Void> deleteAccess_menu_grp(@PathVariable Integer id) {
    log.debug("Request to delete Access_menu_grp: {}",id);
    access_menu_grpService.delete(id);
    return ResponseEntity.ok().build();
  }
}

