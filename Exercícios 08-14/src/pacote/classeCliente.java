package pacote;

public class classeCliente {
	String nome;
	String conta;
	String endere�o;
	String telefone;
	String email;
	
	public classeCliente (String nomeDoCliente, String contaBanc, String endere�oCliente, String telContato, String eMail)
	{
		nome = nomeDoCliente;
		conta = contaBanc;
		endere�o = endere�oCliente;
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
		String Local = "\n"+endere�o+ "\n" +telefone+ "\n" +email;
		return Local;
		
	}

}
