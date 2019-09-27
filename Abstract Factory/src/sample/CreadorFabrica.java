package sample;

public class CreadorFabrica implements AbstractFactory{
    // Devolver una instancia segun lo solicitado
    // getcreador = getShape seria para obtener figura en mi caso el creador
    public creador getcreador(String geometria){

        if (geometria.equalsIgnoreCase("Rombo")){

            return new Rombo();

        }else if(geometria.equalsIgnoreCase("Triangulo")){
                return new Triangulo();
        }

        return null;
        }

    @Override
    public AbstractFactory getUrl(String url) {
        return null;
    }

    }


