package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.NatureEconomique;
import bj.finance.statistiquesbackend.service.NatureEconomiqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/natures-economiques")
@RequiredArgsConstructor
public class NatureEconomiqueController {
    private final NatureEconomiqueService service;

    @GetMapping
    public List<NatureEconomique> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<NatureEconomique> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<NatureEconomique> create(@RequestBody NatureEconomique n) {
        return ResponseEntity.ok(service.save(n));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NatureEconomique> update(@PathVariable Integer id, @RequestBody NatureEconomique n) {
        n.setCodeNatEco(id);
        return ResponseEntity.ok(service.save(n));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
