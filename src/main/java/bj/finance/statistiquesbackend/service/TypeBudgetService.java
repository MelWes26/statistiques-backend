package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.TypeBudget;
import bj.finance.statistiquesbackend.repository.TypeBudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TypeBudgetService {
    private final TypeBudgetRepository repository;

    public List<TypeBudget> findAll() { return repository.findAll(); }
    public Optional<TypeBudget> findById(Integer id) { return repository.findById(id); }
    public TypeBudget save(TypeBudget e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
