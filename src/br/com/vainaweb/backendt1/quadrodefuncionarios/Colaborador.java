package br.com.vainaweb.backendt1.quadrodefuncionarios;

public abstract class Colaborador {
	
	//Atributos
	protected int numeroMatricula ;
	protected String dataContratacao;
	protected String nome;
	protected String cpf;
	protected int idade;
	protected String genero;
	protected int conducoes;
	protected boolean isAtivo = true;
	protected String modeloContratacao;
	protected String habilidadeTecnica;
	protected float salario;
	
	//Construtores	
	public Colaborador(int numeroMatricula, String dataContratacao, String nome, String cpf, int idade,
			String genero, int conducoes, String modeloContratacao, String habilidadeTecnica, float salario) {
		super();
		this.numeroMatricula = numeroMatricula;
		this.dataContratacao = dataContratacao;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.conducoes = conducoes;
		this.modeloContratacao = modeloContratacao;
		this.habilidadeTecnica = habilidadeTecnica;
		this.salario = salario;
	}
	
	//Métodos
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public String getModeloContratacao() {
		return modeloContratacao;
	}
	public void setModeloContratacao(String modeloContratacao) {
		this.modeloContratacao = modeloContratacao;
	}
	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}
	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
