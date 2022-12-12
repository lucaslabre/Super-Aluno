package superaluno.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno")
	private Integer idAluno;
	
	@Column(name = "nome_aluno")
	private String nomeAluno;
	
	@Column(name = "email_aluno")
	private String emailAluno;
	
	@Column(name = "cpf_aluno")
	private String cpfAluno;
	
	@Column(name = "contatoAluno")
	private String contatoAluno;

	public AlunosEntity() {
		super();
	}

	public AlunosEntity(Integer idAluno, String nomeAluno, String emailAluno, String cpfAluno, String contatoAluno) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.cpfAluno = cpfAluno;
		this.contatoAluno = contatoAluno;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getContatoAluno() {
		return contatoAluno;
	}

	public void setContatoAluno(String contatoAluno) {
		this.contatoAluno = contatoAluno;
	}
	
}
