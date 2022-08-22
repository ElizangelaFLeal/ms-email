package com.ms.email.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data
public class EmailDto {

    @NotBlank/*Anotação para que o camo seja obrigatório e não possa ser enviado em branco*/
    private String ownerRef;
    @NotBlank
    @Email/*Anotação para validar se é um email válido*/
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
