package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.Bailleur;
import bj.finance.statistiquesbackend.repository.BailleurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BailleurService {
    private final BailleurRepository repository;

    public List<Bailleur> findAll() { return repository.findAll(); }
    public Optional<Bailleur> findById(Integer id) { return repository.findById(id); }
    public Bailleur save(Bailleur e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
