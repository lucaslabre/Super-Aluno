package superaluno.entities.dtos;

import superaluno.entities.AlunosEntity;

public class AlunoEntityDTO {
	
	private Integer idAluno;
	private String nomeAluno;
	private String emailAluno;
	private String cpfAluno;
	private String contatoAluno;
	
	public AlunoEntityDTO() {
		super();
	}
	
	public AlunoEntityDTO(Integer idAluno, String nomeAluno, String emailAluno, String cpfAluno, String contatoAluno) {
		super();
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.cpfAluno = cpfAluno;
		this.contatoAluno = contatoAluno;
	}

	public AlunoEntityDTO(AlunosEntity aluno) {
		super();
		this.idAluno = aluno.getIdAluno();
		this.nomeAluno = aluno.getNomeAluno();
		this.emailAluno = aluno.getEmailAluno();
		this.cpfAluno = aluno.getCpfAluno();
		this.contatoAluno = aluno.getContatoAluno();
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
