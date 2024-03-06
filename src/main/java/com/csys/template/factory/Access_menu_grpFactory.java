package com.csys.template.factory;

import com.csys.template.domain.Access_menu_grp;
import com.csys.template.dto.Access_menu_grpDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Access_menu_grpFactory {
  public static Access_menu_grpDTO access_menu_grpToAccess_menu_grpDTO(Access_menu_grp access_menu_grp) {
    Access_menu_grpDTO access_menu_grpDTO=new Access_menu_grpDTO();
    access_menu_grpDTO.setId(access_menu_grp.getId());
    access_menu_grpDTO.setIdMenu(access_menu_grp.getIdMenu());
    access_menu_grpDTO.setIdGroupUser(access_menu_grp.getIdGroupUser());
    access_menu_grpDTO.setVisible(access_menu_grp.getVisible());
    return access_menu_grpDTO;
  }

  public static Access_menu_grp access_menu_grpDTOToAccess_menu_grp(Access_menu_grpDTO access_menu_grpDTO) {
    Access_menu_grp access_menu_grp=new Access_menu_grp();
    access_menu_grp.setId(access_menu_grpDTO.getId());
    access_menu_grp.setIdMenu(access_menu_grpDTO.getIdMenu());
    access_menu_grp.setIdGroupUser(access_menu_grpDTO.getIdGroupUser());
    access_menu_grp.setVisible(access_menu_grpDTO.getVisible());
    return access_menu_grp;
  }

  public static Collection<Access_menu_grpDTO> access_menu_grpToAccess_menu_grpDTOs(Collection<Access_menu_grp> access_menu_grps) {
    List<Access_menu_grpDTO> access_menu_grpsDTO=new ArrayList<>();
    access_menu_grps.forEach(x -> {
      access_menu_grpsDTO.add(access_menu_grpToAccess_menu_grpDTO(x));
    } );
    return access_menu_grpsDTO;
  }
}

