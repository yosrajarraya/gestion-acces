package com.csys.template.factory;

import com.csys.template.domain.Utilisateur;
import com.csys.template.dto.UtilisateurDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UtilisateurFactory {
  public static UtilisateurDTO utilisateurToUtilisateurDTO(Utilisateur utilisateur) {
    UtilisateurDTO utilisateurDTO=new UtilisateurDTO();
<<<<<<< HEAD
    utilisateurDTO.setIdUser(utilisateur.getIdUser());
    utilisateurDTO.setCode(utilisateur.getCode());
    utilisateurDTO.setName(utilisateur.getName());
    utilisateurDTO.setDate_creation(utilisateur.getDate_creation());
    utilisateurDTO.setPassword(utilisateur.getPassword());
    utilisateurDTO.setDesignationAr(utilisateur.getDesignationAr());
    utilisateurDTO.setDesignationFr(utilisateur.getDesignationFr());
    utilisateurDTO.setDesignationEng(utilisateur.getDesignationEng());
    utilisateurDTO.setUserCreation(utilisateur.getUserCreation());
=======
    utilisateurDTO.setId_user(utilisateur.getIdUser());
    utilisateurDTO.setCode(utilisateur.getCode());
    utilisateurDTO.setName(utilisateur.getName());
    utilisateurDTO.setDateCreation(utilisateur.getDateCreation());
    utilisateurDTO.setPassword(utilisateur.getPassword());
    utilisateurDTO.setDesignation_ar(utilisateur.getDesignation_ar());
    utilisateurDTO.setDesignation_fr(utilisateur.getDesignation_fr());
    utilisateurDTO.setDesignation_eng(utilisateur.getDesignation_eng());
    utilisateurDTO.setUser_creation(utilisateur.getUser_creation());
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
    utilisateurDTO.setActive(utilisateur.getActive());
    return utilisateurDTO;
  }

  public static Utilisateur utilisateurDTOToUtilisateur(UtilisateurDTO utilisateurDTO) {
    Utilisateur utilisateur=new Utilisateur();
<<<<<<< HEAD
    utilisateur.setIdUser(utilisateurDTO.getIdUser());
    utilisateur.setCode(utilisateurDTO.getCode());
    utilisateur.setName(utilisateurDTO.getName());
    utilisateur.setDate_creation(utilisateurDTO.getDate_creation());
    utilisateur.setPassword(utilisateurDTO.getPassword());
    utilisateur.setDesignationAr(utilisateurDTO.getDesignationAr());
    utilisateur.setDesignationFr(utilisateurDTO.getDesignationFr());
    utilisateur.setDesignationEng(utilisateurDTO.getDesignationEng());
    utilisateur.setUserCreation(utilisateurDTO.getUserCreation());
=======
    utilisateur.setIdUser(utilisateurDTO.getId_user());
    utilisateur.setCode(utilisateurDTO.getCode());
    utilisateur.setName(utilisateurDTO.getName());
    utilisateur.setDateCreation(utilisateurDTO.getDateCreation());
    utilisateur.setPassword(utilisateurDTO.getPassword());
    utilisateur.setDesignation_ar(utilisateurDTO.getDesignation_ar());
    utilisateur.setDesignation_fr(utilisateurDTO.getDesignation_fr());
    utilisateur.setDesignation_eng(utilisateurDTO.getDesignation_eng());
    utilisateur.setUser_creation(utilisateurDTO.getUser_creation());
>>>>>>> a8508e1ea48a69676c6f021b457bc180e5cb8cfb
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

