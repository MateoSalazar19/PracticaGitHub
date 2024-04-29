public class elipse extends Circle{
    private int radio2=0;

    public elipse(int radio, int radio2){
        super(radio);
        this.radio2=radio2;
    }
    public int getRadio2() {
        return radio2;
    }

    public void setRadio2(int newradio2) {
        radio2 = newradio2;
    }
    public float getArea() {
        return (float)(Math.PI*getRadio()*getRadio2());
    }
    public float getPerimetro(){
        float raiz=(float)Math.sqrt(((3*getRadio())+getRadio2())*(getRadio()+(3*getRadio2())));
        float perimetro=(float)(Math.PI*(3*(getRadio()+getRadio2())-(raiz)));
        return perimetro;
    }
}
