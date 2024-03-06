package com.csys.template.service;

import com.csys.template.domain.Module;
import com.csys.template.dto.ModuleDTO;
import com.csys.template.factory.ModuleFactory;
import com.csys.template.repository.ModuleRepository;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Module.
 */
@Service
@Transactional
public class ModuleService {
  private final Logger log = LoggerFactory.getLogger(ModuleService.class);

  private final ModuleRepository moduleRepository;

  public ModuleService(ModuleRepository moduleRepository) {
    this.moduleRepository=moduleRepository;
  }

  /**
   * Save a moduleDTO.
   *
   * @param moduleDTO
   * @return the persisted entity
   */
  public ModuleDTO save(ModuleDTO moduleDTO) {
    log.debug("Request to save Module: {}",moduleDTO);
    Module module = ModuleFactory.moduleDTOToModule(moduleDTO);
    module = moduleRepository.save(module);
    ModuleDTO resultDTO = ModuleFactory.moduleToModuleDTO(module);
    return resultDTO;
  }

  /**
   * Update a moduleDTO.
   *
   * @param moduleDTO
   * @return the updated entity
   */
@Transactional
public ModuleDTO update(ModuleDTO moduleDTO) {
    log.debug("Request to update Module: {}",moduleDTO);
    Optional<Module> moduleOptional = moduleRepository.findById(moduleDTO.getIdModule());
    Module inBase = moduleOptional.orElseThrow(() -> new IllegalArgumentException("module.NotFound"));
    Module module = ModuleFactory.moduleDTOToModule(moduleDTO);
    module = moduleRepository.save(module);
    ModuleDTO resultDTO = ModuleFactory.moduleToModuleDTO(module);
    return resultDTO;
}


  /**
   * Get one moduleDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
@Transactional(readOnly = true)
public ModuleDTO findOne(Integer id) {
    log.debug("Request to get Module: {}",id);
    Optional<Module> moduleOptional = moduleRepository.findById(id);
    Module module = moduleOptional.orElse(null);
    return module != null ? ModuleFactory.moduleToModuleDTO(module) : null;
}


  /**
   * Get one module by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
@Transactional(readOnly = true)
public Module findModule(Integer id) {
    log.debug("Request to get Module: {}",id);
    Optional<Module> moduleOptional = moduleRepository.findById(id);
    return moduleOptional.orElse(null);
}


  /**
   * Get all the modules.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public Collection<ModuleDTO> findAll() {
    log.debug("Request to get All Modules");
    Collection<Module> result= moduleRepository.findAll();
    return ModuleFactory.moduleToModuleDTOs(result);
  }

  /**
   * Delete module by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Module: {}",id);
    moduleRepository.deleteById(id);
  }
}

