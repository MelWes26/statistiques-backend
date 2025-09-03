package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.Bailleur;
import bj.finance.statistiquesbackend.service.BailleurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bailleurs")
@RequiredArgsConstructor
public class BailleurController {
    private final BailleurService service;

    @GetMapping
    public List<Bailleur> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Bailleur> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Bailleur> create(@RequestBody Bailleur b) {
        return ResponseEntity.ok(service.save(b));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bailleur> update(@PathVariable Integer id, @RequestBody Bailleur b) {
        b.setCodeBailleur(id);
        return ResponseEntity.ok(service.save(b));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
