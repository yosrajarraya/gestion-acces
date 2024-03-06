package com.csys.template.factory;

import com.csys.template.domain.Utilisateur;
import com.csys.template.dto.UtilisateurDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UtilisateurFactory {
  public static UtilisateurDTO utilisateurToUtilisateurDTO(Utilisateur utilisateur) {
    UtilisateurDTO utilisateurDTO=new UtilisateurDTO();
    utilisateurDTO.setId_user(utilisateur.getIdUser());
    utilisateurDTO.setCode(utilisateur.getCode());
    utilisateurDTO.setName(utilisateur.getName());
    utilisateurDTO.setDateCreation(utilisateur.getDateCreation());
    utilisateurDTO.setPassword(utilisateur.getPassword());
    utilisateurDTO.setDesignation_ar(utilisateur.getDesignation_ar());
    utilisateurDTO.setDesignation_fr(utilisateur.getDesignation_fr());
    utilisateurDTO.setDesignation_eng(utilisateur.getDesignation_eng());
    utilisateurDTO.setUser_creation(utilisateur.getUser_creation());
    utilisateurDTO.setActive(utilisateur.getActive());
    return utilisateurDTO;
  }

  public static Utilisateur utilisateurDTOToUtilisateur(UtilisateurDTO utilisateurDTO) {
    Utilisateur utilisateur=new Utilisateur();
    utilisateur.setIdUser(utilisateurDTO.getId_user());
    utilisateur.setCode(utilisateurDTO.getCode());
    utilisateur.setName(utilisateurDTO.getName());
    utilisateur.setDateCreation(utilisateurDTO.getDateCreation());
    utilisateur.setPassword(utilisateurDTO.getPassword());
    utilisateur.setDesignation_ar(utilisateurDTO.getDesignation_ar());
    utilisateur.setDesignation_fr(utilisateurDTO.getDesignation_fr());
    utilisateur.setDesignation_eng(utilisateurDTO.getDesignation_eng());
    utilisateur.setUser_creation(utilisateurDTO.getUser_creation());
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

