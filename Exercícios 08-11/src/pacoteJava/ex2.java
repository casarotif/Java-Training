package pacoteJava;

import java.util.Scanner;

public class ex2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int num, contpar=0, contimp=0;
		for(int x=1;x<=10;x++)
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			if(num%2==0)
			{
				contpar++;
			}
			else
			{
				contimp++;
			}
			
			System.out.println("Pares: "+contpar);
			System.out.println("Impares: "+contimp);
			
		}
		
	}

}
