package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.NatureDepense;
import bj.finance.statistiquesbackend.service.NatureDepenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/natures-depense")
@RequiredArgsConstructor
public class NatureDepenseController {
    private final NatureDepenseService service;

    @GetMapping
    public List<NatureDepense> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<NatureDepense> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<NatureDepense> create(@RequestBody NatureDepense n) {
        return ResponseEntity.ok(service.save(n));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NatureDepense> update(@PathVariable Integer id, @RequestBody NatureDepense n) {
        n.setCodeNatDep(id);
        return ResponseEntity.ok(service.save(n));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
