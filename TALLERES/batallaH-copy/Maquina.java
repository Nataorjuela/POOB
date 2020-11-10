
public abstract class Maquina {
    private Ubicacion ubicacion;
    private boolean destruida;
    public abstract boolean esDebil();

    public void destruir(){
        destruida = true;
    }

    public boolean estaDestruida(){
        return destruida;
    }
}
