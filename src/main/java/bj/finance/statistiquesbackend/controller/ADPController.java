package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.ADP;
import bj.finance.statistiquesbackend.service.ADPService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adp")
@RequiredArgsConstructor
public class ADPController {
    private final ADPService service;

    @GetMapping
    public List<ADP> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<ADP> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ADP> create(@RequestBody ADP a) {
        return ResponseEntity.ok(service.save(a));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ADP> update(@PathVariable Integer id, @RequestBody ADP a) {
        a.setCodeADP(id);
        return ResponseEntity.ok(service.save(a));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
