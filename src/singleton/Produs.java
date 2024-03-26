package singleton;

import java.util.Objects;

public class Produs {
    String denumire;
    String descriere;

    double pret;

    public Produs(String denumire, String descriere, double pret) {
        this.denumire = denumire;
        this.descriere = descriere;
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return Double.compare(pret, produs.pret) == 0 && Objects.equals(denumire, produs.denumire) && Objects.equals(descriere, produs.descriere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denumire, descriere, pret);
    }

    @Override
    public String toString() {
        return
                "Denumire = " + denumire + '\'' +
                ", Descriere = " + descriere + '\'' +
                ", Pret = " + pret;
    }
}
