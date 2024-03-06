package com.csys.template.factory;

import com.csys.template.domain.Utilisateur;
import com.csys.template.dto.UtilisateurDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UtilisateurFactory {
  public static UtilisateurDTO utilisateurToUtilisateurDTO(Utilisateur utilisateur) {
    UtilisateurDTO utilisateurDTO=new UtilisateurDTO();
    utilisateurDTO.setIdUser(utilisateur.getIdUser());
    utilisateurDTO.setCode(utilisateur.getCode());
    utilisateurDTO.setName(utilisateur.getName());
    utilisateurDTO.setDate_creation(utilisateur.getDate_creation());
    utilisateurDTO.setPassword(utilisateur.getPassword());
    utilisateurDTO.setDesignationAr(utilisateur.getDesignationAr());
    utilisateurDTO.setDesignationFr(utilisateur.getDesignationFr());
    utilisateurDTO.setDesignationEng(utilisateur.getDesignationEng());
    utilisateurDTO.setUserCreation(utilisateur.getUserCreation());
    utilisateurDTO.setActive(utilisateur.getActive());
    return utilisateurDTO;
  }

  public static Utilisateur utilisateurDTOToUtilisateur(UtilisateurDTO utilisateurDTO) {
    Utilisateur utilisateur=new Utilisateur();
    utilisateur.setIdUser(utilisateurDTO.getIdUser());
    utilisateur.setCode(utilisateurDTO.getCode());
    utilisateur.setName(utilisateurDTO.getName());
    utilisateur.setDate_creation(utilisateurDTO.getDate_creation());
    utilisateur.setPassword(utilisateurDTO.getPassword());
    utilisateur.setDesignationAr(utilisateurDTO.getDesignationAr());
    utilisateur.setDesignationFr(utilisateurDTO.getDesignationFr());
    utilisateur.setDesignationEng(utilisateurDTO.getDesignationEng());
    utilisateur.setUserCreation(utilisateurDTO.getUserCreation());
    utilisateur.setActive(utilisateurDTO.getActive());
    return utilisateur;
  }

  public static Collection<UtilisateurDTO> utilisateurToUtilisateurDTOs(Collection<Utilisateur> utilisateurs) {
    List<UtilisateurDTO> utilisateursDTO=new ArrayList<>();
    utilisateurs.forEach(x -> {
      utilisateursDTO.add(utilisateurToUtilisateurDTO(x));
    } );
    return utilisateursDTO;
  }
}

