package br.com.fiap.contatos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TBL_2TDSPF_PESSOA",
uniqueConstraints = {
        @UniqueConstraint(name = "UK_USERNAME", columnNames = {"USERNAME"})
}

)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PESSOA")
    @SequenceGenerator(name = "SQ_PESSOA", sequenceName = "SQ_PESSOA", allocationSize = 1)
    @Column(name = "ID_PESSOA")
    private Long id;

    @Column(name = "NM_PESSOA")
    private String nome;

    @Column(name = "SBN_PESSOA")
    private String sobrenome;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate nascimento;

    @Column(name = "USERNAME")
    private String username;

    private String password;

}
