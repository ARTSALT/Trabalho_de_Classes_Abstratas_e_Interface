package Fila;

public interface Fila <A>
{
	public void add(A adicao);
	public void remove();
	public boolean isEmpty();
	public boolean isFull();
	public String to_String();
}
