package pacoteJava;

import java.util.*;

public class ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;

		System.out.printf("Digite sua idade:");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if(idade >=18)
		{
			System.out.printf("\nVoc� � de maior!");		
		}
		else if(idade>=1 && idade<18)
		{
			System.out.printf("\nVoc� � de menor!");
	}
		else
		{
			System.out.printf("\nEntre com uma idade v�lida!");
		}
}
}

