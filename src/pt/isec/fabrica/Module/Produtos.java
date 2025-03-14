package pt.isec.fabrica.Module;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class Produtos {
    private final int nSerie;
    private final LocalDate dataFabrico;

    private String estado;

    protected Produtos(int numSerie){

        this.nSerie=numSerie;
        this.dataFabrico= LocalDate.now();
        this.estado="não testado";
    }
    protected boolean testaUnidade(){
        if(this.estado=="aprovado")return true;
        if(this.estado=="não testado"){
            int luck= (int)(Math.random()*101)+1;
            if(luck<=90){
                this.estado="aprovado";
                return true;
            }else{
                this.estado="reprovado";
                return false;
            }
        }
        return false;
    }
    public int getNumeroSerie() {
        return nSerie;
    }

    public LocalDate getDataFabrico() {
        return dataFabrico;
    }

    public String getEstado() {
        return estado;
    }
    @Override
    public String toString(){
        return "Produto["+ "nSerie: "+ getNumeroSerie() +
                ", dataFabrico:(" +getDataFabrico()+
                "), estado: "+getEstado()+"]\n";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produtos produto = (Produtos) obj;
        return nSerie == produto.nSerie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nSerie);
    }
}
