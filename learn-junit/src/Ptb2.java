
public class Ptb2 extends Ptb1 {
    //ax^2 + bx + c = 0
    private float c;

    public Ptb2(float a, float b, float c) {
        super(a, b);
        this.c = c;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public String kqPtb2() {
        float a = this.getA();
        float b = this.getB();
        if (a == 0 && b != 0 && c != 0) {
            this.setA(b);
            this.setB(c);
            return super.kqPtb1();
        }
        if (a != 0) {
            double delta = (double) b * b - 4 * a * c;
            if (delta > 0) {
                return Float.toString((float) ((-b + Math.sqrt(delta))) / (2 * a))
                        + " & " + Float.toString((float) ((-b - Math.sqrt(delta))) / (2 * a));
            } else if (delta < 0) {
                return "Phuong trinh vo nghiem";
            } else {
                return Float.toString(-b/(2*a));
            }
        }
        return "Khong xac dinh";
    }

}
