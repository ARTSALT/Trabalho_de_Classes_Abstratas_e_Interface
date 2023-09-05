package FormasGeometricas;

public class Circulo implements FiguraGeometrica
{
	private double raio;
	
	
	public Circulo() {};
	public Circulo(double raio)
	{
		setRaio(raio);
	}
	
	
	public double perimetro() 
	{
		double perimetro = 2 * 3.14159 * getRaio();
		return perimetro;
	}

	public double area() 
	{
		double area = 3.14159 * getRaio() * getRaio();
		return area;
	}
	
	
	public void setRaio(double raio) 
	{
		if (raio > 0)
			this.raio = raio;
		else
			throw new NoValueException("Valor Inválido");
	}
	
	public double getRaio() 
	{return raio;}	
	
	public String toString()
	{
		return getRaio() + " ";
	}
}
