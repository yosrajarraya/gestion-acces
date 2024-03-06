package com.csys.template.factory;

import com.csys.template.domain.Access_menu_user;
import com.csys.template.dto.Access_menu_userDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Access_menu_userFactory {
  public static Access_menu_userDTO access_menu_userToAccess_menu_userDTO(Access_menu_user access_menu_user) {
    Access_menu_userDTO access_menu_userDTO=new Access_menu_userDTO();
    access_menu_userDTO.setId(access_menu_user.getId());
    access_menu_userDTO.setIdMenu(access_menu_user.getIdMenu());
    access_menu_userDTO.setIdUser(access_menu_user.getIdUser());
//    access_menu_userDTO.setModule(access_menu_user.getModule());
    access_menu_userDTO.setVisible(access_menu_user.getVisible());
    access_menu_userDTO.setNumDelegate(access_menu_user.getNumDelegate());
    return access_menu_userDTO;
  }

  public static Access_menu_user access_menu_userDTOToAccess_menu_user(Access_menu_userDTO access_menu_userDTO) {
    Access_menu_user access_menu_user=new Access_menu_user();
    access_menu_user.setId(access_menu_userDTO.getId());
    access_menu_user.setIdMenu(access_menu_userDTO.getIdMenu());
    access_menu_user.setIdUser(access_menu_userDTO.getIdUser());
//    access_menu_user.setModule(access_menu_userDTO.getModule());
    access_menu_user.setVisible(access_menu_userDTO.getVisible());
    access_menu_user.setNumDelegate(access_menu_userDTO.getNumDelegate());
    return access_menu_user;
  }

  public static Collection<Access_menu_userDTO> access_menu_userToAccess_menu_userDTOs(Collection<Access_menu_user> access_menu_users) {
    List<Access_menu_userDTO> access_menu_usersDTO=new ArrayList<>();
    access_menu_users.forEach(x -> {
      access_menu_usersDTO.add(access_menu_userToAccess_menu_userDTO(x));
    } );
    return access_menu_usersDTO;
  }
}

