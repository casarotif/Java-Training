package pacoteJava;

import java.util.*;

public class ex2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[6],somapar = 0, quantimpar = 0;
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Digite um valor: ");
			vetor[x] = ler.nextInt();
			if(vetor[x]%2==0)
			{
				System.out.println("Par: "+vetor[x]);
				somapar=somapar+vetor[x];
			}
			else
			{
				System.out.println("Impar: "+vetor[x]);
				quantimpar++;
			}
			
		}
		System.out.println("Soma de pares: "+somapar);
		System.out.println("Quantidade de impares: "+quantimpar);
		
		
	}

}
