package io.crudcursos.domain.controller;

import io.crudcursos.domain.dto.AssuntoDTO;
import io.crudcursos.domain.entity.AssuntoEntity;
import io.crudcursos.domain.entity.filtros.AssuntoFiltro;
import io.crudcursos.domain.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "${app.api.base}/assuntos")
public final class AssuntoController extends AController<AssuntoDTO, AssuntoFiltro, Long> {

    @Autowired
    private AService<AssuntoDTO, AssuntoEntity, AssuntoFiltro, Long> service;

    @Override
    public ResponseEntity<AssuntoDTO> criar(@RequestBody @Valid AssuntoDTO dto) {
        return this.service.criar(dto);
    }

    @Override
    public ResponseEntity<Page<AssuntoDTO>> buscarTodos(AssuntoFiltro filtro,
            @PageableDefault(sort = "id", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao) {
        return this.service.buscarTodos(filtro, paginacao);
    }

    @Override
    public ResponseEntity<AssuntoDTO> consultarPorId(@PathVariable(value = "id") Long id) {
        return this.service.consultarPorId(id);
    }

    @Override
    public ResponseEntity<AssuntoDTO> atualizar(@PathVariable(value = "id") Long id, @RequestBody @Valid AssuntoDTO dto) {
        return this.service.atualizar(id, dto);
    }

    @Override
    public ResponseEntity<?> deletarPorId(@PathVariable(value = "id") Long id) {
        return this.service.deletarPorId(id);
    }
}