package aplicatia4;

public class Main {
    public static void main(String[] args) {
        Object P6 = new Object();
        Object P10 = new Object();

        Fir1 fir1 = new Fir1(P6, P10);
        Fir2 fir2 = new Fir2(P6);
        Fir3 fir3 = new Fir3(P10);

        fir1.start();
        fir2.start();
        fir3.start();

        try {
            fir1.join();
            fir2.join();
            fir3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
