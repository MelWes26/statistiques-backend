package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.Departement;
import bj.finance.statistiquesbackend.repository.DepartementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DepartementService {
     private final DepartementRepository repository;

    public List<Departement> findAll() { return repository.findAll(); }
    public Optional<Departement> findById(Integer id) { return repository.findById(id); }
    public Departement save(Departement e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
