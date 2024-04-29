public class Square extends shape {
    private int ancho=0;
    public Square(int ancho){
        this.ancho=ancho;
    }
    public int getAltura() {
        return ancho;
    }
    public void setAltura(int newaltura) {
        ancho=newaltura;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int newancho) {
        ancho = newancho;
    }
    
    public float getArea() {
        return getAltura()*getAncho();
    }
    public float getPerimetro(){
        return (2*getAltura())+(2*getAncho());
    }
    }
    

