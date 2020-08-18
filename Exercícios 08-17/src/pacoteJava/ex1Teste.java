package pacoteJava;

public class ex1Teste {
	public static void main(String args[])
	{
		ex1Pessoa Jussara = new ex1Pessoa("Jussara","Rua Augusta, 82","2304-2482");
		ex1Fornecedor Helio = new ex1Fornecedor("Helio", "Avenida Lauros,310", "2008-0293",33.40, 40.50, 0);
		System.out.printf("Nome do Fornecedor: "+Helio.getNome());
		System.out.printf("\nEndereço do Fornecedor 1: "+Helio.getEndereço());
		System.out.printf("\nTelefone do cliente 1: "+Jussara.getTelefone());	
		
	}

}
