package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.SourceFinancement;
import bj.finance.statistiquesbackend.repository.SourceFinancementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SourceFinancementService {
    private final SourceFinancementRepository repository;

    public List<SourceFinancement> findAll() { return repository.findAll(); }
    public Optional<SourceFinancement> findById(Integer id) { return repository.findById(id); }
    public SourceFinancement save(SourceFinancement e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
