package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.UniteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteAdministrativeRepository extends JpaRepository<UniteAdministrative, Integer> {
}
