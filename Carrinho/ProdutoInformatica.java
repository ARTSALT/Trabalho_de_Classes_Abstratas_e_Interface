class ProdutoInformatica extends Produto
{
    String tipo;

    public ProdutoInformatica(String tipo, String descricao)
    {
        setDescricao(descricao);
        setTipo(tipo);
    }

    public void setTipo(String tipo)
    {
        if (tipo != null && tipo != "")
        {
            this.tipo = tipo;
        }
        else
        {
            System.out.println("Insira um tipo válido");
        }
    }

    public String getDescricao()
    {return this.tipo + " " + this.Descricao;}

    public String getCategoria()
    {return "Informática";}
}