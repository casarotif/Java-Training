/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package pacoteJava;

import java.util.*;


public class ex3 {
	public static void main(String args[])
	{
		int idade, totalunder = 0, totalover = 0;
				
		Scanner ler = new Scanner(System.in);
		System.out.printf("Idade: ");
		idade = ler.nextInt();
		
		while(idade >=1)
		{
			if(idade<=21)
			{
				totalunder++;
			}
			if(idade>50)
			{
				totalover++;
			}
			idade=ler.nextInt();
			
			
		}
			System.out.printf("\nPessoas com menos de 21: %d", totalunder);	
			System.out.printf("\nPessoas com mais de 50: %d", totalover);
		
	}

}
