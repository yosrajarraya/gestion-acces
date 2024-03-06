package com.csys.template.factory;

import com.csys.template.domain.Access_button_grp;
import com.csys.template.dto.Access_button_grpDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Access_button_grpFactory {
  public static Access_button_grpDTO access_button_grpToAccess_button_grpDTO(Access_button_grp access_button_grp) {
    Access_button_grpDTO access_button_grpDTO=new Access_button_grpDTO();
    access_button_grpDTO.setId(access_button_grp.getId());
    access_button_grpDTO.setIdButton(access_button_grp.getIdButton());
    access_button_grpDTO.setIdGroup(access_button_grp.getIdGroup());
    access_button_grpDTO.setName(access_button_grp.getName());
    access_button_grpDTO.setCode(access_button_grp.getCode());
    access_button_grpDTO.setActive(access_button_grp.getActive());
    access_button_grpDTO.setDesignationAr(access_button_grp.getDesignationAr());
    access_button_grpDTO.setDesignationFr(access_button_grp.getDesignationFr());
    access_button_grpDTO.setDesignationEng(access_button_grp.getDesignationEng());
    access_button_grpDTO.setVisible(access_button_grp.getVisible());
    access_button_grpDTO.setControl(access_button_grp.getControl());
    return access_button_grpDTO;
  }

  public static Access_button_grp access_button_grpDTOToAccess_button_grp(Access_button_grpDTO access_button_grpDTO) {
    Access_button_grp access_button_grp=new Access_button_grp();
    access_button_grp.setId(access_button_grpDTO.getId());
    access_button_grp.setIdButton(access_button_grpDTO.getIdButton());
    access_button_grp.setIdGroup(access_button_grpDTO.getIdGroup());
    access_button_grp.setName(access_button_grpDTO.getName());
    access_button_grp.setCode(access_button_grpDTO.getCode());
    access_button_grp.setActive(access_button_grpDTO.getActive());
    access_button_grp.setDesignationAr(access_button_grpDTO.getDesignationAr());
    access_button_grp.setDesignationFr(access_button_grpDTO.getDesignationFr());
    access_button_grp.setDesignationEng(access_button_grpDTO.getDesignationEng());
    access_button_grp.setVisible(access_button_grpDTO.getVisible());
    access_button_grp.setControl(access_button_grpDTO.getControl());
    return access_button_grp;
  }

  public static Collection<Access_button_grpDTO> access_button_grpToAccess_button_grpDTOs(Collection<Access_button_grp> access_button_grps) {
    List<Access_button_grpDTO> access_button_grpsDTO=new ArrayList<>();
    access_button_grps.forEach(x -> {
      access_button_grpsDTO.add(access_button_grpToAccess_button_grpDTO(x));
    } );
    return access_button_grpsDTO;
  }
}

