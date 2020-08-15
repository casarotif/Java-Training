package pacote2;

public class classeAviao {
	
	String modelo;
	String passageiros;
	int altitude, velocidadeVento;
	
	void voa()
	{
		System.out.println("Decolagem com sucesso!");
	}
	
	void sobe(int quantidade)
	{
		int altitudeNova =(this.altitude+quantidade);
		this.altitude=altitudeNova;	
		
	}
	
	{
		if(this.altitude<0)
		{
			System.out.println("O AVIÃO CAIU!!!!!!!!!!!!");
		}
		if(this.altitude == 0)
		{
			System.out.println("O avião está pousado.");
		}
		if(this.altitude > 1)
		{
			System.out.println("O avião decolou.");
		}
		System.out.println("O avião está em voo.");
		
	}
	
	void velo(int quantidade)
	
	{
		int veloNova = velocidadeVento + quantidade;
		
		
		if(this.velocidadeVento >=1 && this.velocidadeVento<800)
		{
			System.out.println("Velocidade aceitavel");
		}
		if (this.velocidadeVento >=800)
		{
			System.out.println("Velocidade acima do normal");
		}
		else
		{
		System.out.println("Segue o voo");
		}
	}
	
	void pousa()
	{
		System.out.println("O avião pousou com sucesso!");
	}

}
