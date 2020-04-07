package aplicatia3;

public class Fir3 extends Thread{
    private Object P8;

    Fir3(Object P8){
        this.P8=P8;
    }
    public void run() {
        try {
            for (;;) {
                System.out.println("P4");
                synchronized (P8) {
                    System.out.println("P5");
                    int temp = (int) (Math.random() * (7 - 5 + 1) + 5);
                    for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                        i++;
                        i--;
                    }
                    System.out.println("P5 end");

                }
                System.out.println("P6");
                Thread.sleep(6000);
                System.out.println("P7");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
