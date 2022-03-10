public class Ptb1 {
    private float a,b;

    public Ptb1(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public String kqPtb1(){
        if(a == 0 && b != 0){
            return "Phuong trinh vo nghiem";
        }
        if(a == 0 && b == 0) {
            return "Phuong trinh vo so nghiem";
        }
        return Float.toString(-b/a);
    }


    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
