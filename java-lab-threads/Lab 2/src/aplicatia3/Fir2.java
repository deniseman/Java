package aplicatia3;

public class Fir2 extends Thread{
    private Object P8;

    Fir2(Object P8){
        this.P8=P8;
    }
    public void run() {
        try {
            for (;;) {
                System.out.println("P0");
                synchronized (P8) {
                    System.out.println("P1");
                    int temp = (int) (Math.random() * (7 - 4 + 1) + 4);
                    for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                        i++;
                        i--;
                    }
                    System.out.println("P1 end");

                }
                System.out.println("P2");
                Thread.sleep(3000);
                System.out.println("P3");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
