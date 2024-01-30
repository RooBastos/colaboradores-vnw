package br.com.vainaweb.backendt1.quadrodefuncionarios;

import java.util.Scanner;

public class Designer extends Colaborador implements ColaboradorController {
	Scanner sc = new Scanner(System.in);
	
	//Atributos
	private String senioridade;

	//Construtores	
	public Designer(int numeroMatricula, String dataContratacao, String nome, String cpf, int idade, String genero, int conducoes,
			String modeloContratacao, String habilidadeTecnica, float salario, String senioridade) {
		super(numeroMatricula, dataContratacao, nome, cpf, idade, genero, conducoes, modeloContratacao, habilidadeTecnica,
				salario);
		this.senioridade = senioridade;
	}
	
	
	//Métodos
	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
	@Override
	public void Visualizar() {
			
			String situacao;
			
			if(isAtivo = true) {
				situacao = "Ativo";
			} else {
				situacao = "Não ativo";
			}
			
			System.out.printf("""
					|------------------------------------|
					      Ficha Técnica - Colaborador
					
					| Dados Pessoais |
					Nome: %s
					CPF: %s
					Idade: %d
					Gênero: %s
					
					| Dados Técnicos |
					Matrícula: %d
					Data de Contratação: %s
					Modelo de Contratação: %s
					Situação: %s
					Salário: %.2f
					
					| Designer |
					Habilidade Técnica: %s
					Senioridade: %s
					
					""", nome, cpf, idade, genero, numeroMatricula, dataContratacao, modeloContratacao, situacao, salario, habilidadeTecnica, senioridade);
		}
	
	@Override
	public void Aumento(float salario) {
		float novoSalario;
		
		novoSalario = (float) (salario * 0.1);
		
		setSalario((novoSalario + salario));
		
		System.out.printf("O colaborador %s ganhou um aumento e passou a receber R$%.2f. \n", nome, (novoSalario + salario));
	}

	@Override
	public void CalculoFGTS(float salario) {
		if(modeloContratacao.equals("CLT")) { 
			float valorFGTS = (float) (salario * 0.8);
		System.out.printf("É recolhido o valor de R$%.2f referente ao FGTS do colaborador %s \n", valorFGTS, nome);
		}
		else {
			System.out.printf("O tipo de contratação do colaborador %s não configura o recebimento de FGTS. \n", nome);
		}	
	}

	@Override
	public void DecimoTerceiro(float salario) {
		if(modeloContratacao.equals("CLT")) { 
			System.out.printf("Quantos meses o coladorador %s trabalhou? \n", nome);
			int mesesTrabalhados = sc.nextInt();
			
			if(mesesTrabalhados <= 0) {
				System.out.printf("O Colaborador %s não tem direito a décimo terceiro. \n", nome);
			} else {
				 float decimoTerceiro;
				 decimoTerceiro = (salario / 12) * mesesTrabalhados;
				 System.out.printf("O colaborador %s receberá R$%.2f de décimo terceiro de acordo com os meses trabalhados. \n", nome, decimoTerceiro);
			}
		} else {
			System.out.printf("O tipo de contratação do colaborador %s não configura o recebimento de Décimo Terceiro. \n", nome);
		}	
	}

	@Override
	public void ValeTransporte() {
		float valeTransporte = (conducoes * 4) * 22;
		System.out.printf("O colaborador %s recebe R$%.2f de Vale Transporte com base em 22 dias trabalhados. \n", nome, valeTransporte);
	}

	@Override
	public void ValeAlimentacao() {
		float valeAlimentacao = 30 * 22;
		System.out.printf("O colaborador %s recebe R$%.2f de Vale Alimentação com base em 22 dias trabalhados e valor diário de R$30,00. \n", nome, valeAlimentacao);

	}

	@Override
	public void ValeRefeicao() {
		float valeRefeicao = 12 * 22;
		System.out.printf("O colaborador %s recebe R$%.2f de Vale Alimentação com base em 22 dias trabalhados e valor diário de R$12,00. \n", nome, valeRefeicao);

	}

	
}
