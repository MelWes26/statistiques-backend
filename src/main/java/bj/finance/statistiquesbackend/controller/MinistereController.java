package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.entity.Ministere;
import bj.finance.statistiquesbackend.service.MinistereService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ministeres")
@RequiredArgsConstructor
public class MinistereController {
    private final MinistereService service;

    @GetMapping
    public List<Ministere> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Ministere> getById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Ministere> create(@RequestBody Ministere m) {
        return ResponseEntity.ok(service.save(m));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ministere> update(@PathVariable Integer id, @RequestBody Ministere m) {
        m.setCodeMini(id);
        return ResponseEntity.ok(service.save(m));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
