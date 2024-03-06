package com.csys.template.factory;

import com.csys.template.domain.Access_button_user;
import com.csys.template.dto.Access_button_userDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Access_button_userFactory {
  public static Access_button_userDTO access_button_userToAccess_button_userDTO(Access_button_user access_button_user) {
    Access_button_userDTO access_button_userDTO=new Access_button_userDTO();
    access_button_userDTO.setId(access_button_user.getId());
    access_button_userDTO.setButton(access_button_user.getButton());
    access_button_userDTO.setUser(access_button_user.getUser());
    access_button_userDTO.setName(access_button_user.getName());
    access_button_userDTO.setCode(access_button_user.getCode());
    access_button_userDTO.setActive(access_button_user.getActive());
    access_button_userDTO.setDesignationAr(access_button_user.getDesignationAr());
    access_button_userDTO.setDesignationFr(access_button_user.getDesignationFr());
    access_button_userDTO.setDesignationEng(access_button_user.getDesignationEng());
    access_button_userDTO.setVisible(access_button_user.getVisible());
    access_button_userDTO.setControl(access_button_user.getControl());
    access_button_userDTO.setNumDelegate(access_button_user.getNumDelegate());
    return access_button_userDTO;
  }

  public static Access_button_user access_button_userDTOToAccess_button_user(Access_button_userDTO access_button_userDTO) {
    Access_button_user access_button_user=new Access_button_user();
//    access_button_user.setId(access_button_userDTO.getId());
    access_button_user.setButton(access_button_userDTO.getButton());
    access_button_user.setUser(access_button_userDTO.getUser());
    access_button_user.setName(access_button_userDTO.getName());
    access_button_user.setCode(access_button_userDTO.getCode());
    access_button_user.setActive(access_button_userDTO.getActive());
    access_button_user.setDesignationAr(access_button_userDTO.getDesignationAr());
    access_button_user.setDesignationFr(access_button_userDTO.getDesignationFr());
    access_button_user.setDesignationEng(access_button_userDTO.getDesignationEng());
    access_button_user.setVisible(access_button_userDTO.getVisible());
    access_button_user.setControl(access_button_userDTO.getControl());
    access_button_user.setNumDelegate(access_button_userDTO.getNumDelegate());
    return access_button_user;
  }

  public static Collection<Access_button_userDTO> access_button_userToAccess_button_userDTOs(Collection<Access_button_user> access_button_users) {
    List<Access_button_userDTO> access_button_usersDTO=new ArrayList<>();
    access_button_users.forEach(x -> {
      access_button_usersDTO.add(access_button_userToAccess_button_userDTO(x));
    } );
    return access_button_usersDTO;
  }
}

