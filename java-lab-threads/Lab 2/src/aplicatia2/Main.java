package aplicatia2;

public class Main {
    public static void main(String[] args) {
        Object P9=new Object();
        Object P10=new Object();
        Fir1 fir1=new Fir1(P9,P10);
        Fir2 fir2=new Fir2(P9,P10);

        fir1.start();
        fir2.start();
    }
}
