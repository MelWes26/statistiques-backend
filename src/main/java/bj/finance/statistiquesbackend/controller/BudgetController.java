package bj.finance.statistiquesbackend.controller;

import bj.finance.statistiquesbackend.dto.DashboardDataDTO;
import bj.finance.statistiquesbackend.entity.Budget;
import bj.finance.statistiquesbackend.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200") // This is the key fix
public class BudgetController {
    private final BudgetService service;

    @GetMapping
    public List<Budget> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Budget> getById(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping("/data")
    public DashboardDataDTO getDashboardData(@RequestParam(name = "year") Integer year) {
        return service.getDashboardDataByYear(year);
    }

    @PostMapping
    public ResponseEntity<Budget> create(@RequestBody Budget b) {
        return ResponseEntity.ok(service.save(b));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Budget> update(@PathVariable Long id, @RequestBody Budget b) {
        b.setIdExercice(id);
        return ResponseEntity.ok(service.save(b));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
