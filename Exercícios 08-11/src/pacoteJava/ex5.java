package pacoteJava;

import java.util.*;

public class ex5 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x, soma=0;
		
		do 
		{
			System.out.printf("Digite um número: ");
			x = ler.nextInt();
			
			soma = soma+x;	
			
			
		}
		while(x!=0);
				
		System.out.println(soma);
	}

}
