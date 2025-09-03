package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.NatureDepense;
import bj.finance.statistiquesbackend.repository.NatureDepenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NatureDepenseService {
    private final NatureDepenseRepository repository;

    public List<NatureDepense> findAll() { return repository.findAll(); }
    public Optional<NatureDepense> findById(Integer id) { return repository.findById(id); }
    public NatureDepense save(NatureDepense e) { return repository.save(e); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
