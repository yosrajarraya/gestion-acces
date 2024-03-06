package com.csys.template.factory;

import com.csys.template.domain.AccessControl;
import com.csys.template.dto.AccessControlDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccessControlFactory {
  public static AccessControlDTO accesscontrolToAccessControlDTO(AccessControl accesscontrol) {
    AccessControlDTO accesscontrolDTO=new AccessControlDTO();
    accesscontrolDTO.setId(accesscontrol.getId());
<<<<<<< HEAD
    accesscontrolDTO.setUser_id(accesscontrol.getUser_id());
    accesscontrolDTO.setGroup_id(accesscontrol.getGroup_id());
=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    accesscontrolDTO.setCode(accesscontrol.getCode());
    accesscontrolDTO.setActive(accesscontrol.getActive());
    accesscontrolDTO.setDesignation_ar(accesscontrol.getDesignation_ar());
    accesscontrolDTO.setDesignation_fr(accesscontrol.getDesignation_fr());
    accesscontrolDTO.setDesignation_eng(accesscontrol.getDesignation_eng());
<<<<<<< HEAD
    accesscontrolDTO.setDescription(accesscontrol.getDescription());
    accesscontrolDTO.setDate_expiration(accesscontrol.getDate_expiration());
    accesscontrolDTO.setDate_creation(accesscontrol.getDate_creation());
    accesscontrolDTO.setUser_creation(accesscontrol.getUser_creation());
=======
    accesscontrolDTO.setUser(accesscontrol.getUser());
    accesscontrolDTO.setGroup(accesscontrol.getGroup());
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    return accesscontrolDTO;
  }

  public static AccessControl accesscontrolDTOToAccessControl(AccessControlDTO accesscontrolDTO) {
    AccessControl accesscontrol=new AccessControl();
    accesscontrol.setId(accesscontrolDTO.getId());
<<<<<<< HEAD
    accesscontrol.setUser_id(accesscontrolDTO.getUser_id());
    accesscontrol.setGroup_id(accesscontrolDTO.getGroup_id());
=======
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    accesscontrol.setCode(accesscontrolDTO.getCode());
    accesscontrol.setActive(accesscontrolDTO.getActive());
    accesscontrol.setDesignation_ar(accesscontrolDTO.getDesignation_ar());
    accesscontrol.setDesignation_fr(accesscontrolDTO.getDesignation_fr());
    accesscontrol.setDesignation_eng(accesscontrolDTO.getDesignation_eng());
<<<<<<< HEAD
    accesscontrol.setDescription(accesscontrolDTO.getDescription());
    accesscontrol.setDate_expiration(accesscontrolDTO.getDate_expiration());
    accesscontrol.setDate_creation(accesscontrolDTO.getDate_creation());
    accesscontrol.setUser_creation(accesscontrolDTO.getUser_creation());
=======
    accesscontrol.setUser(accesscontrolDTO.getUser());
    accesscontrol.setGroup(accesscontrolDTO.getGroup());
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    return accesscontrol;
  }

  public static Collection<AccessControlDTO> accesscontrolToAccessControlDTOs(Collection<AccessControl> accesscontrols) {
    List<AccessControlDTO> accesscontrolsDTO=new ArrayList<>();
    accesscontrols.forEach(x -> {
      accesscontrolsDTO.add(accesscontrolToAccessControlDTO(x));
    } );
    return accesscontrolsDTO;
  }
}

