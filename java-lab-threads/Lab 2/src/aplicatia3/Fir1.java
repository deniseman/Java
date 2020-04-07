package aplicatia3;

public class Fir1 extends Thread{
    private Object P8;

    Fir1(Object P8){
        this.P8=P8;
    }
    public void run() {
        try {
            for (;;) {
                System.out.println("P17");
                synchronized (P8) {
                    System.out.println("P18");
                    int temp = (int) (Math.random() * (6 - 3 + 1) + 3);
                    for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                        i++;
                        i--;
                    }
                    System.out.println("P18 end");
                }
                System.out.println("P19");
                Thread.sleep(5000);
                System.out.println("P20");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
