package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.TypeBudget;
import bj.finance.statistiquesbackend.service.TypeBudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/types-budget")
@RequiredArgsConstructor
public class TypeBudgetController {
    private final TypeBudgetService service;

    @GetMapping
    public List<TypeBudget> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<TypeBudget> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TypeBudget> create(@RequestBody TypeBudget t) {
        return ResponseEntity.ok(service.save(t));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TypeBudget> update(@PathVariable Integer id, @RequestBody TypeBudget t) {
        t.setCodeTypeBudget(id);
        return ResponseEntity.ok(service.save(t));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
