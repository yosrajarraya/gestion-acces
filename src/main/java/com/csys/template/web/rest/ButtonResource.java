package com.csys.template.web.rest;

import com.csys.template.dto.ButtonDTO;
import com.csys.template.service.ButtonService;
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
 * REST controller for managing Button.
 */
@RestController
@RequestMapping("/api")
public class ButtonResource {
  private static final String ENTITY_NAME = "button";

  private final ButtonService buttonService;

  private final Logger log = LoggerFactory.getLogger(ButtonService.class);

  public ButtonResource(ButtonService buttonService) {
    this.buttonService=buttonService;
  }

  /**
   * POST  /buttons : Create a new button.
   *
   * @param buttonDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new button, or with status 400 (Bad Request) if the button has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/buttons")
  public ResponseEntity<ButtonDTO> createButton(@Valid @RequestBody ButtonDTO buttonDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Button : {}", buttonDTO);
    if ( buttonDTO.getIdButton() != null) {
      bindingResult.addError( new FieldError("ButtonDTO","idButton","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    ButtonDTO result = buttonService.save(buttonDTO);
    return ResponseEntity.created( new URI("/api/buttons/"+ result.getIdButton())).body(result);
  }

  /**
   * PUT  /buttons : Updates an existing button.
   *
   * @param id
   * @param buttonDTO the button to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated button,
   * or with status 400 (Bad Request) if the button is not valid,
   * or with status 500 (Internal Server Error) if the button couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/buttons/{id}")
  public ResponseEntity<ButtonDTO> updateButton(@PathVariable Integer id, @Valid @RequestBody ButtonDTO buttonDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Button: {}",id);
    buttonDTO.setIdButton(id);
    ButtonDTO result =buttonService.update(buttonDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /buttons/{id} : get the "id" button.
   *
   * @param id the id of the button to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of button, or with status 404 (Not Found)
   */
  @GetMapping("/buttons/{id}")
  public ResponseEntity<ButtonDTO> getButton(@PathVariable Integer id) {
    log.debug("Request to get Button: {}",id);
    ButtonDTO dto = buttonService.findOne(id);
    RestPreconditions.checkFound(dto, "button.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /buttons : get all the buttons.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of buttons in body
   */
  @GetMapping("/buttons")
  public Collection<ButtonDTO> getAllButtons() {
    log.debug("Request to get all  Buttons : {}");
    return buttonService.findAll();
  }

  /**
   * DELETE  /buttons/{id} : delete the "id" button.
   *
   * @param id the id of the button to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/buttons/{id}")
  public ResponseEntity<Void> deleteButton(@PathVariable Integer id) {
    log.debug("Request to delete Button: {}",id);
    buttonService.delete(id);
    return ResponseEntity.ok().build();
  }
}

