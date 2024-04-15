package br.com.fiap.contatos.dto.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record PessoaRequest(

        @Size(min = 2, max = 25)
        @NotNull(message = "Nome é Obrigatório")
        String nome,

        @Size(min = 3, max = 255)
        String sobrenome,

        @PastOrPresent(message = "Não pode ser data no futuro!")
        LocalDate nascimento,
        @NotNull(message = "Username é obrigatório")
        @Email(message = "Email inválido!")
        String username,

        @Pattern(message = "A senha não atende aos requisitos", regexp = "/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$/")
        String password


) {
}
