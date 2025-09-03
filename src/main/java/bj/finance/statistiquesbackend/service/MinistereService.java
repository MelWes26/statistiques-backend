package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.entity.Ministere;
import bj.finance.statistiquesbackend.repository.MinistereRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MinistereService {
    private final MinistereRepository repository;

    public List<Ministere> findAll() { return repository.findAll(); }
    public Optional<Ministere> findById(Integer id) { return repository.findById(id); }
    public Ministere save(Ministere m) { return repository.save(m); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
