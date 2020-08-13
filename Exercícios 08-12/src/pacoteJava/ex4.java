package pacoteJava;

import java.util.*;

public class ex4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		float valor;
		int opç;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("matriz 1: ");
				matriz1[i][j]= ler.nextFloat();
				System.out.println("matriz 2: ");
				matriz2[i][j]= ler.nextFloat();
			}
		}
		System.out.println("1 - soma das matrizes\n2 - subtração das matrizes \n3 - adicionar uma constante nas matrizes \n4 - matrizes: ");
		opç=ler.nextInt();
		switch(opç)
		{
		case 1:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz3[i][j] = matriz1[i][j]+matriz2[i][j];
					System.out.println("soma das matrizes: "+matriz3[i][j]);
				}
			}
			break;
		case 2:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz3[i][j] = matriz2[i][j]-matriz1[i][j];
					System.out.println("subtração das matrizes: "+matriz3[i][j]);
				}
			}
			break;
			
		case 3:
			System.out.println("digite um valor: ");
			valor = ler.nextFloat();
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz1[i][j] = matriz1[i][j] + valor;
					System.out.println("matriz 1: "+matriz1[i][j]);
					matriz2[i][j] = matriz2[i][j] + valor;
					System.out.println("matriz 2: "+matriz2[i][j]);
					
				}
			}
			break;
		case 4:
			System.out.println("digite um valor: ");
			valor = ler.nextFloat();
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matriz1[i][j] = matriz1[i][j] + valor;
					System.out.println("matriz 1: "+matriz1[i][j]);
					matriz2[i][j] = matriz2[i][j] + valor;
					System.out.println("matriz 2: "+matriz2[i][j]);
					
				}
			}
			break;
			default:
			System.out.println("opção invalida!");
		}
		
	}

}
