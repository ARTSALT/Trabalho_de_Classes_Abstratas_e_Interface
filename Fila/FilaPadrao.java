package Fila;

public class FilaPadrao <A> implements Fila <A>
{
	@SuppressWarnings("unchecked")
	A[] fila = (A[]) new Object[10];
	
	
	@Override
	public void add(A adicao)
	{
		for(int i = 0; i <= fila.length - 1; i++)
		{
			if (fila[i] == null)
			{
				fila[i] = adicao;
				break;
			}
		}
	}

	
	@Override
	public void remove() 
	{
		//int i = fila.length - 1; i >= 0; i--
		for(int i = 0; i < fila.length - 1; i++)
		{
			if (fila[i] != null)
			{
				fila[i] = null;
				break;
			}
		}
	}

	
	@Override
	public boolean isEmpty() 
	{
		boolean a = true;
		
		for (int i  = 0; i < fila.length - 1; i++)
		{
			if (fila[i] != null)
			{
				a = false;
			}
		}
		
		return a;
	}

	
	@Override
	public boolean isFull() 
	{
		boolean a = true;
		
		for (int i = 0; i < fila.length - 1; i++)
		{
			if (fila[i] == null)
			{
				a = false;
			}
		}
		
		return a;
	}

	
	public String to_String()
	{
		return "[" + fila[0] + "]" + " " + "[" + fila[1] + "]" + " " + "[" + fila[2] + "]" + 
				" " + "[" + fila[3] + "]" + " " + "[" + fila[4] + "]" + " " + "[" + fila[5] + "]" 
				+ " " + "[" + fila[6] + "]" + " " + "[" + fila[7] + "]" + " " + "[" + fila[8] + "]" 
				+ " " + "[" + fila[9] + "]";
	}
}
