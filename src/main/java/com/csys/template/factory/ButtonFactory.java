package com.csys.template.factory;

import com.csys.template.domain.Button;
import com.csys.template.dto.ButtonDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ButtonFactory {
  public static ButtonDTO buttonToButtonDTO(Button button) {
    ButtonDTO buttonDTO=new ButtonDTO();
    buttonDTO.setIdButton(button.getIdButton());
    buttonDTO.setName(button.getName());
    buttonDTO.setCodeButton(button.getCodeButton());
    buttonDTO.setCodeButtonPrincipal(button.getCodeButtonPrincipal());
    buttonDTO.setOrder(button.getOrder());
    buttonDTO.setDesignationAr(button.getDesignationAr());
    buttonDTO.setDesignationFr(button.getDesignationFr());
    buttonDTO.setDesignationEng(button.getDesignationEng());
    buttonDTO.setLogo(button.getLogo());
    buttonDTO.setIdMenu(button.getIdMenu());
    return buttonDTO;
  }

  public static Button buttonDTOToButton(ButtonDTO buttonDTO) {
    Button button=new Button();
    button.setIdButton(buttonDTO.getIdButton());
    button.setName(buttonDTO.getName());
    button.setCodeButton(buttonDTO.getCodeButton());
    button.setCodeButtonPrincipal(buttonDTO.getCodeButtonPrincipal());
    button.setOrder(buttonDTO.getOrder());
    button.setDesignationAr(buttonDTO.getDesignationAr());
    button.setDesignationFr(buttonDTO.getDesignationFr());
    button.setDesignationEng(buttonDTO.getDesignationEng());
    button.setLogo(buttonDTO.getLogo());
    button.setIdMenu(buttonDTO.getIdMenu());
    return button;
  }

  public static Collection<ButtonDTO> buttonToButtonDTOs(Collection<Button> buttons) {
    List<ButtonDTO> buttonsDTO=new ArrayList<>();
    buttons.forEach(x -> {
      buttonsDTO.add(buttonToButtonDTO(x));
    } );
    return buttonsDTO;
  }
}

