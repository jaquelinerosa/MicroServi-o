package br.com.microservice.email.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {
	
	@NotBlank
	@Email
	private String emailFrom;
	@NotBlank
	@Email	
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
}


/*Origem: Wikipédia, a enciclopédia livre.
Objeto de Transferência de Dados (do inglês, Data transfer object, ou simplesmente DTO)
,[1][2] é um padrão de projeto de software usado para transferir dados entre subsistemas
 de um software. DTOs são frequentemente usados em conjunção com objetos de acesso a
  dados para obter dados de um banco de dados.[1][2]

A diferença entre objetos de transferência de dados e objetos de negócio 
ou objetos de acesso a dados é que um DTO não possui comportamento algum,
 exceto o de armazenamento e obtenção de seus próprios dados. DTOs são objetos simples que não contêm qualquer lógica de negócio que requeira testes.[1]*/