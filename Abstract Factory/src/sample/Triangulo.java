package sample;

public class Triangulo implements creador {

    private String triangulo;

    public Triangulo()
    {
        this.triangulo = "triangle";
    }

    private String triangle;
    @Override
    public void creado() {
        System.out.println("Triangulo Creado");
    }

    @Override
    public void nocreado() {
        System.out.println("Triangulo no Creado");
    }

}
