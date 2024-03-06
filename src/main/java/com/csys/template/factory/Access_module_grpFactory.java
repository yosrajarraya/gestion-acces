package com.csys.template.factory;

import com.csys.template.domain.Access_module_grp;
import com.csys.template.dto.Access_module_grpDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Access_module_grpFactory {
  public static Access_module_grpDTO access_module_grpToAccess_module_grpDTO(Access_module_grp access_module_grp) {
    Access_module_grpDTO access_module_grpDTO=new Access_module_grpDTO();
    access_module_grpDTO.setId(access_module_grp.getId());
    access_module_grpDTO.setIdModule(access_module_grp.getIdModule());
    access_module_grpDTO.setIdGroupUser(access_module_grp.getIdGroupUser());
    access_module_grpDTO.setCode(access_module_grp.getCode());
    return access_module_grpDTO;
  }

  public static Access_module_grp access_module_grpDTOToAccess_module_grp(Access_module_grpDTO access_module_grpDTO) {
    Access_module_grp access_module_grp=new Access_module_grp();
    access_module_grp.setId(access_module_grpDTO.getId());
    access_module_grp.setIdModule(access_module_grpDTO.getIdModule());
    access_module_grp.setIdGroupUser(access_module_grpDTO.getIdGroupUser());
    access_module_grp.setCode(access_module_grpDTO.getCode());
    return access_module_grp;
  }

  public static Collection<Access_module_grpDTO> access_module_grpToAccess_module_grpDTOs(Collection<Access_module_grp> access_module_grps) {
    List<Access_module_grpDTO> access_module_grpsDTO=new ArrayList<>();
    access_module_grps.forEach(x -> {
      access_module_grpsDTO.add(access_module_grpToAccess_module_grpDTO(x));
    } );
    return access_module_grpsDTO;
  }
}

