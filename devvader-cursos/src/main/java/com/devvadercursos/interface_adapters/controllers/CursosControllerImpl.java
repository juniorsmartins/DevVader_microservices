package com.devvadercursos.interface_adapters.controllers;

import com.devvadercursos.application_business.usecases.dtos.CursoDTO;
import com.devvadercursos.application_business.usecases.services.ServiceGenerics;
import com.devvadercursos.enterprise_business.entities.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@RequestMapping(value = "/v1/cursos")
public class CursosControllerImpl extends CursosController<CursoDTO, Long> {

    @Autowired
    private ServiceGenerics<CursoDTO, Curso, Long> serviceGenerics;

    @Override
    public ResponseEntity<CursoDTO> cadastrar(CursoDTO dtoIn) {
        return serviceGenerics.cadastrar(dtoIn);
    }

    @Override
    public ResponseEntity<?> buscarTodos(Pageable paginacao, CursoDTO filtro) {
        return null;
    }

    @Override
    public String consultarPorta(@Value("${local.server.port}") String porta) {
        return String.format("Porta: %s", porta);
    }

    @Override
    public ResponseEntity<CursoDTO> atualizarTotalOuSalvar(Long id, CursoDTO cursoDTO) {
        return null;
    }

    @Override
    ResponseEntity<CursoDTO> atualizarParcialOuLancarExcecao(Long id, CursoDTO cursoDTO) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }
}
