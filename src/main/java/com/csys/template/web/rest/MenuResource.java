package com.csys.template.web.rest;

import com.csys.template.dto.MenuDTO;
import com.csys.template.service.MenuService;
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
 * REST controller for managing Menu.
 */
@RestController
@RequestMapping("/api")
public class MenuResource {
  private static final String ENTITY_NAME = "menu";

  private final MenuService menuService;

  private final Logger log = LoggerFactory.getLogger(MenuService.class);

  public MenuResource(MenuService menuService) {
    this.menuService=menuService;
  }

  /**
   * POST  /menus : Create a new menu.
   *
   * @param menuDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new menu, or with status 400 (Bad Request) if the menu has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/menus")
  public ResponseEntity<MenuDTO> createMenu(@Valid @RequestBody MenuDTO menuDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Menu : {}", menuDTO);
    if ( menuDTO.getIdMenu() != null) {
      bindingResult.addError( new FieldError("MenuDTO","idMenu","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    MenuDTO result = menuService.save(menuDTO);
    return ResponseEntity.created( new URI("/api/menus/"+ result.getIdMenu())).body(result);
  }

  /**
   * PUT  /menus : Updates an existing menu.
   *
   * @param id
   * @param menuDTO the menu to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated menu,
   * or with status 400 (Bad Request) if the menu is not valid,
   * or with status 500 (Internal Server Error) if the menu couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/menus/{id}")
  public ResponseEntity<MenuDTO> updateMenu(@PathVariable Integer id, @Valid @RequestBody MenuDTO menuDTO) throws MethodArgumentNotValidException {
    log.debug("Request to update Menu: {}",id);
    menuDTO.setIdMenu(id);
    MenuDTO result =menuService.update(menuDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /menus/{id} : get the "id" menu.
   *
   * @param id the id of the menu to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of menu, or with status 404 (Not Found)
   */
  @GetMapping("/menus/{id}")
  public ResponseEntity<MenuDTO> getMenu(@PathVariable Integer id) {
    log.debug("Request to get Menu: {}",id);
    MenuDTO dto = menuService.findOne(id);
    RestPreconditions.checkFound(dto, "menu.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /menus : get all the menus.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of menus in body
   */
  @GetMapping("/menus")
  public Collection<MenuDTO> getAllMenus() {
    log.debug("Request to get all  Menus : {}");
    return menuService.findAll();
  }

  /**
   * DELETE  /menus/{id} : delete the "id" menu.
   *
   * @param id the id of the menu to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/menus/{id}")
  public ResponseEntity<Void> deleteMenu(@PathVariable Integer id) {
    log.debug("Request to delete Menu: {}",id);
    menuService.delete(id);
    return ResponseEntity.ok().build();
  }
}

