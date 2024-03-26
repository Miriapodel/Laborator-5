package imutabile;

public class ApplicationGhiozdan {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple", "MacBook Pro");
        Ghiozdan ghiozdan = new Ghiozdan(laptop);

        System.out.println(ghiozdan);

        laptop.setModel("MacBook Air");

        System.out.println(ghiozdan);
    }
}
