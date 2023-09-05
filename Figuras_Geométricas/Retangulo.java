package FormasGeometricas;

public class Retangulo extends Quadrilateros
{	
	public Retangulo() {};
	public Retangulo(double base, double altura)
	{
		super(base, altura, base, altura);
	}
	
	
	
	public double area() 
	{
		double area = (super.getLado1() * super.getLado2())/2;
		return area;
	}

	
	public String toString()
	{
		return super.getLado1() + ", " + super.getLado2();
	}
}
