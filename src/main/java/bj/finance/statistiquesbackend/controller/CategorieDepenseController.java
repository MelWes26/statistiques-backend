package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.CategorieDepense;
import bj.finance.statistiquesbackend.service.CategorieDepenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories-depense")
@RequiredArgsConstructor
public class CategorieDepenseController {
    private final CategorieDepenseService service;

    @GetMapping
    public List<CategorieDepense> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<CategorieDepense> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CategorieDepense> create(@RequestBody CategorieDepense c) {
        return ResponseEntity.ok(service.save(c));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategorieDepense> update(@PathVariable Integer id, @RequestBody CategorieDepense c) {
        c.setCodeCatDep(id);
        return ResponseEntity.ok(service.save(c));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
