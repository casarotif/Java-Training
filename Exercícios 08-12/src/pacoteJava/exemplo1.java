package pacoteJava;

import java.util.Scanner;

public class exemplo1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int[] array1 = {2, 4, 2, 4, 7, 0, 8, 2};
		int[] array2 = {1,4,7,8};
		
		float [] nota = new float [5];
		
		//tamanho:
		if(array2.length >8)
		{
			System.out.println("Tamanho do array 2 é maior que 8 ");
		}
		else
		{
			System.out.println("Tamanho do array é menor que 8");
		}
		System.out.println("\nTamanho do array 1= "+array1.length);
		
		//for - each
		String[] cars = {"Volvo"," ", "Fiat", "GM"};
		
		for(String i: cars)
		{
			System.out.println(i);			
		}
		//popular o array
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i] = ler.nextFloat();
		}
		
		//visualizar o array
		for(int i=0;i<5;i++);
		{
			System.out.println("Nota "+i+1+"="+nota[i]);
		}
			
		
	}

}
