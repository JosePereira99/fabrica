package pt.isec.fabrica.Module;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class Produtos {
    private final int nSerie;
    private final LocalDateTime dataFabrico;

    private String estado;

    protected Produtos(int numSerie){

        this.nSerie=numSerie;
        this.dataFabrico=LocalDateTime.now();
        this.estado="não testado";
    }
    public int getNumeroSerie() {
        return nSerie;
    }

    public LocalDateTime getDataFabrico() {
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
