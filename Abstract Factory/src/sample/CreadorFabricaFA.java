package sample;

public class CreadorFabricaFA implements AbstractFactory {


    @Override
    public creador getcreador(String geometria) {
        return null;
    }

    @Override
    public AbstractFactory getUrl(String url) {

        if (url.equalsIgnoreCase("ComprasFA")){

            return (AbstractFactory) new ComprasFA();

        }else if(url.equalsIgnoreCase("VentasFA")){
            return new VentasFA();
        }
        return null;
    }
}

