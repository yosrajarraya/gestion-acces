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
    accesscontrolDTO.setCode(accesscontrol.getCode());
    accesscontrolDTO.setActive(accesscontrol.getActive());
    accesscontrolDTO.setDesignation_ar(accesscontrol.getDesignation_ar());
    accesscontrolDTO.setDesignation_fr(accesscontrol.getDesignation_fr());
    accesscontrolDTO.setDesignation_eng(accesscontrol.getDesignation_eng());
    accesscontrolDTO.setUser(accesscontrol.getUser());
    accesscontrolDTO.setGroup(accesscontrol.getGroup());
    return accesscontrolDTO;
  }

  public static AccessControl accesscontrolDTOToAccessControl(AccessControlDTO accesscontrolDTO) {
    AccessControl accesscontrol=new AccessControl();
    accesscontrol.setId(accesscontrolDTO.getId());
    accesscontrol.setCode(accesscontrolDTO.getCode());
    accesscontrol.setActive(accesscontrolDTO.getActive());
    accesscontrol.setDesignation_ar(accesscontrolDTO.getDesignation_ar());
    accesscontrol.setDesignation_fr(accesscontrolDTO.getDesignation_fr());
    accesscontrol.setDesignation_eng(accesscontrolDTO.getDesignation_eng());
    accesscontrol.setUser(accesscontrolDTO.getUser());
    accesscontrol.setGroup(accesscontrolDTO.getGroup());
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

