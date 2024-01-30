package br.com.vainaweb.backendt1.quadrodefuncionarios;

public interface ColaboradorController {

	void Visualizar();
	
	void Aumento(float salario);
	void CalculoFGTS(float salario);
	void DecimoTerceiro(float salario);
	void ValeTransporte();
	void ValeAlimentacao();
	void ValeRefeicao();
	
}
