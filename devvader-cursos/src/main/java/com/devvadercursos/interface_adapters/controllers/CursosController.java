package com.devvadercursos.interface_adapters.controllers;

import com.devvadercursos.application_business.usecases.dtos.GenericsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract sealed class CursosController<T extends GenericsDTO<ID>, F extends GenericsDTO<ID>, ID> permits CursosControllerImpl {

    @PostMapping
    abstract ResponseEntity<T> cadastrar(T dto);

    @GetMapping
    abstract ResponseEntity<Page<T>> buscarTodos(Pageable paginacao, F filtro);

    @GetMapping(value = "/{id}")
    abstract ResponseEntity<T> consultarPorId(Long id);

    @GetMapping(value = "/porta")
    abstract String consultarPorta(String porta);

    @PutMapping(value = "/{id}")
    abstract ResponseEntity<T> atualizarTotalOuSalvar(ID id, T dto);

    @PatchMapping(value = "/{id}")
    abstract ResponseEntity<T> atualizarParcialOuLancarExcecao(ID id, T dto);

    @DeleteMapping(value = "/{id}")
    abstract ResponseEntity<?> deletarPorId(ID id);
}
