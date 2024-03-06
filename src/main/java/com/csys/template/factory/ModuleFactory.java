package com.csys.template.factory;

import com.csys.template.domain.Module;
import com.csys.template.dto.ModuleDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModuleFactory {
  public static ModuleDTO moduleToModuleDTO(Module module) {
    ModuleDTO moduleDTO=new ModuleDTO();
    moduleDTO.setIdModule(module.getIdModule());
    moduleDTO.setCodeModule(module.getCodeModule());
    moduleDTO.setDesignationAr(module.getDesignationAr());
    moduleDTO.setDesignationFr(module.getDesignationFr());
    moduleDTO.setDesignationEng(module.getDesignationEng());
    moduleDTO.setActive(module.getActive());
    moduleDTO.setVersionDatabase(module.getVersionDatabase());
    moduleDTO.setUrlWeb(module.getUrlWeb());
    return moduleDTO;
  }

  public static Module moduleDTOToModule(ModuleDTO moduleDTO) {
    Module module=new Module();
    module.setIdModule(moduleDTO.getIdModule());
    module.setCodeModule(moduleDTO.getCodeModule());
    module.setDesignationAr(moduleDTO.getDesignationAr());
    module.setDesignationFr(moduleDTO.getDesignationFr());
    module.setDesignationEng(moduleDTO.getDesignationEng());
    module.setActive(moduleDTO.getActive());
    module.setVersionDatabase(moduleDTO.getVersionDatabase());
    module.setUrlWeb(moduleDTO.getUrlWeb());
    return module;
  }

  public static Collection<ModuleDTO> moduleToModuleDTOs(Collection<Module> modules) {
    List<ModuleDTO> modulesDTO=new ArrayList<>();
    modules.forEach(x -> {
      modulesDTO.add(moduleToModuleDTO(x));
    } );
    return modulesDTO;
  }
}

