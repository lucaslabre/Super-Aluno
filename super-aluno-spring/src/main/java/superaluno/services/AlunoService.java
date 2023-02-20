package superaluno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import superaluno.entities.AlunosEntity;
import superaluno.entities.dtos.AlunoEntityDTO;
import superaluno.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired private AlunoRepository alunoRepository;

	public List<AlunosEntity> findAllAluno() {
		return this.alunoRepository.findAll();
	}

	public List<AlunosEntity> findAlunoById(Integer idAluno) {
		return this.alunoRepository.findById(idAluno).stream().toList();
	}
	
	public AlunoEntityDTO createAluno(AlunoEntityDTO alunoDTO) {
		AlunosEntity aluno = this.alunoRepository.save(new AlunosEntity(alunoDTO));
		return new AlunoEntityDTO(aluno);
	}
	
}
