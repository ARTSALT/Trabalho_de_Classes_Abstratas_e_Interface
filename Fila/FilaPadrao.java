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
			if (fila[i] == null) {
				a = false;
			}
		}
		
		return a;
	}

	
	@Override
	public String to_String()
	{
		String retorno;
		for(int i = 0; i < fila.length - 1; i++) 
		{
			retorno += "[" + fila[i] + "]" + " ";
		}

		return retorno;
	}

}
