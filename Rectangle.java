public class Rectangle extends Square{
    private int altura=0;
    public Rectangle(int altura, int ancho){
        super(ancho);
        this.altura=altura;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int newaltura) {
        altura = newaltura;
    }

    public float getArea() {
      return getAltura()*getAncho();
    }
    }

