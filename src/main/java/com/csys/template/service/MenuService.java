package com.csys.template.service;

import com.csys.template.domain.Menu;
import com.csys.template.dto.MenuDTO;
import com.csys.template.factory.MenuFactory;
import com.csys.template.repository.MenuRepository;
<<<<<<< HEAD
=======
import com.google.common.base.Preconditions;
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
import java.lang.Integer;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Menu.
 */
@Service
@Transactional
public class MenuService {
  private final Logger log = LoggerFactory.getLogger(MenuService.class);

  private final MenuRepository menuRepository;

  public MenuService(MenuRepository menuRepository) {
    this.menuRepository=menuRepository;
  }

  /**
   * Save a menuDTO.
   *
   * @param menuDTO
   * @return the persisted entity
   */
  public MenuDTO save(MenuDTO menuDTO) {
    log.debug("Request to save Menu: {}",menuDTO);
    Menu menu = MenuFactory.menuDTOToMenu(menuDTO);
    menu = menuRepository.save(menu);
    MenuDTO resultDTO = MenuFactory.menuToMenuDTO(menu);
    return resultDTO;
  }

  /**
<<<<<<< HEAD
=======
   * 
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
   * Update a menuDTO.
   *
   * @param menuDTO
   * @return the updated entity
   */
<<<<<<< HEAD
@Transactional
public MenuDTO update(MenuDTO menuDTO) {
    log.debug("Request to update Menu: {}",menuDTO);
    Optional<Menu> menuOptional = menuRepository.findById(menuDTO.getIdMenu());
    Menu inBase = menuOptional.orElseThrow(() -> new IllegalArgumentException("menu.NotFound"));
=======
  public MenuDTO update(MenuDTO menuDTO) {
    log.debug("Request to update Menu: {}",menuDTO);
      Optional<Menu> inBase= menuRepository.findById(menuDTO.getIdMenu());
    Preconditions.checkArgument(inBase != null, "menu.NotFound");
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    Menu menu = MenuFactory.menuDTOToMenu(menuDTO);
    menu = menuRepository.save(menu);
    MenuDTO resultDTO = MenuFactory.menuToMenuDTO(menu);
    return resultDTO;
<<<<<<< HEAD
}
=======
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one menuDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
<<<<<<< HEAD
@Transactional(readOnly = true)
public MenuDTO findOne(Integer id) {
    log.debug("Request to get Menu: {}",id);
    Optional<Menu> menuOptional = menuRepository.findById(id);
    Menu menu = menuOptional.orElse(null);
    return menu != null ? MenuFactory.menuToMenuDTO(menu) : null;
}
=======
  @Transactional(
      readOnly = true
  )
  public MenuDTO findOne(Integer id) {
    log.debug("Request to get Menu: {}",id);
      Optional<Menu> menuOptional= menuRepository.findById(id);
        Menu menu = menuOptional.orElseThrow(() -> new IllegalArgumentException("Module not found"));

    MenuDTO dto = MenuFactory.menuToMenuDTO(menu);
    return dto;
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get one menu by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
<<<<<<< HEAD
@Transactional(readOnly = true)
public Menu findMenu(Integer id) {
    log.debug("Request to get Menu: {}",id);
    Optional<Menu> menuOptional = menuRepository.findById(id);
    return menuOptional.orElse(null);
}

=======

  @Transactional(
      readOnly = true
  )
  public Menu findMenu(Integer id) {
    log.debug("Request to get Menu: {}",id);
      Optional<Menu> menuOptional= menuRepository.findById(id);
    return menuOptional.orElse(null);
  }
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb

  /**
   * Get all the menus.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<MenuDTO> findAll() {
    log.debug("Request to get All Menus");
    Collection<Menu> result= menuRepository.findAll();
    return MenuFactory.menuToMenuDTOs(result);
  }

  /**
   * Delete menu by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Menu: {}",id);
    menuRepository.deleteById(id);
  }
}

