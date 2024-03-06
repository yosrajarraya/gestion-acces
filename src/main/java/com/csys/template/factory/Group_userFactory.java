package com.csys.template.factory;

import com.csys.template.domain.Group_user;
import com.csys.template.dto.Group_userDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Group_userFactory {
  public static Group_userDTO group_userToGroup_userDTO(Group_user group_user) {
    Group_userDTO group_userDTO=new Group_userDTO();
    group_userDTO.setId_group(group_user.getId_group());
    group_userDTO.setName(group_user.getName());
    group_userDTO.setCode(group_user.getCode());
    group_userDTO.setDesignation_ar(group_user.getDesignation_ar());
    group_userDTO.setDesignation_fr(group_user.getDesignation_fr());
    group_userDTO.setDesignation_eng(group_user.getDesignation_eng());
    group_userDTO.setActive(group_user.getActive());
    group_userDTO.setUserCreation(group_user.getUserCreation());
    group_userDTO.setDateCreation(group_user.getDateCreation());
    return group_userDTO;
  }

  public static Group_user group_userDTOToGroup_user(Group_userDTO group_userDTO) {
    Group_user group_user=new Group_user();
    group_user.setId_group(group_userDTO.getId_group());
    group_user.setName(group_userDTO.getName());
    group_user.setCode(group_userDTO.getCode());
    group_user.setDesignation_ar(group_userDTO.getDesignation_ar());
    group_user.setDesignation_fr(group_userDTO.getDesignation_fr());
    group_user.setDesignation_eng(group_userDTO.getDesignation_eng());
    group_user.setActive(group_userDTO.getActive());
    group_user.setUserCreation(group_userDTO.getUserCreation());
    group_user.setDateCreation(group_userDTO.getDateCreation());
    return group_user;
  }

  public static Collection<Group_userDTO> group_userToGroup_userDTOs(Collection<Group_user> group_users) {
    List<Group_userDTO> group_usersDTO=new ArrayList<>();
    group_users.forEach(x -> {
      group_usersDTO.add(group_userToGroup_userDTO(x));
    } );
    return group_usersDTO;
  }
}

