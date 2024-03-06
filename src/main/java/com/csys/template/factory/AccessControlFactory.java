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
    accesscontrolDTO.setUser_id(accesscontrol.getUser_id());
    accesscontrolDTO.setGroup_id(accesscontrol.getGroup_id());
    accesscontrolDTO.setCode(accesscontrol.getCode());
    accesscontrolDTO.setActive(accesscontrol.getActive());
    accesscontrolDTO.setDesignation_ar(accesscontrol.getDesignation_ar());
    accesscontrolDTO.setDesignation_fr(accesscontrol.getDesignation_fr());
    accesscontrolDTO.setDesignation_eng(accesscontrol.getDesignation_eng());
    accesscontrolDTO.setDescription(accesscontrol.getDescription());
    accesscontrolDTO.setDate_expiration(accesscontrol.getDate_expiration());
    accesscontrolDTO.setDate_creation(accesscontrol.getDate_creation());
    accesscontrolDTO.setUser_creation(accesscontrol.getUser_creation());
    return accesscontrolDTO;
  }

  public static AccessControl accesscontrolDTOToAccessControl(AccessControlDTO accesscontrolDTO) {
    AccessControl accesscontrol=new AccessControl();
    accesscontrol.setId(accesscontrolDTO.getId());
    accesscontrol.setUser_id(accesscontrolDTO.getUser_id());
    accesscontrol.setGroup_id(accesscontrolDTO.getGroup_id());
    accesscontrol.setCode(accesscontrolDTO.getCode());
    accesscontrol.setActive(accesscontrolDTO.getActive());
    accesscontrol.setDesignation_ar(accesscontrolDTO.getDesignation_ar());
    accesscontrol.setDesignation_fr(accesscontrolDTO.getDesignation_fr());
    accesscontrol.setDesignation_eng(accesscontrolDTO.getDesignation_eng());
    accesscontrol.setDescription(accesscontrolDTO.getDescription());
    accesscontrol.setDate_expiration(accesscontrolDTO.getDate_expiration());
    accesscontrol.setDate_creation(accesscontrolDTO.getDate_creation());
    accesscontrol.setUser_creation(accesscontrolDTO.getUser_creation());
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

