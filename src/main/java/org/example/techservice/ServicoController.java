package org.example.techservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoRepository repository;

    public ServicoController(ServicoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Servico> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Servico buscar(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Servico criar(@RequestBody Servico servico) {
        return repository.save(servico);
    }

    @PutMapping("/{id}")
    public Servico atualizar(@PathVariable Long id, @RequestBody Servico servico) {
        servico.setId(id);
        return repository.save(servico);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}