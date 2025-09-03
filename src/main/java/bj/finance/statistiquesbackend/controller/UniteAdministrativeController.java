package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.UniteAdministrative;
import bj.finance.statistiquesbackend.service.UniteAdministrativeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unites-administratives")
@RequiredArgsConstructor
public class UniteAdministrativeController {
    private final UniteAdministrativeService service;

    @GetMapping
    public List<UniteAdministrative> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<UniteAdministrative> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UniteAdministrative> create(@RequestBody UniteAdministrative u) {
        return ResponseEntity.ok(service.save(u));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UniteAdministrative> update(@PathVariable Integer id, @RequestBody UniteAdministrative u) {
        u.setCodeUniAdmi(id);
        return ResponseEntity.ok(service.save(u));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
