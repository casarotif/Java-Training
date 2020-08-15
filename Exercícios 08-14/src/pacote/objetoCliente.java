package pacote;

public class objetoCliente {
	public static void main (String args[])
	{
		classeCliente Cliente = new classeCliente("Augusto Barbas", "000-223", "Rua Augusta 323", "2092-2394", "abarbas@gmail.com");
		System.out.println("nome e conta do cliente: "+Cliente.getInfo());
		System.out.println("endereço, telefone e e-mail: "+Cliente.getLocal());
		

		
				
		
		
	}

}
