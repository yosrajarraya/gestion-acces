package com.csys.template.factory;

import com.csys.template.domain.Clinique;
import com.csys.template.dto.CliniqueDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CliniqueFactory {
  public static CliniqueDTO cliniqueToCliniqueDTO(Clinique clinique) {
    CliniqueDTO cliniqueDTO=new CliniqueDTO();
    cliniqueDTO.setId_clinique(clinique.getId_clinique());
    cliniqueDTO.setName(clinique.getName());
    cliniqueDTO.setId_user(clinique.getId_user());
    return cliniqueDTO;
  }

  public static Clinique cliniqueDTOToClinique(CliniqueDTO cliniqueDTO) {
    Clinique clinique=new Clinique();
//    clinique.setId_clinique(cliniqueDTO.getId_clinique());
    clinique.setName(cliniqueDTO.getName());
    clinique.setId_user(cliniqueDTO.getId_user());
    return clinique;
  }

  public static Collection<CliniqueDTO> cliniqueToCliniqueDTOs(Collection<Clinique> cliniques) {
    List<CliniqueDTO> cliniquesDTO=new ArrayList<>();
    cliniques.forEach(x -> {
      cliniquesDTO.add(cliniqueToCliniqueDTO(x));
    } );
    return cliniquesDTO;
  }
}

