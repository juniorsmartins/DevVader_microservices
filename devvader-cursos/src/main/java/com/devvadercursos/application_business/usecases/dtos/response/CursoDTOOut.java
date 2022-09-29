package com.devvadercursos.application_business.usecases.dtos.response;

import com.devvadercursos.enterprise_business.entities.Entidade;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class CursoDTOOut extends DTOOut<Long> implements Serializable {

    private Long id;
    private String titulo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Long clienteId;
}
