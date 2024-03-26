package imutabile;

import java.util.Objects;

public class Laptop {

    private String marca;
    private String model;

    public Laptop(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public Laptop(Laptop laptop){
        this.marca = laptop.getMarca();
        this.model = laptop.getModel();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(marca, laptop.marca) && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, model);
    }

    @Override
    public String toString() {
        return
                "Marca = " + marca + '\'' +
                ", Model = " + model + '\'';
    }
}
