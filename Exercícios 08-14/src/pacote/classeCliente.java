package pacote;

public class classeCliente {
	String nome;
	String conta;
	String endereço;
	String telefone;
	String email;
	
	public classeCliente (String nomeDoCliente, String contaBanc, String endereçoCliente, String telContato, String eMail)
	{
		nome = nomeDoCliente;
		conta = contaBanc;
		endereço = endereçoCliente;
		telefone = telContato;
		email = eMail;
	}
	
	public String getInfo()
	{
		String Info = "\n"+nome+ "\n" +conta+ "\n";
		return Info;
	}
	
	public String getLocal()
	{
		String Local = "\n"+endereço+ "\n" +telefone+ "\n" +email;
		return Local;
		
	}

}
