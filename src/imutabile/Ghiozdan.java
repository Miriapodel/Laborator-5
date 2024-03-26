package imutabile;

import java.util.Objects;

public final class Ghiozdan {

    private final Laptop laptop;

    public Ghiozdan(Laptop laptop) {
        this.laptop = new Laptop(laptop);
    }

    public Laptop getLaptop() {
        return new Laptop(laptop);
    }

    @Override
    public String toString() {
        return "Ghiozdan{" +
                "laptop=" + laptop +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ghiozdan ghiozdan = (Ghiozdan) o;
        return Objects.equals(laptop, ghiozdan.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(laptop);
    }
}
