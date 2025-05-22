public class Casa extends Imovel {

    private Boolean quintal;

    public Casa(Double area, int qntQuartos, Double precoCompra, Boolean quintal){
        super( area,  qntQuartos,  precoCompra);    
        this.quintal = quintal;
    }

    public void setQuintal(Boolean quintal){
        this.quintal = quintal;
    }

    public Boolean getQuintal(){
        return this.quintal;
    }
    @Override
    public Double PrecoVenda(){
        if (getQntQuartos > 4 || quintal){
            return getPrecoCompra() * 0.3;
        } else {
            return getPrecoCompra() * 0.15;
        }
    }
}
