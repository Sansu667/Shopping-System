import java.util.Comparator;

public class Compra  implements Comparable<Compra> {
    private double value;
    private String description;

    public Compra(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "value=" + value +
                ", description='" + description;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otraCompra.getValue()));
    }
}
