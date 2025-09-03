package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.Departement;
import bj.finance.statistiquesbackend.service.DepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departements")
@RequiredArgsConstructor
public class DepartementController {
    private final DepartementService service;

    @GetMapping
    public List<Departement> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departement> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Departement> create(@RequestBody Departement d) {
        return ResponseEntity.ok(service.save(d));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Departement> update(@PathVariable Integer id, @RequestBody Departement d) {
        d.setCodeDepa(id); // ✅ correction ici
        return ResponseEntity.ok(service.save(d));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
