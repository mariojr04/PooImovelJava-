public class Apartamento extends Imovel{

    private Boolean piscina;

    public Apartamento(Double area, int qntQuartos, Double precoCompra, Boolean piscina){
        super( area,  qntQuartos,  precoCompra);
        this.piscina = piscina;
    } 

    public void setPiscina(Boolean piscina){
        this.piscina = piscina;
    }

    public Boolean getPiscina(){
        return this.piscina;
    }

    public Double ValorImovel(Double area, Boolean piscina){
        if (area > 30 && piscina){
            return this.getPrecoCompra() * 0.5;
        } else {
            return this.getPrecoCompra() * 0.1;
        }
    }
}
