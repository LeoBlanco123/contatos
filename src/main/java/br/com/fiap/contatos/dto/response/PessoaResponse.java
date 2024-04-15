package br.com.fiap.contatos.dto.response;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PessoaResponse(

        Long id,

        String nome,

        String sobrenome,

        LocalDate nascimento,

        String username

) {
}
