package sample;

public class Main2 {

    public static void main(String[] args)
    {CreadorFabrica fabrica = new CreadorFabrica();
    creador cr1 = fabrica.getcreador("Rombo");
    cr1.creado();

    CreadorFabricaFA Bolso = new CreadorFabricaFA();
    AbstractFactory cr2 = Bolso.getUrl("VentasFA");
    cr2.getUrl("");


}}
