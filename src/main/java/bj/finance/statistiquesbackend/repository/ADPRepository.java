package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.ADP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ADPRepository extends JpaRepository<ADP, Integer> {
}
