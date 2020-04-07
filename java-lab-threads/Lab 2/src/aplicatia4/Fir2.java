package aplicatia4;

public class Fir2 extends Thread{
    private Object P6;
    Fir2(Object P6){
        this.P6=P6;
    }

    public void run(){
        try {
            System.out.println("P3");
            synchronized (P6) {
                P6.wait();
            }
            System.out.println("P4");
            int temp = (int) (Math.random() * (5 - 3 + 1) + 3);
            for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                i++;
                i--;
            }
            System.out.println("P4 ends");
            System.out.println("P5");
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
