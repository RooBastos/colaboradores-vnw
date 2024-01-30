package br.com.vainaweb.backendt1.quadrodefuncionarios;

public class Application {
	
	public static void main(String[] args) {
		Designer designer = new Designer(154, "12/06/2000", "Jamilly Souza", "13490-1", 24, "Feminino", 2, "PJ", "UI/UX", 15000.00f, "Sênior");
		DevBackEnd devbackend = new DevBackEnd(1459, "30/11/1997", "Roberta Bastos Jesus", "11552-2", 26, "Feminino", 3, "CLT", "JAVA", 25000.00f, "Pleno");
		DevFrontEnd devfrontend = new DevFrontEnd(19, "24/04/1991", "José Pedro Nolasco", "11552-2", 33, "Masculino", 4, "CLT", "REACT", 21000.00f, "Pleno");
		Gerente gerente = new Gerente(1343, "15/07/2001", "Roger Neves", "11552-2", 23, "Masculino", 2, "PJ", "Gerencia de Projeto", 62000.00f);
		
		System.out.printf("\n ----------------------------------------------------------------\n");


		designer.Visualizar();
		
		designer.CalculoFGTS(designer.getSalario());
		
		designer.Aumento(designer.getSalario());
		
		designer.DecimoTerceiro(designer.getSalario());


		System.out.printf("\n----------------------------------------------------------------\n");


		devbackend.Visualizar();
		
		devbackend.CalculoFGTS(devbackend.getSalario());
		
		devbackend.Aumento(devbackend.getSalario());
		
		devbackend.DecimoTerceiro(devbackend.getSalario());


		System.out.printf("\n ----------------------------------------------------------------\n");


		devfrontend.Visualizar();
		
		devfrontend.CalculoFGTS(devfrontend.getSalario());
		
		devfrontend.Aumento(devfrontend.getSalario());
		
		devfrontend.DecimoTerceiro(devfrontend.getSalario());
		

		System.out.printf("\n ----------------------------------------------------------------\n");

		gerente.Visualizar();
		
		gerente.CalculoFGTS(gerente.getSalario());
		
		gerente.Aumento(gerente.getSalario());
		
		gerente.DecimoTerceiro(gerente.getSalario());


		System.out.printf("\n ----------------------------------------------------------------\n");
	}

}
