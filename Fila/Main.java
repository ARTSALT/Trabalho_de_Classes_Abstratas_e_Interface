package Fila;

public class Main 
{
	public static void main (String args[])
	{
		Fila<Integer> a = new FilaPadrao<Integer>();
		
		System.out.println(a.isEmpty() + "\n");
		
		for (int i = 0; i < 10; i++)
		{
			a.add(i);
		}
		
		System.out.println(a.isFull() + "\n");
		
		System.out.println(a.to_String() + "\n");
		
		a.remove();
		
		System.out.println(a.to_String() + "\n");
	}
}
