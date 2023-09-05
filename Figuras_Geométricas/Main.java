package FormasGeometricas;

import java.util.Scanner;
import java.util.ArrayList;


public class Main 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		
		System.out.println("Quantas formas geométricas você gostaria de gerar?");
		int numeroFiguras = scanner.nextInt();
		
		//Posso adicionar um try-catch dentro do loop que pedirá por uma nova figura caso o usuário 
		//infrinja a integridade dos arquivos.
		for (int i = 0; i < numeroFiguras; i++)
		{
			System.out.println("O que você gostaria que fosse a " + (i+1) + "° figura, um quadrado[1]" + 
					", um retângulo[2] ou um círculo[3]?");
			int figura = scanner.nextInt();
			try
			{
				switch(figura)
				{
					case (1):
					{
						System.out.println ("Agora informe o valor do lado");
						double lado = scanner.nextDouble();
						
						lista.add(new Quadrado(lado));
						
						break;
					}
					case (2):
					{
						System.out.println ("Agora informe o valor da base e da altura, respectivamente");
						double base = scanner.nextDouble();
						double altura = scanner.nextDouble();
						
						lista.add(new Retangulo(base, altura));
						
						break;
					}
					case (3):
					{
						System.out.println ("Agora informe o valor do raio");
						double raio = scanner.nextDouble();
						
						lista.add(new Circulo(raio));
						
						break;
					}
					default:
					{
						System.out.println("seleção inválida, insira um número seleção válido\n");
						i--;
						
						break;
					}
				}
			}
			catch (NoValueException e)
			{
				System.out.println("Erro: " + e);
			}
			
		}
		
		for (int i  = 0; i < numeroFiguras; i++)
		{
			System.out.println("\nValor(es) da figura " + (i+1) + ": " + lista.get(i));
		}
		
		System.out.println("\n");
		
		for (int i  = 0; i < numeroFiguras; i++)
		{
			System.out.println("\nPerímetro da figura " + (i+1) + ": " + lista.get(i).perimetro());
		}
		
		System.out.println("\n");
		
		for (int i  = 0; i < numeroFiguras; i++)
		{
			System.out.println("\nÁrea da figura " + (i+1) + ": " + lista.get(i).area());
		}
		
		scanner.close();
	}
}
