package pacoteJava;

import java.util.*;

public class exemplo2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int [][] matriz = new int[3][3];
		
		System.out.println("Matriz M[3][3] \n");
		
		for (int linha =0 ; linha < 3; linha++)
		{
			for (int coluna = 0 ; coluna < 3; coluna++)
			{
				System.out.printf("insira o elemento M[&d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna] = ler.nextInt();
			}	
		}
		
		System.out.println("\nA matriz ficou: \n");
		for(int linha = 0; linha <3; linha++)
		{
			for(int coluna = 0 ; coluna < 3; coluna++)
			{
				System.out.printf("\t &d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
				
	}
}
