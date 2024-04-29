import java.lang.Math;
public class Circle extends shape{
    private int radio=0;
     public Circle(int radio){
        this.radio=radio;
     }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int newradio) {
        radio = newradio;
    }

    public float getArea() {
        float area=(float)((getRadio()*getRadio())*Math.PI);
        return area;
    }

    public float getPerimetro() {
        float perimetro=(float)(2*Math.PI*getRadio());
        return perimetro;
    }

    }
