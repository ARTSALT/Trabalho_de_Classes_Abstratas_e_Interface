package FormasGeometricas;

public abstract class Quadrilateros implements FiguraGeometrica
{
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Quadrilateros() {};
	public Quadrilateros(double lado1, double lado2, double lado3, double lado4)
	{
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
		setLado4(lado4);
	}
	
	public double perimetro() 
	{
		double perimetro =  getLado1()+ getLado2() + getLado3() + getLado4();
		return perimetro;
	}

	public abstract double area();
	

	public void setLado1(double lado1)
	{
		if (lado1 > 0)
			this.lado1 = lado1;
		else
			throw new NoValueException("Valor Inválido");
	}
	
	public double getLado1()
	{return lado1;}
	
	public void setLado2(double lado2)
	{
		if (lado2 > 0)
			this.lado2 = lado2;
		else
			throw new NoValueException("Valor Inválido");
	}
	
	public double getLado2()
	{return lado2;}
	
	public void setLado3(double lado3) 
	{
		if (lado3 > 0)
			this.lado3 = lado3;
		else
			throw new NoValueException("Valor Inválido");
	}
	
	public double getLado3()
	{return lado3;}
	
	public void setLado4(double lado4) 
	{
		if (lado4 > 0)
			this.lado4 = lado4;
		else
			throw new NoValueException("Valor Inválido");
	}
	
	public double getLado4()
	{return lado4;}

}
