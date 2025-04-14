package br.universidade.gerenciadorpessoas.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private String nome;
    private String cpf;
    private Integer idade;
}
