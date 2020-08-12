package pacoteJava;

import java.util.*;

public class ex4 {
	public static void main(String args[]) 
	{
		int idade, sexo, fp, contpc = 0, contmn = 0, contha = 0,contoc = 0, contpn40 = 0, contpc18 = 0, x=1;
		
		Scanner ler = new Scanner(System.in);
		
		while (x<=6)
		{
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.printf("Digite seu sexo: \n1--Mulher \n2--Homem \n3--Outros: ");
			sexo = ler.nextInt();
			System.out.printf("Digite seu fator psicologico: \n1--Calmo \n2--Nervoso \n3--Agressivo: ");
			fp = ler.nextInt();
			
			if(fp==1)
			{
				contpc++;
			}
			if(sexo == 1 && fp == 2)
			{
				contmn++;
			}
			if(sexo == 2 && fp == 3)
			{
				contha++;
			}
			if(sexo == 3 && fp ==1)
			{
				contoc++;
			}
			if(fp == 2 && idade>=40)
			{
				contpn40++;
			}
			if(fp == 1 && idade<=18)
			{
				contpc18++;
			}
			x++;
			
		}
		
	System.out.println("\nPessoas calmas: "+contpc);
	System.out.println("\nMulheres nervosas: "+contmn);
	System.out.println("\nHomens agressivos: "+contha);
	System.out.println("\nOutros calmos: "+contoc);
	System.out.println("\nPessoas nervosas com mais de 40 anos: "+contpn40);
	System.out.println("\nPessoas calmas com menos de 18 anos: "+contpc18);
		
		
		
	}
}
