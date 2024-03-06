package com.csys.template.factory;

import com.csys.template.domain.Menu;
import com.csys.template.dto.MenuDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MenuFactory {
  public static MenuDTO menuToMenuDTO(Menu menu) {
    MenuDTO menuDTO=new MenuDTO();
    menuDTO.setIdMenu(menu.getIdMenu());
    menuDTO.setCodeMenu(menu.getCodeMenu());
    menuDTO.setCodeMenuPrincipal(menu.getCodeMenuPrincipal());
    menuDTO.setOrder(menu.getOrder());
    menuDTO.setDesignationAr(menu.getDesignationAr());
    menuDTO.setDesignationFr(menu.getDesignationFr());
    menuDTO.setDesignationEng(menu.getDesignationEng());
    menuDTO.setLogo(menu.getLogo());
    menuDTO.setIdModule(menu.getIdModule());
    return menuDTO;
  }

  public static Menu menuDTOToMenu(MenuDTO menuDTO) {
    Menu menu=new Menu();
    menu.setIdMenu(menuDTO.getIdMenu());
    menu.setCodeMenu(menuDTO.getCodeMenu());
    menu.setCodeMenuPrincipal(menuDTO.getCodeMenuPrincipal());
    menu.setOrder(menuDTO.getOrder());
    menu.setDesignationAr(menuDTO.getDesignationAr());
    menu.setDesignationFr(menuDTO.getDesignationFr());
    menu.setDesignationEng(menuDTO.getDesignationEng());
    menu.setLogo(menuDTO.getLogo());
    menu.setIdModule(menuDTO.getIdModule());
    return menu;
  }

  public static Collection<MenuDTO> menuToMenuDTOs(Collection<Menu> menus) {
    List<MenuDTO> menusDTO=new ArrayList<>();
    menus.forEach(x -> {
      menusDTO.add(menuToMenuDTO(x));
    } );
    return menusDTO;
  }
}

