package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.UniteAdministrative;
import bj.finance.statistiquesbackend.repository.UniteAdministrativeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UniteAdministrativeService {
    private final UniteAdministrativeRepository repository;

    public List<UniteAdministrative> findAll() { return repository.findAll(); }
    public Optional<UniteAdministrative> findById(Integer id) { return repository.findById(id); }
    public UniteAdministrative save(UniteAdministrative e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
