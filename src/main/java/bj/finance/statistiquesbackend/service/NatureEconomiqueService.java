package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.NatureEconomique;
import bj.finance.statistiquesbackend.repository.NatureEconomiqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NatureEconomiqueService {
    private final NatureEconomiqueRepository repository;

    public List<NatureEconomique> findAll() { return repository.findAll(); }
    public Optional<NatureEconomique> findById(Integer id) { return repository.findById(id); }
    public NatureEconomique save(NatureEconomique e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
