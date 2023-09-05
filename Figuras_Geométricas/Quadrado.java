package FormasGeometricas;

public class Quadrado extends Quadrilateros
{
	public Quadrado() {};
	public Quadrado(double lado)
	{
		super(lado, lado, lado, lado);
	}
		

	public double area() 
	{
		double area = super.getLado1() * super.getLado1();
		return area;
	}
	
	public String toString()
	{
		return super.getLado1() + " ";
	}

}
