import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public CreditCard(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getValue()){
            this.saldo -= compra.getValue();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
