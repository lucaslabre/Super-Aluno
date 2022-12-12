package superaluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import superaluno.entities.AlunosEntity;

@Repository
public interface AlunoRepository extends JpaRepository<AlunosEntity, Integer> {

}
