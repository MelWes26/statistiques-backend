package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.ADP;
import bj.finance.statistiquesbackend.repository.ADPRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ADPService {
    private final ADPRepository repository;

    public List<ADP> findAll() { return repository.findAll(); }
    public Optional<ADP> findById(Integer id) { return repository.findById(id); }
    public ADP save(ADP e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
