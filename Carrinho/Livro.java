public class Livro extends Produto
{
    String autor;

    public Livro(String autor, String descricao)
    {
        setDescricao(descricao);
        setAutor(autor);
    }

    public void setAutor(String autor)
    {
        if (autor != null && autor != "")
        {
            this.autor = autor;
        }
        else
        {
            System.out.println("Insira um nome de autor válido");
        }
    }

    public String getAutor()
    {return this.autor;}

    public String getDescricao()
    {return this.autor + " " + this.Descricao;}

    public String getCategoria()
    {return "Livraria";}
}