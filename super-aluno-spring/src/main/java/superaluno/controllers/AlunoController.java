package superaluno.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import superaluno.SuperAlunoApplication;
import superaluno.entities.AlunosEntity;
import superaluno.entities.dtos.AlunoEntityDTO;
import superaluno.services.AlunoService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/alunos")
public class AlunoController {
	
	private static Logger logger = LoggerFactory.getLogger(SuperAlunoApplication.class);
	
	@Autowired private AlunoService alunoService;
	
	@GetMapping()
	public List<AlunosEntity> findAllAluno() {
		try {
			logger.info("Ativando método findAllAluno()");
			return this.alunoService.findAllAluno();
		}
		catch(Exception e) {
			logger.info(e.toString());
			return null;
		}
		
	}
	
	@GetMapping("/{idAluno}")
	public List<AlunosEntity> findAlunoById(@PathVariable Integer idAluno) {
		try {
			logger.info("Ativando método findAlunoById()");
			return this.alunoService.findAlunoById(idAluno);
		}
		catch(Exception e) {
			logger.info(e.toString());
			return null;
		}
		
	}
	
	@PostMapping()
	public AlunoEntityDTO createAluno(@RequestBody AlunoEntityDTO alunoDTO) {
		return this.alunoService.createAluno(alunoDTO);
	}
}
