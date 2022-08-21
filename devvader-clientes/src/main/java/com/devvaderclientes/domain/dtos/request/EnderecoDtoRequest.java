package com.devvaderclientes.domain.dtos.request;

import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public final class EnderecoDtoRequest {

    private Long enderecoId;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int numero;
    private String complemento;
}
