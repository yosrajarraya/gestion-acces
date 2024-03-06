package com.csys.template.web.rest;

import com.csys.template.dto.CliniqueDTO;
import com.csys.template.service.CliniqueService;
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
 * REST controller for managing Clinique.
 */
@RestController
@RequestMapping("/api")
public class CliniqueResource {
  private static final String ENTITY_NAME = "clinique";

  private final CliniqueService cliniqueService;

  private final Logger log = LoggerFactory.getLogger(CliniqueService.class);

  public CliniqueResource(CliniqueService cliniqueService) {
    this.cliniqueService=cliniqueService;
  }

  /**
   * POST  /cliniques : Create a new clinique.
   *
   * @param cliniqueDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new clinique, or with status 400 (Bad Request) if the clinique has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/cliniques")
  public ResponseEntity<CliniqueDTO> createClinique(@Valid @RequestBody CliniqueDTO cliniqueDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Clinique : {}", cliniqueDTO);
    if ( cliniqueDTO.getId_clinique() != null) {
      bindingResult.addError( new FieldError("CliniqueDTO","id_clinique","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    CliniqueDTO result = cliniqueService.save(cliniqueDTO);
    return ResponseEntity.created( new URI("/api/cliniques/"+ result.getId_clinique())).body(result);
  }

  /**
   * PUT  /cliniques : Updates an existing clinique.
   *
   * @param id
   * @param cliniqueDTO the clinique to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated clinique,
   * or with status 400 (Bad Request) if the clinique is not valid,
   * or with status 500 (Internal Server Error) if the clinique couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/cliniques/{id}")
  public ResponseEntity<CliniqueDTO> updateClinique(@PathVariable Integer id, @Valid @RequestBody CliniqueDTO cliniqueDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Clinique: {}",id);
    cliniqueDTO.setId_clinique(id);
    CliniqueDTO result =cliniqueService.update(cliniqueDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /cliniques/{id} : get the "id" clinique.
   *
   * @param id the id of the clinique to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of clinique, or with status 404 (Not Found)
   */
  @GetMapping("/cliniques/{id}")
  public ResponseEntity<CliniqueDTO> getClinique(@PathVariable Integer id) {
    log.debug("Request to get Clinique: {}",id);
    CliniqueDTO dto = cliniqueService.findOne(id);
    RestPreconditions.checkFound(dto, "clinique.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /cliniques : get all the cliniques.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of cliniques in body
   */
  @GetMapping("/cliniques")
  public Collection<CliniqueDTO> getAllCliniques() {
    log.debug("Request to get all  Cliniques : {}");
    return cliniqueService.findAll();
  }

  /**
   * DELETE  /cliniques/{id} : delete the "id" clinique.
   *
   * @param id the id of the clinique to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/cliniques/{id}")
  public ResponseEntity<Void> deleteClinique(@PathVariable Integer id) {
    log.debug("Request to delete Clinique: {}",id);
    cliniqueService.delete(id);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/cliniques/by-name/{name}")
public ResponseEntity<Collection<CliniqueDTO>> getCliniquesByName(@PathVariable String name) {
    log.debug("Request to get Cliniques by name: {}", name);
    Collection<CliniqueDTO> cliniques = cliniqueService.findByCliniqueName(name);
    return ResponseEntity.ok().body(cliniques);
    
}
}

