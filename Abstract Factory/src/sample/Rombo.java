package sample;

public class Rombo implements creador {

    private String rombo;

    public Rombo()
    {
        this.rombo = "Rombo";
    }

    @Override
    public void creado() {
        System.out.println("Rombo creado");
    }

    @Override
    public void nocreado() {
    System.out.println("Rombo no creado");
    }
}
