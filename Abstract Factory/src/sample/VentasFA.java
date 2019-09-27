package sample;


public class VentasFA implements ColorConexionFA, AbstractFactory {
    @Override
    public void leer(String url) {
        System.out.println("has vendido" + url);
    }

    @Override
    public creador getcreador(String geometria) {
        return null;
    }

    @Override
    public AbstractFactory getUrl(String url) {
        return null;
    }

}
