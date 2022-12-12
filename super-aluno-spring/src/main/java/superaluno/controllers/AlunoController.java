package superaluno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import superaluno.entities.AlunosEntity;
import superaluno.services.AlunoService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/alunos")
public class AlunoController {
	
	@Autowired private AlunoService alunoService;
	
	@GetMapping()
	public List<AlunosEntity> findAllAluno() {
		return this.alunoService.findAllAluno();
	}
}
