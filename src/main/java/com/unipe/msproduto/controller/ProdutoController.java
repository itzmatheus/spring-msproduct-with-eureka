package com.unipe.msproduto.controller;

import com.unipe.msproduto.dto.ProdutoDTO;
import com.unipe.msproduto.entity.Produto;
import com.unipe.msproduto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produtos",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/{id}/update-quantidade")
    public ResponseEntity<String> updateQuantidade(@PathVariable Long id, @RequestBody int quantidade) {
        service.updateQuantidade(id, quantidade);
        return ResponseEntity.ok("Quantidade atualizada com sucesso!");
    }

    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody ProdutoDTO dto) {
        return ResponseEntity.ok(service.save(dto));
    }
}
