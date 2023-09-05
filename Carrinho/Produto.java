public abstract class Produto
{
    private double preco;
    private String descricao;

    public void setPreco(double preco)
    {
        if (preco > 0)
        {
            this.preco = preco;
        }
        else
        {
            System.out.println("Insira um preco válido");
        }
    }

    public double getPreco()
    {return this.preco;}

    public void setDescricao(String descricao)
    {
        if (descricao != null && descricao != "")
        {
            this.descricao = descricao;
        }
        else
        {
            System.out.println("Insira uma descricao válida");
        }
    }

    public String getDescricao()
    {return this.Descricao;}

    public abstract String getCategoria();
}