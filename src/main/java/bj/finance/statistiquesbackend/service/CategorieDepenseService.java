package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.CategorieDepense;
import bj.finance.statistiquesbackend.repository.CategorieDepenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategorieDepenseService {
    private final CategorieDepenseRepository repository;

    public List<CategorieDepense> findAll() { return repository.findAll(); }
    public Optional<CategorieDepense> findById(Integer id) { return repository.findById(id); }
    public CategorieDepense save(CategorieDepense e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
