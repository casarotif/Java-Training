package pacoteJava;

import java.util.Scanner;

public class exemplo3 {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		
		
		do
		{
			System.out.printf("Digite sua idade: ");
		      idade=ler.nextInt();
			System.out.printf("\nSua idade � %d", idade);
			
			if(idade>=18)
			{
				System.out.printf("\nvoc� � de maior!");
						}
				else
				{
					System.out.printf("\nvoc� � de menor!");
				}
		}
		while(idade>=1);
			
				
	}

}
