package com.aep.victor.aepprogramacao.conceito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conceitos")
public class ConceitoController {

    @Autowired
    ConceitoRepository conceitoRepository;

    @GetMapping
    public List<Conceito> getAll() {
        return conceitoRepository.findAll();
    }

    @PostMapping
    public String post(@RequestBody Conceito conceito) {
        conceitoRepository.save(conceito);
        return conceito.getId();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        conceitoRepository.deleteById(id);
    }
}