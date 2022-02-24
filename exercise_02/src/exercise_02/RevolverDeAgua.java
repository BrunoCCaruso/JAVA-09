package exercise_02;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver(){
        this.posicionActual=(int)(Math.random()*6);
        this.posicionAgua=(int)(Math.random()*6);

    }

    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            return true;
        } else {
            return false;
        }
    }



    public void siguienteChorro(){
        if(this.posicionActual==5){
            this.posicionActual = 0;
        }else{
            this.posicionActual++;
        }

    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" +
                "posicionActual=" + posicionActual +
                ", posicionAgua=" + posicionAgua +
                '}';
    }
}
