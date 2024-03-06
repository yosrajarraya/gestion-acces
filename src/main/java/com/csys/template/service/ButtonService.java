package com.csys.template.service;

import com.csys.template.domain.Button;
import com.csys.template.dto.ButtonDTO;
import com.csys.template.factory.ButtonFactory;
import com.csys.template.repository.ButtonRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Button.
 */
@Service
@Transactional
public class ButtonService {
  private final Logger log = LoggerFactory.getLogger(ButtonService.class);

  private final ButtonRepository buttonRepository;

  public ButtonService(ButtonRepository buttonRepository) {
    this.buttonRepository=buttonRepository;
  }

  /**
   * Save a buttonDTO.
   *
   * @param buttonDTO
   * @return the persisted entity
   */
  public ButtonDTO save(ButtonDTO buttonDTO) {
    log.debug("Request to save Button: {}",buttonDTO);
    Button button = ButtonFactory.buttonDTOToButton(buttonDTO);
    button = buttonRepository.save(button);
    ButtonDTO resultDTO = ButtonFactory.buttonToButtonDTO(button);
    return resultDTO;
  }

  /**
   * Update a buttonDTO.
   *
   * @param buttonDTO
   * @return the updated entity
   */
  public ButtonDTO update(ButtonDTO buttonDTO) {
    log.debug("Request to update Button: {}",buttonDTO);
      Optional<Button> inBase= buttonRepository.findById(buttonDTO.getIdButton());
    Preconditions.checkArgument(inBase != null, "button.NotFound");
    Button button = ButtonFactory.buttonDTOToButton(buttonDTO);
    button = buttonRepository.save(button);
    ButtonDTO resultDTO = ButtonFactory.buttonToButtonDTO(button);
    return resultDTO;
  }

  /**
   * Get one buttonDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */

  @Transactional(
      readOnly = true
  )
  public ButtonDTO findOne(Integer id) {
    log.debug("Request to get Button: {}",id);
      Optional<Button> buttonOptional= buttonRepository.findById(id);
    Button button = buttonOptional.orElseThrow(() -> new IllegalArgumentException("Module not found"));
    ButtonDTO dto = ButtonFactory.buttonToButtonDTO(button);
    return dto;
  }

  /**
   * Get one button by id.
   *
   * @param id the id of the entity
   * @return the entity
   */


  @Transactional(
      readOnly = true
  )
  public Button findButton(Integer id) {
    log.debug("Request to get Button: {}",id);
    Optional<Button> buttonOptional= buttonRepository.findById(id);
    return buttonOptional.orElse(null);
  }

  /**
   * Get all the buttons.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<ButtonDTO> findAll() {
    log.debug("Request to get All Buttons");
    Collection<Button> result= buttonRepository.findAll();
    return ButtonFactory.buttonToButtonDTOs(result);
  }

  /**
   * Delete button by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Button: {}",id);
    buttonRepository.deleteById(id);
  }
}

