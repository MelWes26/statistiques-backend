package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.Bailleur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BailleurRepository extends JpaRepository<Bailleur, Integer> {
}
