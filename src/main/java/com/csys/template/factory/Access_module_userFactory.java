package com.csys.template.factory;

import com.csys.template.domain.Access_module_user;
import com.csys.template.dto.Access_module_userDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Access_module_userFactory {
  public static Access_module_userDTO access_module_userToAccess_module_userDTO(Access_module_user access_module_user) {
    Access_module_userDTO access_module_userDTO=new Access_module_userDTO();
    access_module_userDTO.setId(access_module_user.getId());
    access_module_userDTO.setIdModule(access_module_user.getIdModule());
    access_module_userDTO.setIdUser(access_module_user.getIdUser());
    access_module_userDTO.setCode(access_module_user.getCode());
    return access_module_userDTO;
  }

  public static Access_module_user access_module_userDTOToAccess_module_user(Access_module_userDTO access_module_userDTO) {
    Access_module_user access_module_user=new Access_module_user();
    access_module_user.setId(access_module_userDTO.getId());
    access_module_user.setIdModule(access_module_userDTO.getIdModule());
    access_module_user.setIdUser(access_module_userDTO.getIdUser());
    access_module_user.setCode(access_module_userDTO.getCode());
    return access_module_user;
  }

  public static Collection<Access_module_userDTO> access_module_userToAccess_module_userDTOs(Collection<Access_module_user> access_module_users) {
    List<Access_module_userDTO> access_module_usersDTO=new ArrayList<>();
    access_module_users.forEach(x -> {
      access_module_usersDTO.add(access_module_userToAccess_module_userDTO(x));
    } );
    return access_module_usersDTO;
  }
}

