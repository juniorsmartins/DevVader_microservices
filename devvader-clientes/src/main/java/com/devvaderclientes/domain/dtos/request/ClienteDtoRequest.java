package com.devvaderclientes.domain.dtos.request;

import com.devvaderclientes.domain.entities.enuns.EscolaridadeEnum;
import com.devvaderclientes.domain.entities.enuns.SexoEnum;
import lombok.Builder;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
public final class ClienteDtoRequest {

    private Long clienteId;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String dataNascimento;
    private SexoEnum sexo;
    private EscolaridadeEnum escolaridade;
    private List<ContatoDtoRequest> contatos;
    private EnderecoDtoRequest endereco;
}
