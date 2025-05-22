public abstract class Imovel{
    private  Double area;
    private  int qntQuartos;
    private  Double precoCompra;

    public Imovel(Double area, int qntQuartos, Double precoCompra){
        this.area = area;
        this.precoCompra = precoCompra;
        this.qntQuartos = qntQuartos;
    }

    public void setArea(Double area){
        this.area = area;
    }

    public Double getArea(){
        return this.area;
    }

    public void setQntQuartos(int qntQuartos){
        this.qntQuartos = qntQuartos;
    }

    public int getQntQuartos(){
       return this.qntQuartos;
    }

    
    public void setPrecoCompra(Double precoCompra){
        this.precoCompra = precoCompra;
    }

    public Double getPrecoCompra(){
        return this.precoCompra;
    }
    public abstract Double PrecoVenda();
}
