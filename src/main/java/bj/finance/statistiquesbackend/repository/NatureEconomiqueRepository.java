package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.NatureEconomique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NatureEconomiqueRepository extends JpaRepository<NatureEconomique, Integer> {
}
