package com.csys.template.factory;

import com.csys.template.domain.Clinique;
import com.csys.template.dto.CliniqueDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CliniqueFactory {
  public static CliniqueDTO cliniqueToCliniqueDTO(Clinique clinique) {
    CliniqueDTO cliniqueDTO=new CliniqueDTO();
//    cliniqueDTO.setId_clinique(clinique.getId_clinique());
    cliniqueDTO.setId_user(clinique.getId_user());
    cliniqueDTO.setName(clinique.getName());
    return cliniqueDTO;
  }

  public static Clinique cliniqueDTOToClinique(CliniqueDTO cliniqueDTO) {
    Clinique clinique=new Clinique();
//    clinique.setId_clinique(cliniqueDTO.getId_clinique());
    clinique.setId_user(cliniqueDTO.getId_user());
    clinique.setName(cliniqueDTO.getName());
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

