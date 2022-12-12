package superaluno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import superaluno.entities.AlunosEntity;
import superaluno.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired private AlunoRepository alunoRepository;

	public List<AlunosEntity> findAllAluno() {
		return this.alunoRepository.findAll();
	}
	
	
}
