package pacote2;

public class objetoAviao {

	public static void main (String args[])
	{
		classeAviao biplano = new classeAviao();
		biplano.modelo = "Boeing Stearman 1944";
		biplano.passageiros = "Piloto e Co-piloto";
		biplano.altitude = 0;
		biplano.velocidadeVento = 34;
		
		
		biplano.sobe(0);
		{
		biplano.voa();
		}
		System.out.println("\nO "+biplano.modelo+" ganha mais "+biplano.altitude+" metros de altitude.");
		biplano.velo(4242);
		
		
		
		
		
	}

}
